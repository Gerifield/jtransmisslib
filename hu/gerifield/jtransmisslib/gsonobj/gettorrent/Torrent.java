/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.gerifield.jtransmisslib.gsonobj.gettorrent;

import com.google.gson.annotations.SerializedName;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import sun.misc.BASE64Decoder;

/**
 *
 * @author Gergely
 */
public class Torrent {
    private Integer activityDate;
    private Integer addedDate;
    private Integer bandwidthPriority;
    private String comment;
    private Integer corruptEver;
    private String creator;
    private Integer dateCreated;
    private Integer desiredAvailable;
    private Integer doneDate;
    private String downloadDir;
    private Integer downloadedEver;
    private Integer downloadLimit;
    private boolean downloadLimited;
    private Integer error;
    private String errorString;
    private Integer eta;
    private Integer etaIdle;
    private List<FileData> files = new LinkedList<>();
    private List<FileDataStats> fileStats = new LinkedList<>();
    private String hashString;
    private Integer haveUnchecked;
    private Integer haveValid;
    private boolean honorsSessionLimits;
    private Integer id;
    private boolean isFinished;
    private boolean isPrivate;
    private boolean isStalledd;
    private Integer leftUntilDone;
    private Integer magnetLink;
    private Integer manualAnnounceTime;
    private Integer maxConnectedPeers;
    private double metadataPercentComplete;
    private String name;
    
    @SerializedName("peer-limit")
    private Integer peer_limit;
    
    private List<Peer> peers = new LinkedList<>();
    private Integer peersConnected;
    private PeerFrom peersFrom;
    private Integer peersGettingFromUs;
    private Integer peersSendingToUs;
    private double percentDone;
    private String pieces; //BASE64 encode, -1 megvan, 0 - kell érték lehet még 2, 4.... de negatív előjel is beeshet... => BITEK számítanak elvileg
    private Integer pieceCount;
    private Integer pieceSize;
    private Integer[] priorities;
    private Integer queuePosition;
    private Integer rateDownload;
    private Integer rateUpload;
    private double recheckProgress;
    private Integer secondsDownloading;
    private Integer secondsSeeding;
    private Integer seedIdleLimit;
    private Integer seedIdleMode;
    private double seedRatioLimit;
    private Integer seedRatioMode;
    private Integer sizeWhenDone;
    private Integer startDate;
    private Integer status;
    private List<Tracker> trackers = new LinkedList<>();
    private List<TrackerStat> trackerStats = new LinkedList<>();
    private Integer totalSize;
    private String torrentFile;
    private Integer uploadedEver;
    private Integer uploadLimit;
    private boolean uploadLimited;
    private double uploadRatio;
    //private boolean[] wanted;
    private Integer[] wanted; //1-esek
    private List<Webseed> webseeds = new LinkedList<>();
    private Integer webseedsSendingToUs;

    /**
     * @return the activityDate
     */
    public Integer getActivityDate() {
        return activityDate;
    }

    /**
     * @param activityDate the activityDate to set
     */
    public void setActivityDate(Integer activityDate) {
        this.activityDate = activityDate;
    }

    /**
     * @return the addedDate
     */
    public Integer getAddedDate() {
        return addedDate;
    }

    /**
     * @param addedDate the addedDate to set
     */
    public void setAddedDate(Integer addedDate) {
        this.addedDate = addedDate;
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
    public Integer getCorruptEver() {
        return corruptEver;
    }

    /**
     * @param corruptEver the corruptEver to set
     */
    public void setCorruptEver(Integer corruptEver) {
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
    public Integer getDateCreated() {
        return dateCreated;
    }

    /**
     * @param dateCreated the dateCreated to set
     */
    public void setDateCreated(Integer dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * @return the desiredAvailable
     */
    public Integer getDesiredAvailable() {
        return desiredAvailable;
    }

    /**
     * @param desiredAvailable the desiredAvailable to set
     */
    public void setDesiredAvailable(Integer desiredAvailable) {
        this.desiredAvailable = desiredAvailable;
    }

    /**
     * @return the doneDate
     */
    public Integer getDoneDate() {
        return doneDate;
    }

    /**
     * @param doneDate the doneDate to set
     */
    public void setDoneDate(Integer doneDate) {
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
    public Integer getDownloadedEver() {
        return downloadedEver;
    }

    /**
     * @param downloadedEver the downloadedEver to set
     */
    public void setDownloadedEver(Integer downloadedEver) {
        this.downloadedEver = downloadedEver;
    }

    /**
     * @return the downloadLimit
     */
    public Integer getDownloadLimit() {
        return downloadLimit;
    }

    /**
     * @param downloadLimit the downloadLimit to set
     */
    public void setDownloadLimit(Integer downloadLimit) {
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
    public Integer getError() {
        return error;
    }

    /**
     * @param error the error to set
     */
    public void setError(Integer error) {
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
    public Integer getEta() {
        return eta;
    }

    /**
     * @param eta the eta to set
     */
    public void setEta(Integer eta) {
        this.eta = eta;
    }

    /**
     * @return the etaIdle
     */
    public Integer getEtaIdle() {
        return etaIdle;
    }

    /**
     * @param etaIdle the etaIdle to set
     */
    public void setEtaIdle(Integer etaIdle) {
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
    public Integer getHaveUnchecked() {
        return haveUnchecked;
    }

    /**
     * @param haveUnchecked the haveUnchecked to set
     */
    public void setHaveUnchecked(Integer haveUnchecked) {
        this.haveUnchecked = haveUnchecked;
    }

    /**
     * @return the haveValid
     */
    public Integer getHaveValid() {
        return haveValid;
    }

    /**
     * @param haveValid the haveValid to set
     */
    public void setHaveValid(Integer haveValid) {
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
    public Integer getLeftUntilDone() {
        return leftUntilDone;
    }

    /**
     * @param leftUntilDone the leftUntilDone to set
     */
    public void setLeftUntilDone(Integer leftUntilDone) {
        this.leftUntilDone = leftUntilDone;
    }

    /**
     * @return the magnetLink
     */
    public Integer getMagnetLink() {
        return magnetLink;
    }

    /**
     * @param magnetLink the magnetLink to set
     */
    public void setMagnetLink(Integer magnetLink) {
        this.magnetLink = magnetLink;
    }

    /**
     * @return the manualAnnounceTime
     */
    public Integer getManualAnnounceTime() {
        return manualAnnounceTime;
    }

    /**
     * @param manualAnnounceTime the manualAnnounceTime to set
     */
    public void setManualAnnounceTime(Integer manualAnnounceTime) {
        this.manualAnnounceTime = manualAnnounceTime;
    }

    /**
     * @return the maxConnectedPeers
     */
    public Integer getMaxConnectedPeers() {
        return maxConnectedPeers;
    }

    /**
     * @param maxConnectedPeers the maxConnectedPeers to set
     */
    public void setMaxConnectedPeers(Integer maxConnectedPeers) {
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
    public Integer getPeersConnected() {
        return peersConnected;
    }

    /**
     * @param peersConnected the peersConnected to set
     */
    public void setPeersConnected(Integer peersConnected) {
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
    public Integer getPeersGettingFromUs() {
        return peersGettingFromUs;
    }

    /**
     * @param peersGettingFromUs the peersGettingFromUs to set
     */
    public void setPeersGettingFromUs(Integer peersGettingFromUs) {
        this.peersGettingFromUs = peersGettingFromUs;
    }

    /**
     * @return the peersSendingToUs
     */
    public Integer getPeersSendingToUs() {
        return peersSendingToUs;
    }

    /**
     * @param peersSendingToUs the peersSendingToUs to set
     */
    public void setPeersSendingToUs(Integer peersSendingToUs) {
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
    public Integer getPieceCount() {
        return pieceCount;
    }

    /**
     * @param pieceCount the pieceCount to set
     */
    public void setPieceCount(Integer pieceCount) {
        this.pieceCount = pieceCount;
    }

    /**
     * @return the pieceSize
     */
    public Integer getPieceSize() {
        return pieceSize;
    }

    /**
     * @param pieceSize the pieceSize to set
     */
    public void setPieceSize(Integer pieceSize) {
        this.pieceSize = pieceSize;
    }

    /**
     * @return the priorities
     */
    public Integer[] getPriorities() {
        return priorities;
    }

    /**
     * @param priorities the priorities to set
     */
    public void setPriorities(Integer[] priorities) {
        this.priorities = priorities;
    }

    /**
     * @return the queuePosition
     */
    public Integer getQueuePosition() {
        return queuePosition;
    }

    /**
     * @param queuePosition the queuePosition to set
     */
    public void setQueuePosition(Integer queuePosition) {
        this.queuePosition = queuePosition;
    }

    /**
     * @return the rateDownload
     */
    public Integer getRateDownload() {
        return rateDownload;
    }

    /**
     * @param rateDownload the rateDownload to set
     */
    public void setRateDownload(Integer rateDownload) {
        this.rateDownload = rateDownload;
    }

    /**
     * @return the rateUpload
     */
    public Integer getRateUpload() {
        return rateUpload;
    }

    /**
     * @param rateUpload the rateUpload to set
     */
    public void setRateUpload(Integer rateUpload) {
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
    public Integer getSecondsDownloading() {
        return secondsDownloading;
    }

    /**
     * @param secondsDownloading the secondsDownloading to set
     */
    public void setSecondsDownloading(Integer secondsDownloading) {
        this.secondsDownloading = secondsDownloading;
    }

    /**
     * @return the secondsSeeding
     */
    public Integer getSecondsSeeding() {
        return secondsSeeding;
    }

    /**
     * @param secondsSeeding the secondsSeeding to set
     */
    public void setSecondsSeeding(Integer secondsSeeding) {
        this.secondsSeeding = secondsSeeding;
    }

    /**
     * @return the seedIdleLimit
     */
    public Integer getSeedIdleLimit() {
        return seedIdleLimit;
    }

    /**
     * @param seedIdleLimit the seedIdleLimit to set
     */
    public void setSeedIdleLimit(Integer seedIdleLimit) {
        this.seedIdleLimit = seedIdleLimit;
    }

    /**
     * @return the seedIdleMode
     */
    public Integer getSeedIdleMode() {
        return seedIdleMode;
    }

    /**
     * @param seedIdleMode the seedIdleMode to set
     */
    public void setSeedIdleMode(Integer seedIdleMode) {
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
    public Integer getSeedRatioMode() {
        return seedRatioMode;
    }

    /**
     * @param seedRatioMode the seedRatioMode to set
     */
    public void setSeedRatioMode(Integer seedRatioMode) {
        this.seedRatioMode = seedRatioMode;
    }

    /**
     * @return the sizeWhenDone
     */
    public Integer getSizeWhenDone() {
        return sizeWhenDone;
    }

    /**
     * @param sizeWhenDone the sizeWhenDone to set
     */
    public void setSizeWhenDone(Integer sizeWhenDone) {
        this.sizeWhenDone = sizeWhenDone;
    }

    /**
     * @return the startDate
     */
    public Integer getStartDate() {
        return startDate;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(Integer startDate) {
        this.startDate = startDate;
    }

    /**
     * @return the status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(Integer status) {
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
    public Integer getTotalSize() {
        return totalSize;
    }

    /**
     * @param totalSize the totalSize to set
     */
    public void setTotalSize(Integer totalSize) {
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
    public Integer getUploadedEver() {
        return uploadedEver;
    }

    /**
     * @param uploadedEver the uploadedEver to set
     */
    public void setUploadedEver(Integer uploadedEver) {
        this.uploadedEver = uploadedEver;
    }

    /**
     * @return the uploadLimit
     */
    public Integer getUploadLimit() {
        return uploadLimit;
    }

    /**
     * @param uploadLimit the uploadLimit to set
     */
    public void setUploadLimit(Integer uploadLimit) {
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
    public Integer[] getWanted() {
        return wanted;
    }

    /**
     * @param wanted the wanted to set
     */
    public void setWanted(Integer[] wanted) {
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
    public Integer getWebseedsSendingToUs() {
        return webseedsSendingToUs;
    }

    /**
     * @param webseedsSendingToUs the webseedsSendingToUs to set
     */
    public void setWebseedsSendingToUs(Integer webseedsSendingToUs) {
        this.webseedsSendingToUs = webseedsSendingToUs;
    }
    
    
    public int getPiecesNum(){
        if(getPieces() == null){
            return -1;
        }
        BASE64Decoder dec = new BASE64Decoder();
        try{
            byte[] b = dec.decodeBuffer(getPieces());
            return b.length;
        }catch(IOException e){
            return -1;
        }
    }
    
    public String getPiecesStr(){
        if(getPieces() == null){
            return null;
        }
        BASE64Decoder dec = new BASE64Decoder();
        try{
            byte[] b = dec.decodeBuffer(getPieces());
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < b.length; i++){
                sb.append(Integer.toBinaryString(b[i]));
            }
            return sb.toString();
        }catch(IOException e){
            return null;
        }
    }
    
}
