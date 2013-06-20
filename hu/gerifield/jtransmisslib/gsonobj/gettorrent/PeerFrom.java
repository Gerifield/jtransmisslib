/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.gerifield.jtransmisslib.gsonobj.gettorrent;

/**
 *
 * @author Gergely
 */
public class PeerFrom {
    private int fromCache;
    private int fromDht;
    private int fromIncoming;
    private int fromLpd;
    private int fromLtep;
    private int fromPex;
    private int fromTracker;

    /**
     * @return the fromCache
     */
    public int getFromCache() {
        return fromCache;
    }

    /**
     * @param fromCache the fromCache to set
     */
    public void setFromCache(int fromCache) {
        this.fromCache = fromCache;
    }

    /**
     * @return the fromDht
     */
    public int getFromDht() {
        return fromDht;
    }

    /**
     * @param fromDht the fromDht to set
     */
    public void setFromDht(int fromDht) {
        this.fromDht = fromDht;
    }

    /**
     * @return the fromIncoming
     */
    public int getFromIncoming() {
        return fromIncoming;
    }

    /**
     * @param fromIncoming the fromIncoming to set
     */
    public void setFromIncoming(int fromIncoming) {
        this.fromIncoming = fromIncoming;
    }

    /**
     * @return the fromLpd
     */
    public int getFromLpd() {
        return fromLpd;
    }

    /**
     * @param fromLpd the fromLpd to set
     */
    public void setFromLpd(int fromLpd) {
        this.fromLpd = fromLpd;
    }

    /**
     * @return the fromLtep
     */
    public int getFromLtep() {
        return fromLtep;
    }

    /**
     * @param fromLtep the fromLtep to set
     */
    public void setFromLtep(int fromLtep) {
        this.fromLtep = fromLtep;
    }

    /**
     * @return the fromPex
     */
    public int getFromPex() {
        return fromPex;
    }

    /**
     * @param fromPex the fromPex to set
     */
    public void setFromPex(int fromPex) {
        this.fromPex = fromPex;
    }

    /**
     * @return the fromTracker
     */
    public int getFromTracker() {
        return fromTracker;
    }

    /**
     * @param fromTracker the fromTracker to set
     */
    public void setFromTracker(int fromTracker) {
        this.fromTracker = fromTracker;
    }
}
