
package com.tetraandroid.rxjavaexample.http.apimodel;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Top {

    @SerializedName("game")
    @Expose
    private Game game;
    @SerializedName("viewers")
    @Expose
    private Integer viewers;
    @SerializedName("channels")
    @Expose
    private Integer channels;

    /**
     * 
     * @return
     *     The game
     */
    public Game getGame() {
        return game;
    }

    /**
     * 
     * @param game
     *     The game
     */
    public void setGame(Game game) {
        this.game = game;
    }

    /**
     * 
     * @return
     *     The viewers
     */
    public Integer getViewers() {
        return viewers;
    }

    /**
     * 
     * @param viewers
     *     The viewers
     */
    public void setViewers(Integer viewers) {
        this.viewers = viewers;
    }

    /**
     * 
     * @return
     *     The channels
     */
    public Integer getChannels() {
        return channels;
    }

    /**
     * 
     * @param channels
     *     The channels
     */
    public void setChannels(Integer channels) {
        this.channels = channels;
    }

}
