/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package example;

import hu.gerifield.jtransmisslib.TransMan;
import hu.gerifield.jtransmisslib.TransmissionManager;
import hu.gerifield.jtransmisslib.gsonobj.gettorrent.Response;
import hu.gerifield.jtransmisslib.gsonobj.gettorrent.Torrent;
import java.util.BitSet;
import java.util.Scanner;

/**
 *
 * @author Gergely
 */
public class TestApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

        //TransMan tm = new TransMan();
        TransmissionManager tm = new TransmissionManager();
        System.out.print("Password: ");
        Scanner sc = new Scanner(System.in);
        String password = null;
        if (sc.hasNext()) {
            password = sc.nextLine();
        }
        tm.init("192.168.0.100", 9091, "http", "torrent", password);
        System.out.println("Init OK.");

        //String res = tm.postRequest("/transmission/rpc", "{ \"method\": \"torrent-get\", \"arguments\": {\"fields\": [\"id\", \"name\"] } }");
        //System.out.println(res);

        //tm.getTorrents();
        //String keres = tm.genJSONRequest("torrent-get", "id, name, peers, trackerStats, torrentFile, pieces, priorities, wanted");
        //String keres = tm.genJSONRequest("torrent-get", "id, name, wanted, pieces", null);
        
        //String keres = tm.genJSONRequest("torrent-get", "id, name, peers, trackerStats, torrentFile, pieces, priorities, wanted", null);
        //System.out.println(keres);
        
        //Response res = tm.postRequest("/transmission/rpc", keres);
        //System.out.println("Valasz kód: " + res.getHttpCode() + " Tartalom: " + res);
        //tm.parseResult(res);
        //System.out.println("Parsolt: " + tm.jsonResultToArray(res.getResult()));
        
        
        //Response r = tm.postRequest("/transmission/rpc", keres);
        //Response r = tm.getTorrents("id, name, peers, trackerStats, torrentFile, pieces, priorities, wanted", null);
        Response r = tm.getTorrentsRequest("id, name, peers, trackerStats, torrentFile, pieces, priorities, wanted");
        System.out.println("Res: "+r);
        System.out.println(r.getResult()+" - "+r.getArguments().getTorrents().size());
        for(Torrent t : r.getArguments().getTorrents()){
            System.out.println("   "+t.getId()+" - "+t.getName());
            System.out.println("      "+t.getTrackerStats());
            System.out.println("      "+t.getTrackers());
            System.out.println("      "+t.getTorrentFile()); 
            
            /*BASE64Decoder dec = new BASE64Decoder();
            byte[] b = dec.decodeBuffer(t.getPieces());
            System.out.print("      Bytes: ("+b.length+") - "+StringUtils.newStringUtf8(b)+" -");
            for(int i=0;i<b.length; i++){
                //System.out.print("      "+ b[i]);
                //System.out.print(fromByte(b[i]));
                System.out.print(Integer.toBinaryString(b[i]));
            }
            System.out.println("      "+t.getPiecesNum());*/
            //System.out.println("      "+t.getPiecesStr());
            //System.out.println("      "+t.getPriorities().length);
            /*System.out.println("      Wanted len: "+t.getWanted().length);
            for(int i=0;i<t.getWanted().length; i++){
                System.out.print(t.getWanted()[i]);
            }*/
             //System.out.println("");
        }



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
    
    /*public static BitSet fromByte(byte b)
    {
        BitSet bits = new BitSet(8);
        for (int i = 0; i < 8; i++)
        {
            bits.set(i, (b & 1) == 1);
            b >>= 1;
        }
        return bits;
    }*/
}
