
package com.tetraandroid.rxjavaexample.http.apimodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

@Generated("org.jsonschema2pojo")
public class Twitch {

    @SerializedName("_total")
    @Expose
    private Integer total;
    @SerializedName("_links")
    @Expose
    private Links links;
    @SerializedName("top")
    @Expose
    private List<Top> top = new ArrayList<Top>();

    /**
     * 
     * @return
     *     The total
     */
    public Integer getTotal() {
        return total;
    }

    /**
     * 
     * @param total
     *     The _total
     */
    public void setTotal(Integer total) {
        this.total = total;
    }

    /**
     * 
     * @return
     *     The links
     */
    public Links getLinks() {
        return links;
    }

    /**
     * 
     * @param links
     *     The _links
     */
    public void setLinks(Links links) {
        this.links = links;
    }

    /**
     * 
     * @return
     *     The top
     */
    public List<Top> getTop() {
        return top;
    }

    /**
     * 
     * @param top
     *     The top
     */
    public void setTop(List<Top> top) {
        this.top = top;
    }

}
