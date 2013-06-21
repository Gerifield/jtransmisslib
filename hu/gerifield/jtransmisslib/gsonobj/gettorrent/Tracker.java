/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.gerifield.jtransmisslib.gsonobj.gettorrent;

/**
 *
 * @author Gergely
 */
public class Tracker {
    private String announce;
    private Integer id;
    private String scrape;
    private Integer tier;

    /**
     * @return the announce
     */
    public String getAnnounce() {
        return announce;
    }

    /**
     * @param announce the announce to set
     */
    public void setAnnounce(String announce) {
        this.announce = announce;
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the scrape
     */
    public String getScrape() {
        return scrape;
    }

    /**
     * @param scrape the scrape to set
     */
    public void setScrape(String scrape) {
        this.scrape = scrape;
    }

    /**
     * @return the tier
     */
    public Integer getTier() {
        return tier;
    }

    /**
     * @param tier the tier to set
     */
    public void setTier(Integer tier) {
        this.tier = tier;
    }
    
}
