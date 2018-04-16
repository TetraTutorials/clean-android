package com.tetraandroid.diffutilexample.root;

import android.app.Application;

import com.tetraandroid.diffutilexample.http.ApiModuleForInfo;
import com.tetraandroid.diffutilexample.http.ApiModuleForName;
import com.tetraandroid.diffutilexample.topmovies.TopMoviesModule;

public class App extends Application {

    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .apiModuleForName(new ApiModuleForName())
                .topMoviesModule(new TopMoviesModule())
                .apiModuleForInfo(new ApiModuleForInfo())
                .build();
    }

    public ApplicationComponent getComponent() {
        return component;
    }
}
