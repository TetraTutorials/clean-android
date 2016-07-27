package com.tetraandroid.junitexample.root;

import android.app.Application;

import com.tetraandroid.junitexample.login.LoginModule;
import com.tetraandroid.junitexamplev.root.ApplicationComponent;
import com.tetraandroid.junitexamplev.root.DaggerApplicationComponent;

public class App extends Application {

    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .loginModule(new LoginModule())
                .build();
    }

    public ApplicationComponent getComponent() {
        return component;
    }
}
