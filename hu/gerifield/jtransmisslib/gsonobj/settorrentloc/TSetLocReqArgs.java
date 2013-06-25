/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.gerifield.jtransmisslib.gsonobj.settorrentloc;

import java.util.List;

/**
 *
 * @author Gergely
 */
public class TSetLocReqArgs {
    private List<Integer> ids;
    private String location;
    private Boolean move;

    /**
     * @return the ids
     */
    public List<Integer> getIds() {
        return ids;
    }

    /**
     * @param ids the ids to set
     */
    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return the move
     */
    public Boolean getMove() {
        return move;
    }

    /**
     * @param move the move to set
     */
    public void setMove(Boolean move) {
        this.move = move;
    }
    
}
