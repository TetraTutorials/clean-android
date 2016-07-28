package com.tetraandroid.retrofitexample.root;

import com.tetraandroid.retrofitexample.MainActivity;
import com.tetraandroid.retrofitexample.http.ApiModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class, ApiModule.class})
public interface ApplicationComponent {

    void inject(MainActivity target);

}
