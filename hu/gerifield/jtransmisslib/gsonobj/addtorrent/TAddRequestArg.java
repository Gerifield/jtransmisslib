/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.gerifield.jtransmisslib.gsonobj.addtorrent;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 *
 * @author Gergely
 */
public class TAddRequestArg {
    private String cookies;
    
    @SerializedName("download-dir")
    private String download_dir;
    private String filename;
    private String metainfo;
    private Boolean paused;
    
    @SerializedName("peer-limit")
    private Integer peer_limit;
    private Integer bandwidthPriority;
    
    @SerializedName("files-wanted")
    private List<Integer> files_wanted;
    
    @SerializedName("files-unwanted")
    private List<Integer> files_unwanted;
    
    @SerializedName("priority-high")
    private List<Integer> priority_high;
    
    @SerializedName("priority-low")
    private List<Integer> priority_low;
    
    @SerializedName("priority-normal")
    private List<Integer> priority_normal;
}
