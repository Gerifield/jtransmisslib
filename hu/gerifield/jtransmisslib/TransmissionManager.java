/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.gerifield.jtransmisslib;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import hu.gerifield.jtransmisslib.gsonobj.gettorrent.Response;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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

        Response r = null;
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
