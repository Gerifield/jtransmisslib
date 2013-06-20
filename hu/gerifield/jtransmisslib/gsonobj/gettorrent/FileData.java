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
    private int bytesCompleted;
    private int length;
    private String name;

    /**
     * @return the bytesCompleted
     */
    public int getBytesCompleted() {
        return bytesCompleted;
    }

    /**
     * @param bytesCompleted the bytesCompleted to set
     */
    public void setBytesCompleted(int bytesCompleted) {
        this.bytesCompleted = bytesCompleted;
    }

    /**
     * @return the length
     */
    public int getLength() {
        return length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(int length) {
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
