/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package example;

import com.google.gson.Gson;
import hu.gerifield.jtransmisslib.TransMan;
import hu.gerifield.jtransmisslib.TransmissionManager;
import hu.gerifield.jtransmisslib.gsonobj.addtorrent.TAddRequestArgs;
import hu.gerifield.jtransmisslib.gsonobj.gettorrent.TGetResponse;
import hu.gerifield.jtransmisslib.gsonobj.gettorrent.Torrent;
import hu.gerifield.jtransmisslib.gsonobj.gettorrent.TrackerStat;
import hu.gerifield.jtransmisslib.gsonobj.settorrent.Pair;
import hu.gerifield.jtransmisslib.gsonobj.settorrent.TSetRequestArgs;
import java.io.File;
import java.util.BitSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Gergely
 */
public class TestApp {
    
    private static String IP = "192.168.0.100";
    private static int PORT = 9091;
    private static String PROTOCOL = "http";
    private static String USER = "torrent";

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
        tm.init(IP, PORT, PROTOCOL, USER, password);
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
        
        
        /*
        //Torrent SET
        TSetRequestArgs tsreq = new TSetRequestArgs();
        //List<Integer> ids = new LinkedList<>();
        //ids.add(81);
        //List<String> trackers = new LinkedList();
        //trackers.add("http://c.ncore.cc:2710/c4b71b3ffa3ec7587073c7a6aa018d57/announce");
        //tsreq.setTrackerAdd(trackers);
        //tsreq.setIds(ids);
        tsreq.setIds("82, 81");
        tsreq.setUploadLimit(10);
        tsreq.setUploadLimited(false);
        tm.torrentSet(tsreq);
        */
        
        
        //Torrent ADD
        //TAddRequestArgs tadd = new TAddRequestArgs();
        //tadd.setMetainfo(new File("C:\\Users\\Gergely\\Downloads\\[nCore][xvidser]Game.of.Thrones.S03.WEB-DL.x264-Krissz.torrent"));
        //tadd.setPaused(true);
        //System.out.println(tm.torrentAdd(tadd));
        //System.out.println(tadd.getMetainfo());
        
        
        //Torrent DEL
        //tm.torrentRemove("77");
        //tm.torrentRemove("21", true);
        
        //System.out.println(new Gson().toJson(tsreq, TSetRequestArgs.class));
        //tm.torrentSet(tsreq);
        
        /*
        //AKCIÓ végrehajtása
        tm.torrentAction("torrent-start");
        tm.torrentAction("torrent-stop", "63, 64");
        tm.torrentAction("torrent-start", "64");
        */
        
        
        
        //GET kérés
        TGetResponse r = tm.getTorrentsRequest("id, name, peers, trackerStats, torrentFile, pieces, priorities, wanted");
        System.out.println("Res: "+r);
        System.out.println(r.getResult()+" - "+r.getArguments().getTorrents().size());
        for(Torrent t : r.getArguments().getTorrents()){
            System.out.println("   "+t.getId()+" - "+t.getName());
            System.out.println("      "+t.getTrackerStats());
            System.out.println("      "+t.getTrackers());
            System.out.println("      "+t.getTorrentFile()); 
            
            //BASE64Decoder dec = new BASE64Decoder();
            //byte[] b = dec.decodeBuffer(t.getPieces());
            //System.out.print("      Bytes: ("+b.length+") - "+StringUtils.newStringUtf8(b)+" -");
            //for(int i=0;i<b.length; i++){
                //System.out.print("      "+ b[i]);
                //System.out.print(fromByte(b[i]));
            //    System.out.print(Integer.toBinaryString(b[i]));
            //}
            //System.out.println("      "+t.getPiecesNum());
            //System.out.println("      "+t.getPiecesStr());
            //System.out.println("      "+t.getPriorities().length);
            //System.out.println("      Wanted len: "+t.getWanted().length);
            //for(int i=0;i<t.getWanted().length; i++){
            //    System.out.print(t.getWanted()[i]);
            //}
             //System.out.println("");
            
            
            //for(TrackerStat ts : t.getTrackerStats()){
            //    System.out.print(ts.getId()+" - "+ts.getAnnounce());
            //}
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
