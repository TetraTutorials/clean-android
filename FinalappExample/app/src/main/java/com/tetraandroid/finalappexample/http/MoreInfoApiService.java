package com.tetraandroid.finalappexample.http;

import com.tetraandroid.finalappexample.http.apimodel.OmdbApi;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

public interface MoreInfoApiService {

    @GET("/")
    Observable <OmdbApi> getCountry(@Query("t") String title);


}
