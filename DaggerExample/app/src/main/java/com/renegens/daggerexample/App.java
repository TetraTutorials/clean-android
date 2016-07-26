package com.renegens.daggerexample;

import android.app.Application;

/**
 * Created by renegens on 25/07/16.
 */

public class App extends Application {

    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        //needs to run once to generate it
        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();

    }


    public ApplicationComponent getComponent() {
        return component;
    }

}
