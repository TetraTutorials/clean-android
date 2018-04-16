package com.tetraandroid.diffutilexample.root;

import com.tetraandroid.diffutilexample.http.ApiModuleForInfo;
import com.tetraandroid.diffutilexample.http.ApiModuleForName;
import com.tetraandroid.diffutilexample.topmovies.TopMoviesActivity;
import com.tetraandroid.diffutilexample.topmovies.TopMoviesModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class, ApiModuleForName.class, ApiModuleForInfo.class,TopMoviesModule.class})
public interface ApplicationComponent {

    void inject(TopMoviesActivity target);

}
