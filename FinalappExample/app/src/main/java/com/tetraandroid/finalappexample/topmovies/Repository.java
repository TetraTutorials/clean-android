package com.tetraandroid.finalappexample.topmovies;

import com.tetraandroid.finalappexample.http.apimodel.Result;

import rx.Observable;


public interface Repository {

    Observable<Result> getResultsFromMemory();

    Observable<Result> getResultsFromNetwork();

    Observable<String> getCountriesFromMemory();

    Observable<String> getCountriesFromNetwork();

    Observable<String> getCountryData();

    Observable<Result> getResultData();

}
