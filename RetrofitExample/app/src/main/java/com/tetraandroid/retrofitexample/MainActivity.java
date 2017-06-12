package com.tetraandroid.retrofitexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.tetraandroid.retrofitexample.http.TwitchAPI;
import com.tetraandroid.retrofitexample.http.apimodel.Top;
import com.tetraandroid.retrofitexample.http.apimodel.Twitch;
import com.tetraandroid.retrofitexample.root.App;

import java.util.List;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Inject
    TwitchAPI twitchAPI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((App)getApplication()).getComponent().inject(this);

        Call<Twitch> call = twitchAPI.getTopGames("replace_here_the_client_id_generated_by_the_twitch_api");

        call.enqueue(new Callback<Twitch>() {
            @Override
            public void onResponse(Call<Twitch> call, Response<Twitch> response) {
                List<Top> gameList = response.body().getTop();

                for (Top top : gameList){
                    System.out.println(top.getGame().getName());
                }
            }

            @Override
            public void onFailure(Call<Twitch> call, Throwable t) {
                     t.printStackTrace();
            }
        });

    }
}
