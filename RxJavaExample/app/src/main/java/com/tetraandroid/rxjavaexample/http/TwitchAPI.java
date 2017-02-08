package com.tetraandroid.rxjavaexample.http;

import com.tetraandroid.rxjavaexample.http.apimodel.Twitch;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import rx.Observable;

public interface TwitchAPI {

    @GET("games/top")
    Call<Twitch> getTopGames(@Header("Client-Id") String clientId);

    @GET("games/top")
    Observable <Twitch> getTopGamesObservable(@Header("Client-Id") String clientId);





}
