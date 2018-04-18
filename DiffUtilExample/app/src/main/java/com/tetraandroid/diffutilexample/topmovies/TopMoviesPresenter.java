package com.tetraandroid.diffutilexample.topmovies;

import com.tetraandroid.diffutilexample.http.MovieApiService;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;


public class TopMoviesPresenter implements TopMoviesActivityMVP.Presenter {

    private TopMoviesActivityMVP.View view;
    private CompositeDisposable subscription;
    private MovieApiService service;

    public TopMoviesPresenter(MovieApiService service) {
        this.service = service;
        subscription = new CompositeDisposable();
    }

    @Override
    public void attachView(TopMoviesActivityMVP.View view) {
        this.view = view;
    }

    @Override
    public void detachView() {
        subscription.clear();
    }

    @Override
    public void loadData() {
        if (view != null) {
            view.setLoading(true);
        }

        subscription.add(
                service.getTopRatedMovies(1)
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .doOnTerminate(() -> {
                            if (view != null) {
                                view.setLoading(false);
                            }
                        })
                        .subscribe(topRated -> {
                            if (view != null) {
                                view.updateData(topRated.results);
                            }
                        }, error -> {
                            if (view != null) {
                                view.showSnackbar(error.getLocalizedMessage());
                            }
                        })
        );
    }

}
