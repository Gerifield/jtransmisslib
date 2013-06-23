/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.gerifield.jtransmisslib.gsonobj.settorrent;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 *
 * @author Gergely
 */
public class TSetRequest {
    private Integer bandwidthPriority;
    private Integer downloadLimit;
    private Boolean downloadLimited;
    
    @SerializedName("files-wanted")
    private List<Integer> files_wanted; //üresen mind
    
    @SerializedName("files-unwanted")
    private List<Integer> files_unwanted; //üresen mind
    
    private Boolean honorsSessionLimits;
    private List<Integer> ids; //üresen mind
    private String location;
    
    @SerializedName("peer-limit")
    private Integer peer_limit;
    
    @SerializedName("priority-high")
    private List<Integer> priority_high; //üresen mind
    
    @SerializedName("priority-low")
    private List<Integer> priority_low; //üresen mind
    
    @SerializedName("priority-normal")
    private List<Integer> priority_normal; //üresen mind
    
    private Integer queuePosition;
    private Integer seedIdleLimit;
    private Integer seedIdleMode;
    private Double seedRatioLimit;
    private Integer seedRatioMode;
    private List<String> trackerAdd;
    private List<Integer> trackerRemove;
    private List<Pair<Integer, String>> trackerReplace;
    private Integer uploadLimit;
    private Boolean uploadLimited;
    
    
    
}
