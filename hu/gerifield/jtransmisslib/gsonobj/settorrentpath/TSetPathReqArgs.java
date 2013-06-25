/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.gerifield.jtransmisslib.gsonobj.settorrentpath;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Gergely
 */
public class TSetPathReqArgs {
    private List<Integer> ids;
    private String path;
    private String name;

    /**
     * ID-k megadása string alapján
     * @param ids 
     */
    public void setIds(String ids){
        if(ids != null && !ids.isEmpty()){
            this.ids = new LinkedList<>();
            
            Scanner sc = new Scanner(ids).useDelimiter(", *");
            while(sc.hasNext()){
                this.ids.add(Integer.parseInt(sc.next()));
            }
        }
    }
    
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
     * @return the path
     */
    public String getPath() {
        return path;
    }

    /**
     * @param path the path to set
     */
    public void setPath(String path) {
        this.path = path;
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
    
}
