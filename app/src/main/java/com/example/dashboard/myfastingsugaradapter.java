package com.example.dashboard;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class myfastingsugaradapter extends RecyclerView.Adapter<myfastingsugaradapter.myfastingsugarviewholder>{

    ArrayList<fastingsugaru> data;

    public myfastingsugaradapter(ArrayList<fastingsugaru> data) {
        this.data = data;
    }
    @NonNull
    @Override
    public myfastingsugarviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.fastingsugarsingle,parent,false);
        return new myfastingsugarviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myfastingsugarviewholder holder, int position) {
        holder.t1f.setText(data.get(position).getFastingsugardb());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class myfastingsugarviewholder extends RecyclerView.ViewHolder
    {

        TextView t1f;
        public myfastingsugarviewholder(@NonNull View itemView) {
            super(itemView);
            t1f = itemView.findViewById(R.id.t1f);

        }
    }






}
