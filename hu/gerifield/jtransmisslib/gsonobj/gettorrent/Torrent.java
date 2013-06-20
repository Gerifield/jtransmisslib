/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.gerifield.jtransmisslib.gsonobj.gettorrent;

import com.google.gson.annotations.SerializedName;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Gergely
 */
public class Torrent {
    private int activityDate;
    private int addedDate;
    private int bandwidthPriority;
    private String comment;
    private int corruptEver;
    private String creator;
    private int dateCreated;
    private int desiredAvailable;
    private int doneDate;
    private String downloadDir;
    private int downloadedEver;
    private int downloadLimit;
    private boolean downloadLimited;
    private int error;
    private String errorString;
    private int eta;
    private int etaIdle;
    private List<FileData> files = new LinkedList<>();
    private List<FileDataStats> fileStats = new LinkedList<>();
    private String hashString;
    private int haveUnchecked;
    private int haveValid;
    private boolean honorsSessionLimits;
    private int id;
    private boolean isFinished;
    private boolean isPrivate;
    private boolean isStalledd;
    private int leftUntilDone;
    private int magnetLink;
    private int manualAnnounceTime;
    private int maxConnectedPeers;
    private double metadataPercentComplete;
    private String name;
    
    @SerializedName("peer-limit")
    private int peer_limit;
    
    private List<Peer> peers = new LinkedList<>();
    private int peersConnected;
    private PeerFrom peersFrom;
    private int peersGettingFromUs;
    private int peersSendingToUs;
    private double percentDone;
    private String pieces;
    private int pieceCount;
    private int pieceSize;
    private int[] priorities;
    private int queuePosition;
    private int rateDownload;
    private int rateUpload;
    private double recheckProgress;
    private int secondsDownloading;
    private int secondsSeeding;
    private int seedIdleLimit;
    private int seedIdleMode;
    private double seedRatioLimit;
    private int seedRatioMode;
    private int sizeWhenDone;
    private int startDate;
    private int status;
    private List<Tracker> trackers = new LinkedList<>();
    private List<TrackerStat> trackerStats = new LinkedList<>();
    private int totalSize;
    private String torrentFile;
    private int uploadedEver;
    private int uploadLimit;
    private boolean uploadLimited;
    private double uploadRatio;
    private boolean[] wanted;
    private List<Webseed> webseeds = new LinkedList<>();
    private int webseedsSendingToUs;

    /**
     * @return the activityDate
     */
    public int getActivityDate() {
        return activityDate;
    }

    /**
     * @param activityDate the activityDate to set
     */
    public void setActivityDate(int activityDate) {
        this.activityDate = activityDate;
    }

    /**
     * @return the addedDate
     */
    public int getAddedDate() {
        return addedDate;
    }

    /**
     * @param addedDate the addedDate to set
     */
    public void setAddedDate(int addedDate) {
        this.addedDate = addedDate;
    }

    /**
     * @return the bandwidthPriority
     */
    public int getBandwidthPriority() {
        return bandwidthPriority;
    }

    /**
     * @param bandwidthPriority the bandwidthPriority to set
     */
    public void setBandwidthPriority(int bandwidthPriority) {
        this.bandwidthPriority = bandwidthPriority;
    }

    /**
     * @return the comment
     */
    public String getComment() {
        return comment;
    }

    /**
     * @param comment the comment to set
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * @return the corruptEver
     */
    public int getCorruptEver() {
        return corruptEver;
    }

    /**
     * @param corruptEver the corruptEver to set
     */
    public void setCorruptEver(int corruptEver) {
        this.corruptEver = corruptEver;
    }

    /**
     * @return the creator
     */
    public String getCreator() {
        return creator;
    }

    /**
     * @param creator the creator to set
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**
     * @return the dateCreated
     */
    public int getDateCreated() {
        return dateCreated;
    }

    /**
     * @param dateCreated the dateCreated to set
     */
    public void setDateCreated(int dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * @return the desiredAvailable
     */
    public int getDesiredAvailable() {
        return desiredAvailable;
    }

    /**
     * @param desiredAvailable the desiredAvailable to set
     */
    public void setDesiredAvailable(int desiredAvailable) {
        this.desiredAvailable = desiredAvailable;
    }

    /**
     * @return the doneDate
     */
    public int getDoneDate() {
        return doneDate;
    }

    /**
     * @param doneDate the doneDate to set
     */
    public void setDoneDate(int doneDate) {
        this.doneDate = doneDate;
    }

    /**
     * @return the downloadDir
     */
    public String getDownloadDir() {
        return downloadDir;
    }

    /**
     * @param downloadDir the downloadDir to set
     */
    public void setDownloadDir(String downloadDir) {
        this.downloadDir = downloadDir;
    }

    /**
     * @return the downloadedEver
     */
    public int getDownloadedEver() {
        return downloadedEver;
    }

    /**
     * @param downloadedEver the downloadedEver to set
     */
    public void setDownloadedEver(int downloadedEver) {
        this.downloadedEver = downloadedEver;
    }

    /**
     * @return the downloadLimit
     */
    public int getDownloadLimit() {
        return downloadLimit;
    }

    /**
     * @param downloadLimit the downloadLimit to set
     */
    public void setDownloadLimit(int downloadLimit) {
        this.downloadLimit = downloadLimit;
    }

    /**
     * @return the downloadLimited
     */
    public boolean isDownloadLimited() {
        return downloadLimited;
    }

    /**
     * @param downloadLimited the downloadLimited to set
     */
    public void setDownloadLimited(boolean downloadLimited) {
        this.downloadLimited = downloadLimited;
    }

    /**
     * @return the error
     */
    public int getError() {
        return error;
    }

    /**
     * @param error the error to set
     */
    public void setError(int error) {
        this.error = error;
    }

    /**
     * @return the errorString
     */
    public String getErrorString() {
        return errorString;
    }

    /**
     * @param errorString the errorString to set
     */
    public void setErrorString(String errorString) {
        this.errorString = errorString;
    }

    /**
     * @return the eta
     */
    public int getEta() {
        return eta;
    }

    /**
     * @param eta the eta to set
     */
    public void setEta(int eta) {
        this.eta = eta;
    }

    /**
     * @return the etaIdle
     */
    public int getEtaIdle() {
        return etaIdle;
    }

    /**
     * @param etaIdle the etaIdle to set
     */
    public void setEtaIdle(int etaIdle) {
        this.etaIdle = etaIdle;
    }

    /**
     * @return the files
     */
    public List<FileData> getFiles() {
        return files;
    }

    /**
     * @param files the files to set
     */
    public void setFiles(List<FileData> files) {
        this.files = files;
    }

    /**
     * @return the fileStats
     */
    public List<FileDataStats> getFileStats() {
        return fileStats;
    }

    /**
     * @param fileStats the fileStats to set
     */
    public void setFileStats(List<FileDataStats> fileStats) {
        this.fileStats = fileStats;
    }

    /**
     * @return the hashString
     */
    public String getHashString() {
        return hashString;
    }

    /**
     * @param hashString the hashString to set
     */
    public void setHashString(String hashString) {
        this.hashString = hashString;
    }

    /**
     * @return the haveUnchecked
     */
    public int getHaveUnchecked() {
        return haveUnchecked;
    }

    /**
     * @param haveUnchecked the haveUnchecked to set
     */
    public void setHaveUnchecked(int haveUnchecked) {
        this.haveUnchecked = haveUnchecked;
    }

    /**
     * @return the haveValid
     */
    public int getHaveValid() {
        return haveValid;
    }

    /**
     * @param haveValid the haveValid to set
     */
    public void setHaveValid(int haveValid) {
        this.haveValid = haveValid;
    }

    /**
     * @return the honorsSessionLimits
     */
    public boolean isHonorsSessionLimits() {
        return honorsSessionLimits;
    }

    /**
     * @param honorsSessionLimits the honorsSessionLimits to set
     */
    public void setHonorsSessionLimits(boolean honorsSessionLimits) {
        this.honorsSessionLimits = honorsSessionLimits;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the isFinished
     */
    public boolean isIsFinished() {
        return isFinished;
    }

    /**
     * @param isFinished the isFinished to set
     */
    public void setIsFinished(boolean isFinished) {
        this.isFinished = isFinished;
    }

    /**
     * @return the isPrivate
     */
    public boolean isIsPrivate() {
        return isPrivate;
    }

    /**
     * @param isPrivate the isPrivate to set
     */
    public void setIsPrivate(boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    /**
     * @return the isStalledd
     */
    public boolean isIsStalledd() {
        return isStalledd;
    }

    /**
     * @param isStalledd the isStalledd to set
     */
    public void setIsStalledd(boolean isStalledd) {
        this.isStalledd = isStalledd;
    }

    /**
     * @return the leftUntilDone
     */
    public int getLeftUntilDone() {
        return leftUntilDone;
    }

    /**
     * @param leftUntilDone the leftUntilDone to set
     */
    public void setLeftUntilDone(int leftUntilDone) {
        this.leftUntilDone = leftUntilDone;
    }

    /**
     * @return the magnetLink
     */
    public int getMagnetLink() {
        return magnetLink;
    }

    /**
     * @param magnetLink the magnetLink to set
     */
    public void setMagnetLink(int magnetLink) {
        this.magnetLink = magnetLink;
    }

    /**
     * @return the manualAnnounceTime
     */
    public int getManualAnnounceTime() {
        return manualAnnounceTime;
    }

    /**
     * @param manualAnnounceTime the manualAnnounceTime to set
     */
    public void setManualAnnounceTime(int manualAnnounceTime) {
        this.manualAnnounceTime = manualAnnounceTime;
    }

    /**
     * @return the maxConnectedPeers
     */
    public int getMaxConnectedPeers() {
        return maxConnectedPeers;
    }

    /**
     * @param maxConnectedPeers the maxConnectedPeers to set
     */
    public void setMaxConnectedPeers(int maxConnectedPeers) {
        this.maxConnectedPeers = maxConnectedPeers;
    }

    /**
     * @return the metadataPercentComplete
     */
    public double getMetadataPercentComplete() {
        return metadataPercentComplete;
    }

    /**
     * @param metadataPercentComplete the metadataPercentComplete to set
     */
    public void setMetadataPercentComplete(double metadataPercentComplete) {
        this.metadataPercentComplete = metadataPercentComplete;
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

    /**
     * @return the peer_limit
     */
    public int getPeer_limit() {
        return peer_limit;
    }

    /**
     * @param peer_limit the peer_limit to set
     */
    public void setPeer_limit(int peer_limit) {
        this.peer_limit = peer_limit;
    }

    /**
     * @return the peers
     */
    public List<Peer> getPeers() {
        return peers;
    }

    /**
     * @param peers the peers to set
     */
    public void setPeers(List<Peer> peers) {
        this.peers = peers;
    }

    /**
     * @return the peersConnected
     */
    public int getPeersConnected() {
        return peersConnected;
    }

    /**
     * @param peersConnected the peersConnected to set
     */
    public void setPeersConnected(int peersConnected) {
        this.peersConnected = peersConnected;
    }

    /**
     * @return the peersFrom
     */
    public PeerFrom getPeersFrom() {
        return peersFrom;
    }

    /**
     * @param peersFrom the peersFrom to set
     */
    public void setPeersFrom(PeerFrom peersFrom) {
        this.peersFrom = peersFrom;
    }

    /**
     * @return the peersGettingFromUs
     */
    public int getPeersGettingFromUs() {
        return peersGettingFromUs;
    }

    /**
     * @param peersGettingFromUs the peersGettingFromUs to set
     */
    public void setPeersGettingFromUs(int peersGettingFromUs) {
        this.peersGettingFromUs = peersGettingFromUs;
    }

    /**
     * @return the peersSendingToUs
     */
    public int getPeersSendingToUs() {
        return peersSendingToUs;
    }

    /**
     * @param peersSendingToUs the peersSendingToUs to set
     */
    public void setPeersSendingToUs(int peersSendingToUs) {
        this.peersSendingToUs = peersSendingToUs;
    }

    /**
     * @return the percentDone
     */
    public double getPercentDone() {
        return percentDone;
    }

    /**
     * @param percentDone the percentDone to set
     */
    public void setPercentDone(double percentDone) {
        this.percentDone = percentDone;
    }

    /**
     * @return the pieces
     */
    public String getPieces() {
        return pieces;
    }

    /**
     * @param pieces the pieces to set
     */
    public void setPieces(String pieces) {
        this.pieces = pieces;
    }

    /**
     * @return the pieceCount
     */
    public int getPieceCount() {
        return pieceCount;
    }

    /**
     * @param pieceCount the pieceCount to set
     */
    public void setPieceCount(int pieceCount) {
        this.pieceCount = pieceCount;
    }

    /**
     * @return the pieceSize
     */
    public int getPieceSize() {
        return pieceSize;
    }

    /**
     * @param pieceSize the pieceSize to set
     */
    public void setPieceSize(int pieceSize) {
        this.pieceSize = pieceSize;
    }

    /**
     * @return the priorities
     */
    public int[] getPriorities() {
        return priorities;
    }

    /**
     * @param priorities the priorities to set
     */
    public void setPriorities(int[] priorities) {
        this.priorities = priorities;
    }

    /**
     * @return the queuePosition
     */
    public int getQueuePosition() {
        return queuePosition;
    }

    /**
     * @param queuePosition the queuePosition to set
     */
    public void setQueuePosition(int queuePosition) {
        this.queuePosition = queuePosition;
    }

    /**
     * @return the rateDownload
     */
    public int getRateDownload() {
        return rateDownload;
    }

    /**
     * @param rateDownload the rateDownload to set
     */
    public void setRateDownload(int rateDownload) {
        this.rateDownload = rateDownload;
    }

    /**
     * @return the rateUpload
     */
    public int getRateUpload() {
        return rateUpload;
    }

    /**
     * @param rateUpload the rateUpload to set
     */
    public void setRateUpload(int rateUpload) {
        this.rateUpload = rateUpload;
    }

    /**
     * @return the recheckProgress
     */
    public double getRecheckProgress() {
        return recheckProgress;
    }

    /**
     * @param recheckProgress the recheckProgress to set
     */
    public void setRecheckProgress(double recheckProgress) {
        this.recheckProgress = recheckProgress;
    }

    /**
     * @return the secondsDownloading
     */
    public int getSecondsDownloading() {
        return secondsDownloading;
    }

    /**
     * @param secondsDownloading the secondsDownloading to set
     */
    public void setSecondsDownloading(int secondsDownloading) {
        this.secondsDownloading = secondsDownloading;
    }

    /**
     * @return the secondsSeeding
     */
    public int getSecondsSeeding() {
        return secondsSeeding;
    }

    /**
     * @param secondsSeeding the secondsSeeding to set
     */
    public void setSecondsSeeding(int secondsSeeding) {
        this.secondsSeeding = secondsSeeding;
    }

    /**
     * @return the seedIdleLimit
     */
    public int getSeedIdleLimit() {
        return seedIdleLimit;
    }

    /**
     * @param seedIdleLimit the seedIdleLimit to set
     */
    public void setSeedIdleLimit(int seedIdleLimit) {
        this.seedIdleLimit = seedIdleLimit;
    }

    /**
     * @return the seedIdleMode
     */
    public int getSeedIdleMode() {
        return seedIdleMode;
    }

    /**
     * @param seedIdleMode the seedIdleMode to set
     */
    public void setSeedIdleMode(int seedIdleMode) {
        this.seedIdleMode = seedIdleMode;
    }

    /**
     * @return the seedRatioLimit
     */
    public double getSeedRatioLimit() {
        return seedRatioLimit;
    }

    /**
     * @param seedRatioLimit the seedRatioLimit to set
     */
    public void setSeedRatioLimit(double seedRatioLimit) {
        this.seedRatioLimit = seedRatioLimit;
    }

    /**
     * @return the seedRatioMode
     */
    public int getSeedRatioMode() {
        return seedRatioMode;
    }

    /**
     * @param seedRatioMode the seedRatioMode to set
     */
    public void setSeedRatioMode(int seedRatioMode) {
        this.seedRatioMode = seedRatioMode;
    }

    /**
     * @return the sizeWhenDone
     */
    public int getSizeWhenDone() {
        return sizeWhenDone;
    }

    /**
     * @param sizeWhenDone the sizeWhenDone to set
     */
    public void setSizeWhenDone(int sizeWhenDone) {
        this.sizeWhenDone = sizeWhenDone;
    }

    /**
     * @return the startDate
     */
    public int getStartDate() {
        return startDate;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(int startDate) {
        this.startDate = startDate;
    }

    /**
     * @return the status
     */
    public int getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(int status) {
        this.status = status;
    }

    /**
     * @return the trackers
     */
    public List<Tracker> getTrackers() {
        return trackers;
    }

    /**
     * @param trackers the trackers to set
     */
    public void setTrackers(List<Tracker> trackers) {
        this.trackers = trackers;
    }

    /**
     * @return the trackerStats
     */
    public List<TrackerStat> getTrackerStats() {
        return trackerStats;
    }

    /**
     * @param trackerStats the trackerStats to set
     */
    public void setTrackerStats(List<TrackerStat> trackerStats) {
        this.trackerStats = trackerStats;
    }

    /**
     * @return the totalSize
     */
    public int getTotalSize() {
        return totalSize;
    }

    /**
     * @param totalSize the totalSize to set
     */
    public void setTotalSize(int totalSize) {
        this.totalSize = totalSize;
    }

    /**
     * @return the torrentFile
     */
    public String getTorrentFile() {
        return torrentFile;
    }

    /**
     * @param torrentFile the torrentFile to set
     */
    public void setTorrentFile(String torrentFile) {
        this.torrentFile = torrentFile;
    }

    /**
     * @return the uploadedEver
     */
    public int getUploadedEver() {
        return uploadedEver;
    }

    /**
     * @param uploadedEver the uploadedEver to set
     */
    public void setUploadedEver(int uploadedEver) {
        this.uploadedEver = uploadedEver;
    }

    /**
     * @return the uploadLimit
     */
    public int getUploadLimit() {
        return uploadLimit;
    }

    /**
     * @param uploadLimit the uploadLimit to set
     */
    public void setUploadLimit(int uploadLimit) {
        this.uploadLimit = uploadLimit;
    }

    /**
     * @return the uploadLimited
     */
    public boolean isUploadLimited() {
        return uploadLimited;
    }

    /**
     * @param uploadLimited the uploadLimited to set
     */
    public void setUploadLimited(boolean uploadLimited) {
        this.uploadLimited = uploadLimited;
    }

    /**
     * @return the uploadRatio
     */
    public double getUploadRatio() {
        return uploadRatio;
    }

    /**
     * @param uploadRatio the uploadRatio to set
     */
    public void setUploadRatio(double uploadRatio) {
        this.uploadRatio = uploadRatio;
    }

    /**
     * @return the wanted
     */
    public boolean[] getWanted() {
        return wanted;
    }

    /**
     * @param wanted the wanted to set
     */
    public void setWanted(boolean[] wanted) {
        this.wanted = wanted;
    }

    /**
     * @return the webseeds
     */
    public List<Webseed> getWebseeds() {
        return webseeds;
    }

    /**
     * @param webseeds the webseeds to set
     */
    public void setWebseeds(List<Webseed> webseeds) {
        this.webseeds = webseeds;
    }

    /**
     * @return the webseedsSendingToUs
     */
    public int getWebseedsSendingToUs() {
        return webseedsSendingToUs;
    }

    /**
     * @param webseedsSendingToUs the webseedsSendingToUs to set
     */
    public void setWebseedsSendingToUs(int webseedsSendingToUs) {
        this.webseedsSendingToUs = webseedsSendingToUs;
    }
}
