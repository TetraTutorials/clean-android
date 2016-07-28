package com.tetraandroid.rxjavaexample.root;

import com.tetraandroid.rxjavaexample.MainActivity;
import com.tetraandroid.rxjavaexample.http.ApiModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class, ApiModule.class})
public interface ApplicationComponent {

    void inject(MainActivity target);

}
