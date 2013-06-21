/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.gerifield.jtransmisslib.gsonobj.gettorrent;

/**
 *
 * @author Gergely
 */
public class TrackerStat {
    private String announce;
    private Integer announceState;
    private Integer downloadCount;
    private boolean hasAnnounced;
    private boolean hasScraped;
    private String host;
    private Integer id;
    private boolean isBackup;
    private Integer lastAnnouncePeerCount;
    private String lastAnnounceResult;
    private Integer lastAnnounceStartTime;
    private boolean lastAnnounceSucceeded;
    private Integer lastAnnounceTime;
    private boolean lastAnnounceTimedOut;
    private String lastScrapeResult;
    private Integer lastScrapeStartTime;
    private boolean lastScrapeSucceeded;
    private Integer lastScrapeTime;
    //private boolean lastScrapeTimedOut;
    private Integer lastScrapeTimedOut;
    private Integer leecherCount;
    private Integer nextAnnounceTime;
    private Integer nextScrapeTime;
    private String scrape;
    private Integer scrapeState;
    private Integer seederCount;
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
     * @return the announceState
     */
    public Integer getAnnounceState() {
        return announceState;
    }

    /**
     * @param announceState the announceState to set
     */
    public void setAnnounceState(Integer announceState) {
        this.announceState = announceState;
    }

    /**
     * @return the downloadCount
     */
    public Integer getDownloadCount() {
        return downloadCount;
    }

    /**
     * @param downloadCount the downloadCount to set
     */
    public void setDownloadCount(Integer downloadCount) {
        this.downloadCount = downloadCount;
    }

    /**
     * @return the hasAnnounced
     */
    public boolean isHasAnnounced() {
        return hasAnnounced;
    }

    /**
     * @param hasAnnounced the hasAnnounced to set
     */
    public void setHasAnnounced(boolean hasAnnounced) {
        this.hasAnnounced = hasAnnounced;
    }

    /**
     * @return the hasScraped
     */
    public boolean isHasScraped() {
        return hasScraped;
    }

    /**
     * @param hasScraped the hasScraped to set
     */
    public void setHasScraped(boolean hasScraped) {
        this.hasScraped = hasScraped;
    }

    /**
     * @return the host
     */
    public String getHost() {
        return host;
    }

    /**
     * @param host the host to set
     */
    public void setHost(String host) {
        this.host = host;
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
     * @return the isBackup
     */
    public boolean isIsBackup() {
        return isBackup;
    }

    /**
     * @param isBackup the isBackup to set
     */
    public void setIsBackup(boolean isBackup) {
        this.isBackup = isBackup;
    }

    /**
     * @return the lastAnnouncePeerCount
     */
    public Integer getLastAnnouncePeerCount() {
        return lastAnnouncePeerCount;
    }

    /**
     * @param lastAnnouncePeerCount the lastAnnouncePeerCount to set
     */
    public void setLastAnnouncePeerCount(Integer lastAnnouncePeerCount) {
        this.lastAnnouncePeerCount = lastAnnouncePeerCount;
    }

    /**
     * @return the lastAnnounceResult
     */
    public String getLastAnnounceResult() {
        return lastAnnounceResult;
    }

    /**
     * @param lastAnnounceResult the lastAnnounceResult to set
     */
    public void setLastAnnounceResult(String lastAnnounceResult) {
        this.lastAnnounceResult = lastAnnounceResult;
    }

    /**
     * @return the lastAnnounceStartTime
     */
    public Integer getLastAnnounceStartTime() {
        return lastAnnounceStartTime;
    }

    /**
     * @param lastAnnounceStartTime the lastAnnounceStartTime to set
     */
    public void setLastAnnounceStartTime(Integer lastAnnounceStartTime) {
        this.lastAnnounceStartTime = lastAnnounceStartTime;
    }

    /**
     * @return the lastAnnounceSucceeded
     */
    public boolean isLastAnnounceSucceeded() {
        return lastAnnounceSucceeded;
    }

    /**
     * @param lastAnnounceSucceeded the lastAnnounceSucceeded to set
     */
    public void setLastAnnounceSucceeded(boolean lastAnnounceSucceeded) {
        this.lastAnnounceSucceeded = lastAnnounceSucceeded;
    }

    /**
     * @return the lastAnnounceTime
     */
    public Integer getLastAnnounceTime() {
        return lastAnnounceTime;
    }

    /**
     * @param lastAnnounceTime the lastAnnounceTime to set
     */
    public void setLastAnnounceTime(Integer lastAnnounceTime) {
        this.lastAnnounceTime = lastAnnounceTime;
    }

    /**
     * @return the lastAnnounceTimedOut
     */
    public boolean isLastAnnounceTimedOut() {
        return lastAnnounceTimedOut;
    }

    /**
     * @param lastAnnounceTimedOut the lastAnnounceTimedOut to set
     */
    public void setLastAnnounceTimedOut(boolean lastAnnounceTimedOut) {
        this.lastAnnounceTimedOut = lastAnnounceTimedOut;
    }

    /**
     * @return the lastScrapeResult
     */
    public String getLastScrapeResult() {
        return lastScrapeResult;
    }

    /**
     * @param lastScrapeResult the lastScrapeResult to set
     */
    public void setLastScrapeResult(String lastScrapeResult) {
        this.lastScrapeResult = lastScrapeResult;
    }

    /**
     * @return the lastScrapeStartTime
     */
    public Integer getLastScrapeStartTime() {
        return lastScrapeStartTime;
    }

    /**
     * @param lastScrapeStartTime the lastScrapeStartTime to set
     */
    public void setLastScrapeStartTime(Integer lastScrapeStartTime) {
        this.lastScrapeStartTime = lastScrapeStartTime;
    }

    /**
     * @return the lastScrapeSucceeded
     */
    public boolean isLastScrapeSucceeded() {
        return lastScrapeSucceeded;
    }

    /**
     * @param lastScrapeSucceeded the lastScrapeSucceeded to set
     */
    public void setLastScrapeSucceeded(boolean lastScrapeSucceeded) {
        this.lastScrapeSucceeded = lastScrapeSucceeded;
    }

    /**
     * @return the lastScrapeTime
     */
    public Integer getLastScrapeTime() {
        return lastScrapeTime;
    }

    /**
     * @param lastScrapeTime the lastScrapeTime to set
     */
    public void setLastScrapeTime(Integer lastScrapeTime) {
        this.lastScrapeTime = lastScrapeTime;
    }

    /**
     * @return the lastScrapeTimedOut
     */
    public Integer isLastScrapeTimedOut() {
        return lastScrapeTimedOut;
    }

    /**
     * @param lastScrapeTimedOut the lastScrapeTimedOut to set
     */
    public void setLastScrapeTimedOut(Integer lastScrapeTimedOut) {
        this.lastScrapeTimedOut = lastScrapeTimedOut;
    }

    /**
     * @return the leecherCount
     */
    public Integer getLeecherCount() {
        return leecherCount;
    }

    /**
     * @param leecherCount the leecherCount to set
     */
    public void setLeecherCount(Integer leecherCount) {
        this.leecherCount = leecherCount;
    }

    /**
     * @return the nextAnnounceTime
     */
    public Integer getNextAnnounceTime() {
        return nextAnnounceTime;
    }

    /**
     * @param nextAnnounceTime the nextAnnounceTime to set
     */
    public void setNextAnnounceTime(Integer nextAnnounceTime) {
        this.nextAnnounceTime = nextAnnounceTime;
    }

    /**
     * @return the nextScrapeTime
     */
    public Integer getNextScrapeTime() {
        return nextScrapeTime;
    }

    /**
     * @param nextScrapeTime the nextScrapeTime to set
     */
    public void setNextScrapeTime(Integer nextScrapeTime) {
        this.nextScrapeTime = nextScrapeTime;
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
     * @return the scrapeState
     */
    public Integer getScrapeState() {
        return scrapeState;
    }

    /**
     * @param scrapeState the scrapeState to set
     */
    public void setScrapeState(Integer scrapeState) {
        this.scrapeState = scrapeState;
    }

    /**
     * @return the seederCount
     */
    public Integer getSeederCount() {
        return seederCount;
    }

    /**
     * @param seederCount the seederCount to set
     */
    public void setSeederCount(Integer seederCount) {
        this.seederCount = seederCount;
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
