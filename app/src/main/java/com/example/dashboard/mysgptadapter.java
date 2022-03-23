package com.example.dashboard;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class mysgptadapter extends RecyclerView.Adapter<mysgptadapter.mysgptviewholder> {


    ArrayList<sgptu> data;

    public mysgptadapter(ArrayList<sgptu> data) {
        this.data = data;
    }



    @NonNull
    @Override
    public mysgptviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.sgptsingle,parent,false);

        return new mysgptviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull mysgptviewholder holder, int position) {
        holder.t1s.setText(data.get(position).getBitdb());
        holder.t2s.setText(data.get(position).getBiodb());
        holder.t3s.setText(data.get(position).getBicdb());
        holder.t4s.setText(data.get(position).getSgotdb());
        holder.t5s.setText(data.get(position).getSgptdb());
        holder.t6s.setText(data.get(position).getApdb());
        holder.t7s.setText(data.get(position).getTpdb());
        holder.t8s.setText(data.get(position).getAsdb());
        holder.t9s.setText(data.get(position).getGdb());
        holder.t10s.setText(data.get(position).getAgdb());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class mysgptviewholder extends RecyclerView.ViewHolder
    {
        TextView t1s,t2s,t3s,t4s,t5s,t6s,t7s,t8s,t9s,t10s;

        public mysgptviewholder(@NonNull View itemView) {
            super(itemView);
            t1s= itemView.findViewById(R.id.t1s);
            t2s= itemView.findViewById(R.id.t2s);
            t3s= itemView.findViewById(R.id.t3s);
            t4s= itemView.findViewById(R.id.t4s);
            t5s= itemView.findViewById(R.id.t5s);
            t6s= itemView.findViewById(R.id.t6s);
            t7s= itemView.findViewById(R.id.t7s);
            t8s= itemView.findViewById(R.id.t8s);
            t9s = itemView.findViewById(R.id.t9s);
            t10s  = itemView.findViewById(R.id.t10s);
        }
    }




}
