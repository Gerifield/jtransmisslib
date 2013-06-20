/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.gerifield.jtransmisslib.gsonobj.gettorrent;


/**
 *
 * @author Gergely
 */
public class Response {
    private String result;
    private int tag;
    private Arguments arguments;

    /**
     * @return the result
     */
    public String getResult() {
        return result;
    }

    /**
     * @param result the result to set
     */
    public void setResult(String result) {
        this.result = result;
    }

    /**
     * @return the tag
     */
    public int getTag() {
        return tag;
    }

    /**
     * @param tag the tag to set
     */
    public void setTag(int tag) {
        this.tag = tag;
    }

    /**
     * @return the arguments
     */
    public Arguments getArguments() {
        return arguments;
    }

    /**
     * @param arguments the arguments to set
     */
    public void setArguments(Arguments arguments) {
        this.arguments = arguments;
    }
}
