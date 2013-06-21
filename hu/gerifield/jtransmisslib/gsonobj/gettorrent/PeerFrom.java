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
    private Integer fromCache;
    private Integer fromDht;
    private Integer fromIncoming;
    private Integer fromLpd;
    private Integer fromLtep;
    private Integer fromPex;
    private Integer fromTracker;

    /**
     * @return the fromCache
     */
    public Integer getFromCache() {
        return fromCache;
    }

    /**
     * @param fromCache the fromCache to set
     */
    public void setFromCache(Integer fromCache) {
        this.fromCache = fromCache;
    }

    /**
     * @return the fromDht
     */
    public Integer getFromDht() {
        return fromDht;
    }

    /**
     * @param fromDht the fromDht to set
     */
    public void setFromDht(Integer fromDht) {
        this.fromDht = fromDht;
    }

    /**
     * @return the fromIncoming
     */
    public Integer getFromIncoming() {
        return fromIncoming;
    }

    /**
     * @param fromIncoming the fromIncoming to set
     */
    public void setFromIncoming(Integer fromIncoming) {
        this.fromIncoming = fromIncoming;
    }

    /**
     * @return the fromLpd
     */
    public Integer getFromLpd() {
        return fromLpd;
    }

    /**
     * @param fromLpd the fromLpd to set
     */
    public void setFromLpd(Integer fromLpd) {
        this.fromLpd = fromLpd;
    }

    /**
     * @return the fromLtep
     */
    public Integer getFromLtep() {
        return fromLtep;
    }

    /**
     * @param fromLtep the fromLtep to set
     */
    public void setFromLtep(Integer fromLtep) {
        this.fromLtep = fromLtep;
    }

    /**
     * @return the fromPex
     */
    public Integer getFromPex() {
        return fromPex;
    }

    /**
     * @param fromPex the fromPex to set
     */
    public void setFromPex(Integer fromPex) {
        this.fromPex = fromPex;
    }

    /**
     * @return the fromTracker
     */
    public Integer getFromTracker() {
        return fromTracker;
    }

    /**
     * @param fromTracker the fromTracker to set
     */
    public void setFromTracker(Integer fromTracker) {
        this.fromTracker = fromTracker;
    }
}
