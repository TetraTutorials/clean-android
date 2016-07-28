package com.tetraandroid.rxjavaexample.http;

import com.tetraandroid.rxjavaexample.http.apimodel.Twitch;

import retrofit2.Call;
import retrofit2.http.GET;
import rx.Observable;

public interface TwitchAPI {

    @GET("games/top")
    Call <Twitch> getTopGames();

    @GET("games/top")
    Observable <Twitch> getTopGamesObservable();





}
