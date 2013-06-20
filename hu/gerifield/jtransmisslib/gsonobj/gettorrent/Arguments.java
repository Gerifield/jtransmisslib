/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.gerifield.jtransmisslib.gsonobj.gettorrent;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Gergely
 */
public class Arguments {
    private List<Torrent> torrents = new LinkedList<>();

    /**
     * @return the torrents
     */
    public List<Torrent> getTorrents() {
        return torrents;
    }

    /**
     * @param torrents the torrents to set
     */
    public void setTorrents(List<Torrent> torrents) {
        this.torrents = torrents;
    }
}
