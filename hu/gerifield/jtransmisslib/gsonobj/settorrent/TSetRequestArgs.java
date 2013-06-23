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
public class TSetRequestArgs {
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
    //TODO megoldani
    //private List<Pair<Integer, String>> trackerReplace;
    private Integer uploadLimit;
    private Boolean uploadLimited;

    /**
     * @return the bandwidthPriority
     */
    public Integer getBandwidthPriority() {
        return bandwidthPriority;
    }

    /**
     * @param bandwidthPriority the bandwidthPriority to set
     */
    public void setBandwidthPriority(Integer bandwidthPriority) {
        this.bandwidthPriority = bandwidthPriority;
    }

    /**
     * @return the downloadLimit
     */
    public Integer getDownloadLimit() {
        return downloadLimit;
    }

    /**
     * @param downloadLimit the downloadLimit to set
     */
    public void setDownloadLimit(Integer downloadLimit) {
        this.downloadLimit = downloadLimit;
    }

    /**
     * @return the downloadLimited
     */
    public Boolean getDownloadLimited() {
        return downloadLimited;
    }

    /**
     * @param downloadLimited the downloadLimited to set
     */
    public void setDownloadLimited(Boolean downloadLimited) {
        this.downloadLimited = downloadLimited;
    }

    /**
     * @return the files_wanted
     */
    public List<Integer> getFiles_wanted() {
        return files_wanted;
    }

    /**
     * @param files_wanted the files_wanted to set
     */
    public void setFiles_wanted(List<Integer> files_wanted) {
        this.files_wanted = files_wanted;
    }

    /**
     * @return the files_unwanted
     */
    public List<Integer> getFiles_unwanted() {
        return files_unwanted;
    }

    /**
     * @param files_unwanted the files_unwanted to set
     */
    public void setFiles_unwanted(List<Integer> files_unwanted) {
        this.files_unwanted = files_unwanted;
    }

    /**
     * @return the honorsSessionLimits
     */
    public Boolean getHonorsSessionLimits() {
        return honorsSessionLimits;
    }

    /**
     * @param honorsSessionLimits the honorsSessionLimits to set
     */
    public void setHonorsSessionLimits(Boolean honorsSessionLimits) {
        this.honorsSessionLimits = honorsSessionLimits;
    }

    /**
     * @return the ids
     */
    public List<Integer> getIds() {
        return ids;
    }

    /**
     * @param ids the ids to set
     */
    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return the peer_limit
     */
    public Integer getPeer_limit() {
        return peer_limit;
    }

    /**
     * @param peer_limit the peer_limit to set
     */
    public void setPeer_limit(Integer peer_limit) {
        this.peer_limit = peer_limit;
    }

    /**
     * @return the priority_high
     */
    public List<Integer> getPriority_high() {
        return priority_high;
    }

    /**
     * @param priority_high the priority_high to set
     */
    public void setPriority_high(List<Integer> priority_high) {
        this.priority_high = priority_high;
    }

    /**
     * @return the priority_low
     */
    public List<Integer> getPriority_low() {
        return priority_low;
    }

    /**
     * @param priority_low the priority_low to set
     */
    public void setPriority_low(List<Integer> priority_low) {
        this.priority_low = priority_low;
    }

    /**
     * @return the priority_normal
     */
    public List<Integer> getPriority_normal() {
        return priority_normal;
    }

    /**
     * @param priority_normal the priority_normal to set
     */
    public void setPriority_normal(List<Integer> priority_normal) {
        this.priority_normal = priority_normal;
    }

    /**
     * @return the queuePosition
     */
    public Integer getQueuePosition() {
        return queuePosition;
    }

    /**
     * @param queuePosition the queuePosition to set
     */
    public void setQueuePosition(Integer queuePosition) {
        this.queuePosition = queuePosition;
    }

    /**
     * @return the seedIdleLimit
     */
    public Integer getSeedIdleLimit() {
        return seedIdleLimit;
    }

    /**
     * @param seedIdleLimit the seedIdleLimit to set
     */
    public void setSeedIdleLimit(Integer seedIdleLimit) {
        this.seedIdleLimit = seedIdleLimit;
    }

    /**
     * @return the seedIdleMode
     */
    public Integer getSeedIdleMode() {
        return seedIdleMode;
    }

    /**
     * @param seedIdleMode the seedIdleMode to set
     */
    public void setSeedIdleMode(Integer seedIdleMode) {
        this.seedIdleMode = seedIdleMode;
    }

    /**
     * @return the seedRatioLimit
     */
    public Double getSeedRatioLimit() {
        return seedRatioLimit;
    }

    /**
     * @param seedRatioLimit the seedRatioLimit to set
     */
    public void setSeedRatioLimit(Double seedRatioLimit) {
        this.seedRatioLimit = seedRatioLimit;
    }

    /**
     * @return the seedRatioMode
     */
    public Integer getSeedRatioMode() {
        return seedRatioMode;
    }

    /**
     * @param seedRatioMode the seedRatioMode to set
     */
    public void setSeedRatioMode(Integer seedRatioMode) {
        this.seedRatioMode = seedRatioMode;
    }

    /**
     * @return the trackerAdd
     */
    public List<String> getTrackerAdd() {
        return trackerAdd;
    }

    /**
     * @param trackerAdd the trackerAdd to set
     */
    public void setTrackerAdd(List<String> trackerAdd) {
        this.trackerAdd = trackerAdd;
    }

    /**
     * @return the trackerRemove
     */
    public List<Integer> getTrackerRemove() {
        return trackerRemove;
    }

    /**
     * @param trackerRemove the trackerRemove to set
     */
    public void setTrackerRemove(List<Integer> trackerRemove) {
        this.trackerRemove = trackerRemove;
    }

    /**
     * @return the uploadLimit
     */
    public Integer getUploadLimit() {
        return uploadLimit;
    }

    /**
     * @param uploadLimit the uploadLimit to set
     */
    public void setUploadLimit(Integer uploadLimit) {
        this.uploadLimit = uploadLimit;
    }

    /**
     * @return the uploadLimited
     */
    public Boolean getUploadLimited() {
        return uploadLimited;
    }

    /**
     * @param uploadLimited the uploadLimited to set
     */
    public void setUploadLimited(Boolean uploadLimited) {
        this.uploadLimited = uploadLimited;
    }
    
    
    
}
