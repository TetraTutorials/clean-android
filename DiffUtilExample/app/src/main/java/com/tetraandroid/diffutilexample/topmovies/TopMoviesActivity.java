package com.tetraandroid.diffutilexample.topmovies;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.tetraandroid.diffutilexample.helper.DividerItemDecoration;
import com.tetraandroid.diffutilexample.http.apimodel.Result;
import com.tetraandroid.diffutilexample.root.App;
import com.tetraandroid.retrofitexample.R;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TopMoviesActivity extends AppCompatActivity implements TopMoviesActivityMVP.View {

    private final String TAG = TopMoviesActivity.class.getName();

    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;

    @BindView(R.id.rootView)
    ViewGroup rootView;

    @BindView(R.id.swipeRefresh)
    SwipeRefreshLayout swipeRefreshLayout;

    @Inject
    TopMoviesActivityMVP.Presenter presenter;

    private ListAdapter listAdapter;
    private List<Result> resultList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.topmovies_activity);

        ((App) getApplication()).getComponent().inject(this);
        ButterKnife.bind(this);

        swipeRefreshLayout.setOnRefreshListener(() -> presenter.loadData());

        listAdapter = new ListAdapter(resultList);
        recyclerView.setAdapter(listAdapter);
        recyclerView.addItemDecoration(new DividerItemDecoration(this));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        presenter.attachView(this);
        presenter.loadData();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.detachView();
    }

    @Override
    public void updateData(List<Result> results) {
        listAdapter.updateData(results);
    }

    @Override
    public void showSnackbar(String msg) {
        Snackbar.make(rootView, msg, Snackbar.LENGTH_SHORT).show();
    }

    @Override
    public void setLoading(boolean isLoading) {
        swipeRefreshLayout.setRefreshing(isLoading);
    }

}
