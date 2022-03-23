package com.example.dashboard;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class mythyroidadapter extends RecyclerView.Adapter<mythyroidadapter.mythyroidviewholder>{


    ArrayList<thyroidu> data;

    public mythyroidadapter(ArrayList<thyroidu> data) {
        this.data = data;
    }



    @NonNull
    @Override
    public mythyroidviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.thyroidsingle,parent,false);
        return new mythyroidviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull mythyroidviewholder holder, int position) {
        holder.t1t.setText(data.get(position).getTshdb());
        holder.t2t.setText(data.get(position).getTyidb());
        holder.t3t.setText(data.get(position).getT3udb());
        holder.t4t.setText(data.get(position).getFitdb());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }







    public class mythyroidviewholder extends RecyclerView.ViewHolder
    {
        TextView t1t,t2t,t3t,t4t;
        public mythyroidviewholder(@NonNull View itemView)
        {
            super(itemView);
            t1t= itemView.findViewById(R.id.t1t);
            t2t= itemView.findViewById(R.id.t2t);
            t3t= itemView.findViewById(R.id.t3t);
            t4t= itemView.findViewById(R.id.t4t);

        }
    }







}
