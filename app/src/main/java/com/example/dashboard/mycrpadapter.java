package com.example.dashboard;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class mycrpadapter  extends RecyclerView.Adapter<mycrpadapter.mycrpviewholder>{


    ArrayList<crpu> data;

    public mycrpadapter(ArrayList<crpu> data) {
        this.data = data;
    }



    @NonNull
    @Override
    public mycrpviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.crpsingle,parent,false);
        return new mycrpviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull mycrpviewholder holder, int position) {
        holder.t1c.setText(data.get(position).getCrpu());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }





    public class mycrpviewholder extends RecyclerView.ViewHolder{







        TextView t1c;

        public mycrpviewholder(@NonNull View itemView)
        {
            super(itemView);
            t1c = (TextView) itemView.findViewById(R.id.t1c);


        }








    }






}
