package com.tetraandroid.diffutilexample.topmovies;

import com.tetraandroid.diffutilexample.http.MovieApiService;

import dagger.Module;
import dagger.Provides;

@Module
public class TopMoviesModule {

    @Provides
    public TopMoviesActivityMVP.Presenter provideTopMoviesActivityPresenter(MovieApiService movieApiService) {
        return new TopMoviesPresenter(movieApiService);
    }

}
