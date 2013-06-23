/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.gerifield.jtransmisslib;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import hu.gerifield.jtransmisslib.gsonobj.gettorrent.TGetResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import org.apache.commons.codec.binary.Base64;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;

/**
 *
 * @author Gergely
 */
public class TransmissionManager {
    private HttpHost targetHost;
    private HttpClient httpclient;
    private String sessionId;
    private String authdata;

    public void init(String host, int port, String protocol, String user, String pass) {
        targetHost = new HttpHost(host, port, protocol);
        //httpclient = new DefaultHttpClient();
        httpclient = new DefaultHttpClient();
        String creds = user + ":" + pass;
        authdata = Base64.encodeBase64String(creds.getBytes());
    }
    
    /**
     * Akció végrehajtása
     * @param action Akció (torrent-start, torrent-start-now, torrent-stop, torrent-verify, torrent-reannounce)
     * @throws IOException 
     */
    public boolean torrentAction(String action){
        return torrentAction(action, null);
    }
    
    
    /**
     * Akció végrehajtása, részeltek:
     * https://trac.transmissionbt.com/browser/trunk/extras/rpc-spec.txt
     * 3.1.  Torrent Action Requests fejezet
     * @param action Akció (torrent-start, torrent-start-now, torrent-stop, torrent-verify, torrent-reannounce)
     * @param ids Azonosító (szám, szám lista, sha1 kód...), vesszővel tagolható
     */
    public boolean torrentAction(String action, String ids){
        JsonObject req = new JsonObject();
        req.addProperty("method", action);
        JsonObject arguments = new JsonObject();

        if(ids != null){
            Scanner sc = new Scanner(ids).useDelimiter(", *");
            JsonArray idsarray = new JsonArray();
            while(sc.hasNext()){
                idsarray.add(new JsonPrimitive(Integer.parseInt(sc.next())));
            }
            arguments.add("ids", idsarray);
        }
        req.add("arguments", arguments);
        
        try{
            String result = postRequest("/transmission/rpc", req.toString());
            TGetResponse r = new Gson().fromJson(result, TGetResponse.class);
            if(r.getResult().equals("success")){
                return true;
            }else{
                return false;
            }
        }catch(IOException e){
            return false;
        }
    }
    
    /**
     * Torrent adatok lekérdezése
     * @param fields Vissza várt értékek, vesszővel tagolva
     * @param id Azonosítókra szűrés, null esetén mindegyik, vesszővel tagolva
     * @return
     * @throws IOException 
     */
    public TGetResponse getTorrentsRequest(String fields, String id) throws IOException{
        JsonObject req = new JsonObject();
        req.addProperty("method", "torrent-get");
        
        JsonObject arguments = new JsonObject();
        Scanner sc = new Scanner(fields).useDelimiter(", *");
        JsonArray argsarray = new JsonArray();
        
        while (sc.hasNext()) {
            argsarray.add(new JsonPrimitive(sc.next()));
        }
        arguments.add("fields", argsarray);
        
        if(id != null){
            sc = new Scanner(id).useDelimiter(", *");
            JsonArray idsarray = new JsonArray();
            while (sc.hasNext()) {
                idsarray.add(new JsonPrimitive(Integer.parseInt(sc.next())));
            }
            arguments.add("ids", idsarray);
        }
        req.add("arguments", arguments);
        
        String result = postRequest("/transmission/rpc", req.toString());
        TGetResponse r = new Gson().fromJson(result, TGetResponse.class);
        return r;
    }
    
    /**
     * Torrent adatok lekérdezése az összes torrentről
     * @param fields Visszavárt paraméterek, vesszővel tagolva
     * @return
     * @throws IOException 
     */
    public TGetResponse getTorrentsRequest(String fields) throws IOException{
        return getTorrentsRequest(fields, null);
    }
    
    
    
    private String postRequest(String URL, String request) throws IOException {

        HttpPost hp = new HttpPost(URL);

        //StringEntity ent = new StringEntity(request, "UTF-8");
        StringEntity ent = new StringEntity(request, HTTP.UTF_8);
        hp.setEntity(ent);

        hp.addHeader("Authorization", "Basic " + authdata);

        if (sessionId != null) {
            hp.addHeader("X-Transmission-Session-Id", sessionId);
        }

        //HttpResponse response = httpclient.execute(targetHost, hp, localcontext);
        HttpResponse response = httpclient.execute(targetHost, hp);

        if (response.getStatusLine().getStatusCode() == 409) {
            EntityUtils.consume(response.getEntity()); //le kell záratni a korábbi kapcsolatot különben:
            //HIBA: Invalid use of BasicClientConnManager: connection still allocated.
            sessionId = response.getFirstHeader("X-Transmission-Session-Id").getValue();
            hp.addHeader("X-Transmission-Session-Id", sessionId);
            //response = httpclient.execute(targetHost, hp, localcontext);
            response = httpclient.execute(targetHost, hp);
        }

        TGetResponse r = null;
        HttpEntity respEnt = response.getEntity();
        StringBuilder sb = new StringBuilder();
        if (respEnt != null) {
            String line;
            //Scanner sc = new Scanner(respent.getContent()).useDelimiter("\\A");
            //BufferedReader reader = new BufferedReader(new InputStreamReader(respEnt.getContent()));
            BufferedReader reader = new BufferedReader(new InputStreamReader(respEnt.getContent(), "UTF-8"));
            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }
            
        }
         
        return sb.toString();
    }
}
