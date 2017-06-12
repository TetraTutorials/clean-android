
package com.tetraandroid.retrofitexample.http.apimodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Twitch {

    @SerializedName("_total")
    @Expose
    private Integer total;
    @SerializedName("top")
    @Expose
    private List<Top> top = null;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<Top> getTop() {
        return top;
    }

    public void setTop(List<Top> top) {
        this.top = top;
    }

}
