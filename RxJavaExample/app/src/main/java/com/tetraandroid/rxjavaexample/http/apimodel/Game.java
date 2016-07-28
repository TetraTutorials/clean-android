
package com.tetraandroid.rxjavaexample.http.apimodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Game {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("popularity")
    @Expose
    private Integer popularity;
    @SerializedName("_id")
    @Expose
    private Integer id;
    @SerializedName("giantbomb_id")
    @Expose
    private Integer giantbombId;
    @SerializedName("box")
    @Expose
    private Box box;
    @SerializedName("logo")
    @Expose
    private Logo logo;
    @SerializedName("_links")
    @Expose
    private Links_ links;

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The popularity
     */
    public Integer getPopularity() {
        return popularity;
    }

    /**
     * 
     * @param popularity
     *     The popularity
     */
    public void setPopularity(Integer popularity) {
        this.popularity = popularity;
    }

    /**
     * 
     * @return
     *     The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The _id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The giantbombId
     */
    public Integer getGiantbombId() {
        return giantbombId;
    }

    /**
     * 
     * @param giantbombId
     *     The giantbomb_id
     */
    public void setGiantbombId(Integer giantbombId) {
        this.giantbombId = giantbombId;
    }

    /**
     * 
     * @return
     *     The box
     */
    public Box getBox() {
        return box;
    }

    /**
     * 
     * @param box
     *     The box
     */
    public void setBox(Box box) {
        this.box = box;
    }

    /**
     * 
     * @return
     *     The logo
     */
    public Logo getLogo() {
        return logo;
    }

    /**
     * 
     * @param logo
     *     The logo
     */
    public void setLogo(Logo logo) {
        this.logo = logo;
    }

    /**
     * 
     * @return
     *     The links
     */
    public Links_ getLinks() {
        return links;
    }

    /**
     * 
     * @param links
     *     The _links
     */
    public void setLinks(Links_ links) {
        this.links = links;
    }

}
