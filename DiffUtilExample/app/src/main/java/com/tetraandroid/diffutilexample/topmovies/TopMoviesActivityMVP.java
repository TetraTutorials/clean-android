package com.tetraandroid.diffutilexample.topmovies;


import com.tetraandroid.diffutilexample.http.apimodel.Result;

import java.util.List;


public interface TopMoviesActivityMVP {

    interface View {

        void updateData(List<Result> results);

        void showSnackbar(String s);

        void setLoading(boolean isLoading);

    }

    interface Presenter {

        void loadData();

        void detachView();

        void attachView(TopMoviesActivityMVP.View view);

    }

}
