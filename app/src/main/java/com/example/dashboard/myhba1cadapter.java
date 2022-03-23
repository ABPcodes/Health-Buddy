package com.example.dashboard;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class myhba1cadapter extends RecyclerView.Adapter<myhba1cadapter.myhba1cviewholder>{



    ArrayList<hba1cu> data;

    public myhba1cadapter(ArrayList<hba1cu> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public myhba1cviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.hba1csingle,parent,false);
        return new myhba1cviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myhba1cviewholder holder, int position) {
        holder.t1h.setText(data.get(position).getGlydb());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }


    public class myhba1cviewholder extends RecyclerView.ViewHolder
    {

        TextView t1h;
        public myhba1cviewholder(@NonNull View itemView) {

            super(itemView);

            t1h = itemView.findViewById(R.id.t1h);
        }
    }













}

