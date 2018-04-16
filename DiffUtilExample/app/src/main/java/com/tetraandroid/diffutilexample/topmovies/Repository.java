package com.tetraandroid.diffutilexample.topmovies;

import com.tetraandroid.diffutilexample.http.apimodel.Result;

import io.reactivex.Observable;


public interface Repository {

    Observable<Result> getResultsFromMemory();

    Observable<Result> getResultsFromNetwork();

    Observable<String> getCountriesFromMemory();

    Observable<String> getCountriesFromNetwork();

    Observable<String> getCountryData();

    Observable<Result> getResultData();

}
