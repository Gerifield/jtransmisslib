/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.gerifield.jtransmisslib;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import org.apache.commons.codec.binary.Base64;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import hu.gerifield.jtransmisslib.gsonobj.gettorrent.Response;
import org.apache.http.protocol.HTTP;

//DOKSI: https://trac.transmissionbt.com/browser/trunk/extras/rpc-spec.txt
/**
 *
 * @author Gergely
 */
public class TransMan {

    private HttpHost targetHost;
    private HttpClient httpclient;
    /*private AuthCache authCache;
     private BasicHttpContext localcontext;*/
    private String sessionId;
    private String authdata;

    public void init(String host, int port, String protocol, String user, String pass) {
        targetHost = new HttpHost(host, port, protocol);
        //httpclient = new DefaultHttpClient();
        httpclient = new DefaultHttpClient();
        String creds = user + ":" + pass;
        authdata = Base64.encodeBase64String(creds.getBytes());
    }

    public String genJSONRequest(String method, String arguments) {
        try {
            JSONObject req = new JSONObject();
            req.put("method", method);
            Scanner sc = new Scanner(arguments).useDelimiter(", *");
            JSONObject args = new JSONObject();
            while (sc.hasNext()) {
                args.append("fields", sc.next());
            }
            req.put("arguments", args);

            return req.toString();
        } catch (JSONException e) {
            return null;
        }
    }

    public ArrayList<HashMap<String, Object>> jsonResultToArray(String res) {
        try {
            JSONObject r = new JSONObject(res);
            if (r.get("result").equals("success")) {
                JSONObject args = r.getJSONObject("arguments");
                //System.out.println("ARGS: "+args);
                JSONArray torrents = args.getJSONArray("torrents");

                JSONObject torrent;
                String key;
                HashMap<String, Object> t;
                ArrayList<HashMap<String, Object>> result = new ArrayList<>();
                for (int i = 0; i < torrents.length(); i++) {
                    torrent = torrents.getJSONObject(i);
                    Iterator it = torrent.keys();
                    t = new HashMap<>();
                    while (it.hasNext()) {
                        key = (String) it.next();
                        //System.out.print(key+" = "+torrent.get(key)+" ");
                        t.put(key, torrent.get(key));
                    }
                    result.add(t);
                    //System.out.println("");
                }
                //System.out.println("Méret: "+result.size()+" "+result);
                return result;

            } else {
                return null;
            }
        } catch (JSONException e) {
            return null;
        }
    }

    public void parseResult(String res) {
        try {
            JSONObject r = new JSONObject(res);
            if (r.get("result").equals("success")) {
                JSONObject args = r.getJSONObject("arguments");
                //System.out.println("ARGS: "+args);
                JSONArray torrents = args.getJSONArray("torrents");

                JSONObject torrent;
                String key;
                HashMap<String, Object> t;
                ArrayList<HashMap<String, Object>> result = new ArrayList<>();
                for (int i = 0; i < torrents.length(); i++) {
                    torrent = torrents.getJSONObject(i);
                    Iterator it = torrent.keys();
                    t = new HashMap<>();
                    while (it.hasNext()) {
                        key = (String) it.next();
                        System.out.print(key + " = " + torrent.get(key) + " ");
                        t.put(key, torrent.get(key));
                    }
                    result.add(t);
                    System.out.println("");
                }
                System.out.println("Méret: " + result.size() + " " + result);


            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void getTorrents() {
        JSONObject req = new JSONObject();
        try {
            req.put("method", "torrent-get");
            JSONObject args = new JSONObject();
            args.append("fields", "id"); //accumulate is jó, de az 1 értéknél putként viselkedik
            args.append("fields", "name");
            req.put("arguments", args);
            System.out.println(req);

        } catch (JSONException e) {
            e.printStackTrace();
        }

        try {
            //String t = postRequest("/transmission/rpc", "{ \"method\": \"torrent-get\", \"arguments\": {\"fields\": [\"id\", \"name\"] } }");
            Response t = postRequest("/transmission/rpc", req.toString());

            JSONObject obj = new JSONObject(t.getResult());
            System.out.println(obj);

            System.out.println(obj.getString("result"));
            JSONArray arr = obj.getJSONObject("arguments").getJSONArray("torrents");
            System.out.println(arr);

            System.out.println("Méret: " + arr.length());
            for (int i = 0; i < arr.length(); i++) {
                System.out.println(i + " " + arr.getJSONObject(i).getString("name"));
            }

        } catch (JSONException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    
    public Response postRequest(String URL, String request) throws IOException {

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

        Response r = null;
        HttpEntity respEnt = response.getEntity();
        if (respEnt != null) {
            String line;
            //Scanner sc = new Scanner(respent.getContent()).useDelimiter("\\A");
            //BufferedReader reader = new BufferedReader(new InputStreamReader(respEnt.getContent()));
            BufferedReader reader = new BufferedReader(new InputStreamReader(respEnt.getContent(), "UTF-8"));
            StringBuilder sb = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }
            JsonObject jso = new JsonParser().parse(sb.toString()).getAsJsonObject();
            System.out.println(jso);
            r = new Gson().fromJson(sb.toString(), Response.class);
            
        }
         
        return r;
    }
    /*public Response postRequest(String URL, String request) throws IOException {

        HttpPost hp = new HttpPost(URL);

        StringEntity ent = new StringEntity(request, "UTF-8");
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

        Response responseObj = new Response();
        responseObj.setHttpCode(response.getStatusLine().getStatusCode());

        HttpEntity respEnt = response.getEntity();
        if (respEnt != null) {
            String line;
            //Scanner sc = new Scanner(respent.getContent()).useDelimiter("\\A");
            BufferedReader reader = new BufferedReader(new InputStreamReader(respEnt.getContent()));
            StringBuilder sb = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }
            responseObj.setResult(sb.toString());
        }

        return responseObj;
    }*/
    /*private void parseHeader(HttpResponse resp){
     if(resp.containsHeader("X-Transmission-Session-Id")){
     sessionId = resp.getFirstHeader("X-Transmission-Session-Id").getValue();
     }
     }*/
}
