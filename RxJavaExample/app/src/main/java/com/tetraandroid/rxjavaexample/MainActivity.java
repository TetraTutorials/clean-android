package com.tetraandroid.rxjavaexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.tetraandroid.retrofitexample.R;
import com.tetraandroid.rxjavaexample.http.TwitchAPI;
import com.tetraandroid.rxjavaexample.http.apimodel.Top;
import com.tetraandroid.rxjavaexample.http.apimodel.Twitch;
import com.tetraandroid.rxjavaexample.root.App;

import javax.inject.Inject;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import rx.Observable;
import rx.Observer;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

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




        twitchAPI.getTopGamesObservable("replace_here_the_client_id_generated_by_the_twitch_api").flatMap(new Func1<Twitch, Observable<Top>>() {
            @Override
            public Observable<Top> call(Twitch twitch) {

                return Observable.from(twitch.getTop());
            }
        }).flatMap(new Func1<Top, Observable<String>>() {
            @Override
            public Observable<String> call(Top top) {

                return Observable.just(top.getGame().getName());

            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<String>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(String s) {

                System.out.println("From rx java: " + s);
            }
        });


       twitchAPI.getTopGamesObservable("replace_here_the_client_id_generated_by_the_twitch_api").flatMap(new Func1<Twitch, Observable<Top>>() {
            @Override
            public Observable<Top> call(Twitch twitch) {

                return Observable.from(twitch.getTop());
            }
        }).flatMap(new Func1<Top, Observable<Integer>>() {
            @Override
            public Observable<Integer> call(Top top) {

                return Observable.just(top.getGame().getPopularity());

            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<Integer>() {
           @Override
           public void onCompleted() {

           }

           @Override
           public void onError(Throwable e) {
               e.printStackTrace();

           }

           @Override
           public void onNext(Integer integer) {
               System.out.println("From rx java: Popularity is " + integer.toString());

           }
       });

        twitchAPI.getTopGamesObservable("replace_here_the_client_id_generated_by_the_twitch_api").flatMap(new Func1<Twitch, Observable<Top>>() {
            @Override
            public Observable<Top> call(Twitch twitch) {

                return Observable.from(twitch.getTop());
            }
        }).flatMap(new Func1<Top, Observable<String>>() {
            @Override
            public Observable<String> call(Top top) {

                return Observable.just(top.getGame().getName());

            }
        }).filter(new Func1<String, Boolean>() {
            @Override
            public Boolean call(String s) {
                return s.startsWith("H");
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Subscriber<String>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(String s) {
                System.out.println("From rx java with filter: " + s);

            }
        });

    }
}
