/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.gerifield.jtransmisslib;

import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author Gergely
 */
public class Torrent {

    private HashMap<String, Object> properties;

    public Torrent() {
        this.properties = new HashMap<>();
    }

    public Object addProperty(String key, Object value) {
        return this.getProperties().put(key, value);
    }

    public Object getProperty(String key) {
        return this.getProperties().get(key);
    }

    public Set<String> getKeys() {
        return this.getProperties().keySet();
    }

    /**
     * @return the properties
     */
    public HashMap<String, Object> getProperties() {
        return properties;
    }

    @Override
    public String toString() {
        if (this.getProperties().containsKey("name")) {
            return (String) this.getProperties().get("name");
        } else if (this.getProperties().containsKey("id")) {
            return (String) this.getProperties().get("id");
        } else {
            return super.toString();
        }
    }
}
