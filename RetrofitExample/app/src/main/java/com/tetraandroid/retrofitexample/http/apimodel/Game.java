package com.tetraandroid.retrofitexample.http.apimodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Game {

    @SerializedName("_id")
    @Expose
    private Integer id;
    @SerializedName("box")
    @Expose
    private Box box;
    @SerializedName("giantbomb_id")
    @Expose
    private Integer giantbombId;
    @SerializedName("logo")
    @Expose
    private Logo logo;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("popularity")
    @Expose
    private Integer popularity;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Box getBox() {
        return box;
    }

    public void setBox(Box box) {
        this.box = box;
    }

    public Integer getGiantbombId() {
        return giantbombId;
    }

    public void setGiantbombId(Integer giantbombId) {
        this.giantbombId = giantbombId;
    }

    public Logo getLogo() {
        return logo;
    }

    public void setLogo(Logo logo) {
        this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPopularity() {
        return popularity;
    }

    public void setPopularity(Integer popularity) {
        this.popularity = popularity;
    }

}
