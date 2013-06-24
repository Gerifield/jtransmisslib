/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.gerifield.jtransmisslib.gsonobj.addtorrent;

import com.google.gson.annotations.SerializedName;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import sun.misc.BASE64Encoder;

/**
 *
 * @author Gergely
 */
public class TAddRequestArgs {
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

    /**
     * @return the cookies
     */
    public String getCookies() {
        return cookies;
    }

    /**
     * @param cookies the cookies to set
     */
    public void setCookies(String cookies) {
        this.cookies = cookies;
    }

    /**
     * @return the download_dir
     */
    public String getDownload_dir() {
        return download_dir;
    }

    /**
     * @param download_dir the download_dir to set
     */
    public void setDownload_dir(String download_dir) {
        this.download_dir = download_dir;
    }

    /**
     * @return the filename
     */
    public String getFilename() {
        return filename;
    }

    /**
     * @param filename the filename to set
     */
    public void setFilename(String filename) {
        this.filename = filename;
    }

    /**
     * @return the metainfo
     */
    public String getMetainfo() {
        return metainfo;
    }

    /**
     * @param metainfo the metainfo to set
     */
    public void setMetainfo(String metainfo) {
        this.metainfo = metainfo;
    }

    /**
     * @return the paused
     */
    public Boolean getPaused() {
        return paused;
    }

    /**
     * @param paused the paused to set
     */
    public void setPaused(Boolean paused) {
        this.paused = paused;
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
     * @param metainfo the metainfo file to set
     */
    public void setMetainfo(File metainfo) throws FileNotFoundException, IOException{
        BASE64Encoder enc = new BASE64Encoder();
        byte[] input = new byte[(int)metainfo.length()];
        DataInputStream dip = new DataInputStream(new BufferedInputStream(new FileInputStream(metainfo)));
        dip.readFully(input);
        dip.close();
        
        this.metainfo = enc.encode(input);
    }
}
