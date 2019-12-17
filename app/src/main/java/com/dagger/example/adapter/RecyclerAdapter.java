package com.dagger.example.adapter;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dagger.example.R;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {
    private ArrayList<String> stringArrayList;

    public RecyclerAdapter(ArrayList<String> stringArrayList) {
        this.stringArrayList = stringArrayList;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view, parent, false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        if (stringArrayList.get(position) != null && !TextUtils.isEmpty(stringArrayList.get(position))) {
            holder.tv_text.setText(stringArrayList.get(position));
        }
    }

    public void update(ArrayList<String> stringArrayList) {
        if (this.stringArrayList == null) {
            this.stringArrayList = new ArrayList<>();
        }
        this.stringArrayList = stringArrayList;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return stringArrayList != null ? stringArrayList.size() : 0;
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {
        private TextView tv_text;

        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_text = itemView.findViewById(R.id.tv_text);
        }
    }
}
