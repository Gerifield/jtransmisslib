/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.gerifield.jtransmisslib.gsonobj.gettorrent;

/**
 *
 * @author Gergely
 */
public class FileDataStats {
    private Integer bytesCompleted;
    private boolean wanted;
    private Integer priority;

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
     * @return the wanted
     */
    public boolean isWanted() {
        return wanted;
    }

    /**
     * @param wanted the wanted to set
     */
    public void setWanted(boolean wanted) {
        this.wanted = wanted;
    }

    /**
     * @return the priority
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * @param priority the priority to set
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }
    
}
