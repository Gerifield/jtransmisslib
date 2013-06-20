/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.gerifield.jtransmisslib.gsonobj.gettorrent;

/**
 *
 * @author Gergely
 */
public class Peer {
    private String address;
    private String clientName;
    private boolean clientIsChoked;
    private boolean clientIsInterested;
    private String flagStr;
    private boolean isDownloadingFrom;
    private boolean isEncrypted;
    private boolean isIncoming;
    private boolean isUploadingTo;
    private boolean isUTP;
    private boolean peerIsChoked;
    private boolean peerIsInterested;
    private int port;
    private double progress;
    private int rateToClient;
    private int rateToPeer;

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the clientName
     */
    public String getClientName() {
        return clientName;
    }

    /**
     * @param clientName the clientName to set
     */
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    /**
     * @return the clientIsChoked
     */
    public boolean isClientIsChoked() {
        return clientIsChoked;
    }

    /**
     * @param clientIsChoked the clientIsChoked to set
     */
    public void setClientIsChoked(boolean clientIsChoked) {
        this.clientIsChoked = clientIsChoked;
    }

    /**
     * @return the clientIsInterested
     */
    public boolean isClientIsInterested() {
        return clientIsInterested;
    }

    /**
     * @param clientIsInterested the clientIsInterested to set
     */
    public void setClientIsInterested(boolean clientIsInterested) {
        this.clientIsInterested = clientIsInterested;
    }

    /**
     * @return the flagStr
     */
    public String getFlagStr() {
        return flagStr;
    }

    /**
     * @param flagStr the flagStr to set
     */
    public void setFlagStr(String flagStr) {
        this.flagStr = flagStr;
    }

    /**
     * @return the isDownloadingFrom
     */
    public boolean isIsDownloadingFrom() {
        return isDownloadingFrom;
    }

    /**
     * @param isDownloadingFrom the isDownloadingFrom to set
     */
    public void setIsDownloadingFrom(boolean isDownloadingFrom) {
        this.isDownloadingFrom = isDownloadingFrom;
    }

    /**
     * @return the isEncrypted
     */
    public boolean isIsEncrypted() {
        return isEncrypted;
    }

    /**
     * @param isEncrypted the isEncrypted to set
     */
    public void setIsEncrypted(boolean isEncrypted) {
        this.isEncrypted = isEncrypted;
    }

    /**
     * @return the isIncoming
     */
    public boolean isIsIncoming() {
        return isIncoming;
    }

    /**
     * @param isIncoming the isIncoming to set
     */
    public void setIsIncoming(boolean isIncoming) {
        this.isIncoming = isIncoming;
    }

    /**
     * @return the isUploadingTo
     */
    public boolean isIsUploadingTo() {
        return isUploadingTo;
    }

    /**
     * @param isUploadingTo the isUploadingTo to set
     */
    public void setIsUploadingTo(boolean isUploadingTo) {
        this.isUploadingTo = isUploadingTo;
    }

    /**
     * @return the isUTP
     */
    public boolean isIsUTP() {
        return isUTP;
    }

    /**
     * @param isUTP the isUTP to set
     */
    public void setIsUTP(boolean isUTP) {
        this.isUTP = isUTP;
    }

    /**
     * @return the peerIsChoked
     */
    public boolean isPeerIsChoked() {
        return peerIsChoked;
    }

    /**
     * @param peerIsChoked the peerIsChoked to set
     */
    public void setPeerIsChoked(boolean peerIsChoked) {
        this.peerIsChoked = peerIsChoked;
    }

    /**
     * @return the peerIsInterested
     */
    public boolean isPeerIsInterested() {
        return peerIsInterested;
    }

    /**
     * @param peerIsInterested the peerIsInterested to set
     */
    public void setPeerIsInterested(boolean peerIsInterested) {
        this.peerIsInterested = peerIsInterested;
    }

    /**
     * @return the port
     */
    public int getPort() {
        return port;
    }

    /**
     * @param port the port to set
     */
    public void setPort(int port) {
        this.port = port;
    }

    /**
     * @return the progress
     */
    public double getProgress() {
        return progress;
    }

    /**
     * @param progress the progress to set
     */
    public void setProgress(double progress) {
        this.progress = progress;
    }

    /**
     * @return the rateToClient
     */
    public int getRateToClient() {
        return rateToClient;
    }

    /**
     * @param rateToClient the rateToClient to set
     */
    public void setRateToClient(int rateToClient) {
        this.rateToClient = rateToClient;
    }

    /**
     * @return the rateToPeer
     */
    public int getRateToPeer() {
        return rateToPeer;
    }

    /**
     * @param rateToPeer the rateToPeer to set
     */
    public void setRateToPeer(int rateToPeer) {
        this.rateToPeer = rateToPeer;
    }
}
