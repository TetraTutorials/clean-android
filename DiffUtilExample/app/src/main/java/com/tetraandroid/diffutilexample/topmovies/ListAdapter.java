package com.tetraandroid.diffutilexample.topmovies;

import android.support.v7.util.DiffUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.tetraandroid.diffutilexample.helper.MyDiffUtil;
import com.tetraandroid.diffutilexample.http.apimodel.Result;
import com.tetraandroid.retrofitexample.R;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ListItemViewHolder> {

    private List<Result> list;

    public ListAdapter(List<Result> list) {
        this.list = list;
    }

    @Override
    public ListItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView =
                LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_list_row, parent, false);
        return new ListItemViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ListItemViewHolder holder, int position) {
        holder.itemName.setText(list.get(position).title);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public void updateData(List<Result> newList) {
        MyDiffUtil diffUtil = new MyDiffUtil(list, newList);
        DiffUtil.DiffResult diffResult = DiffUtil.calculateDiff(diffUtil);
        list.clear();
        list.addAll(newList);
        diffResult.dispatchUpdatesTo(this);
    }

    public static class ListItemViewHolder extends RecyclerView.ViewHolder {

        public TextView itemName;

        public ListItemViewHolder(View itemView) {
            super(itemView);
            itemName = itemView.findViewById(R.id.movieName);
        }
    }
}

