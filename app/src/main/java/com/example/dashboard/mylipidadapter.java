package com.example.dashboard;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class mylipidadapter extends RecyclerView.Adapter<mylipidadapter.mylipidviewholder>{

    ArrayList<lipidu> data;

    public mylipidadapter(ArrayList<lipidu> data) {
        this.data = data;
    }


    @NonNull
    @Override
    public mylipidviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.lipidsingle,parent,false);
        return new mylipidviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull mylipidviewholder holder, int position) {
        holder.t1l.setText(data.get(position).getChldb());
        holder.t2l.setText(data.get(position).getTildb());
        holder.t3l.setText(data.get(position).getHdlcdb());
        holder.t4l.setText(data.get(position).getLdlcdb());
        holder.t5l.setText(data.get(position).getVldlcdb());
        holder.t6l.setText(data.get(position).getChohdldb());
        holder.t7l.setText(data.get(position).getLdlhdldb());
        holder.t8l.setText(data.get(position).getNon_hdldb());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }












    public class mylipidviewholder extends RecyclerView.ViewHolder
    {
            TextView t1l,t2l,t3l,t4l,t5l,t6l,t7l,t8l;

        public mylipidviewholder(@NonNull View itemView) {
            super(itemView);
            t1l= itemView.findViewById(R.id.t1l);
            t2l= itemView.findViewById(R.id.t2l);
            t3l= itemView.findViewById(R.id.t3l);
            t4l= itemView.findViewById(R.id.t4l);
            t5l= itemView.findViewById(R.id.t5l);
            t6l= itemView.findViewById(R.id.t6l);
            t7l= itemView.findViewById(R.id.t7l);
            t8l= itemView.findViewById(R.id.t8l);
        }
    }


}
