/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package example;

import hu.gerifield.jtransmisslib.Response;
import hu.gerifield.jtransmisslib.TransMan;
import java.util.Scanner;
import org.json.JSONObject;


/**
 *
 * @author Gergely
 */
public class TestApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        
        TransMan tm = new TransMan();
        System.out.print("Password: ");
        Scanner sc = new Scanner(System.in);
        String password = null;
        if(sc.hasNext()){
             password = sc.nextLine();
        }
        tm.init("192.168.0.100", 9091, "http", "torrent", password);
        System.out.println("Init OK.");

        //String res = tm.postRequest("/transmission/rpc", "{ \"method\": \"torrent-get\", \"arguments\": {\"fields\": [\"id\", \"name\"] } }");
        //System.out.println(res);
        
        //tm.getTorrents();
        String keres = tm.genJSONRequest("torrent-get", "id, name,peers");
        System.out.println(keres);
        Response res = tm.postRequest("/transmission/rpc", keres);
        System.out.println("Valasz kód: "+res.getHttpCode()+" Tartalom: "+res);
        //tm.parseResult(res);
        System.out.println("Parsolt: "+tm.jsonResultToArray(res.getResult()));
        
        
        
        /*HttpHost targetHost = new HttpHost("192.168.0.100", 9091, "http");
        
        DefaultHttpClient hc = new DefaultHttpClient();
        hc.getCredentialsProvider().setCredentials(
                new AuthScope(targetHost.getHostName(), targetHost.getPort()),
                new UsernamePasswordCredentials("torrent", "Gergo254!"));
        
        AuthCache authCache = new BasicAuthCache();
        BasicScheme basicAuth = new BasicScheme();
        authCache.put(targetHost, basicAuth);
        
        BasicHttpContext localcontext = new BasicHttpContext();
        localcontext.setAttribute(ClientContext.AUTH_CACHE, authCache);
        
        
        HttpGet hg = new HttpGet("/transmission/rpc");
        
        HttpResponse r = hc.execute(targetHost, hg, localcontext);
        // Get the response
        BufferedReader rd = new BufferedReader
          (new InputStreamReader(r.getEntity().getContent()));
        
        if(r.containsHeader("X-Transmission-Session-Id")){
            System.out.println("SID: "+r.getFirstHeader("X-Transmission-Session-Id").getValue());
        }
        System.out.println("Status: "+r.getStatusLine().getStatusCode());
        
        System.out.println("-----------------------------");
        
        Header h[] = r.getAllHeaders();
        for(int i = 0; i < h.length; i++){
            System.out.println(h[i]);
        }
        System.out.println("-----------------------------");
        String line;
        while ((line = rd.readLine()) != null) {
            System.out.println(line);
        }
        
        
        hc.getConnectionManager().shutdown();
        */
    }
}
