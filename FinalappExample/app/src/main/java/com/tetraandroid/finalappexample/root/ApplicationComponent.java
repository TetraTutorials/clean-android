package com.tetraandroid.finalappexample.root;

import com.tetraandroid.finalappexample.http.ApiModuleForInfo;
import com.tetraandroid.finalappexample.http.ApiModuleForName;
import com.tetraandroid.finalappexample.topmovies.TopMoviesActivity;
import com.tetraandroid.finalappexample.topmovies.TopMoviesModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class, ApiModuleForName.class, ApiModuleForInfo.class,TopMoviesModule.class})
public interface ApplicationComponent {

    void inject(TopMoviesActivity target);

}
