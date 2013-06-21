/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.gerifield.jtransmisslib.gsonobj.gettorrent;

/**
 *
 * @author Gergely
 */
public class FileData {
    private Integer bytesCompleted;
    private Integer length;
    private String name;

    /**
     * @return the bytesCompleted
     */
    public Integer getBytesCompleted() {
        return bytesCompleted;
    }

    /**
     * @param bytesCompleted the bytesCompleted to set
     */
    public void setBytesCompleted(Integer bytesCompleted) {
        this.bytesCompleted = bytesCompleted;
    }

    /**
     * @return the length
     */
    public Integer getLength() {
        return length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(Integer length) {
        this.length = length;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
}
