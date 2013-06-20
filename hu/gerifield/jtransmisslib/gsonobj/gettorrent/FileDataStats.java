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
    private int bytesCompleted;
    private boolean wanted;
    private int priority;

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
    public int getPriority() {
        return priority;
    }

    /**
     * @param priority the priority to set
     */
    public void setPriority(int priority) {
        this.priority = priority;
    }
    
}
