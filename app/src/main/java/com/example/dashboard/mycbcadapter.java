package com.example.dashboard;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class mycbcadapter extends RecyclerView.Adapter<mycbcadapter.mycbcviewholder> {

    ArrayList<cbcu> data;

    public mycbcadapter(ArrayList<cbcu> data) {
        this.data = data;
    }


    @NonNull
    @Override
    public mycbcviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.cbcsingle,parent,false);
        return new mycbcviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull mycbcviewholder holder, int position) {
        holder.t1c.setText(data.get(position).getWbcdb());
        holder.t2c.setText(data.get(position).getRbcdb());
        holder.t3c.setText(data.get(position).getPlcdb());
        holder.t4c.setText(data.get(position).getHmbdb());
        holder.t5c.setText(data.get(position).getPcvdb());
        holder.t6c.setText(data.get(position).getMcvdb());
        holder.t7c.setText(data.get(position).getMchdb());
        holder.t8c.setText(data.get(position).getMchcdb());
        holder.t9c.setText(data.get(position).getRcddb());
        holder.t10c.setText(data.get(position).getNtdb());
        holder.t11c.setText(data.get(position).getLpdb());
        holder.t12c.setText(data.get(position).getEpdb());
        holder.t13c.setText(data.get(position).getPmdb());
        holder.t14c.setText(data.get(position).getMcdb());
        holder.t15c.setText(data.get(position).getBpdb());


    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class mycbcviewholder extends RecyclerView.ViewHolder {


        TextView t1c,t2c,t3c,t4c,t5c,t6c,t7c,t8c,t9c,t10c,t11c,t12c,t13c,t14c,t15c;

        public mycbcviewholder(@NonNull View itemView) {
            super(itemView);
            t1c = (TextView) itemView.findViewById(R.id.t1c);
            t2c = (TextView) itemView.findViewById(R.id.t2c);
            t3c = (TextView) itemView.findViewById(R.id.t3c);
            t4c = (TextView) itemView.findViewById(R.id.t4c);
            t5c = (TextView) itemView.findViewById(R.id.t5c);
            t6c = (TextView) itemView.findViewById(R.id.t6c);
            t7c = (TextView) itemView.findViewById(R.id.t7c);
            t8c = (TextView) itemView.findViewById(R.id.t8c);
            t9c = (TextView) itemView.findViewById(R.id.t9c);
            t10c = (TextView) itemView.findViewById(R.id.t10c);
            t11c = (TextView) itemView.findViewById(R.id.t11c);
            t12c = (TextView) itemView.findViewById(R.id.t12c);
            t13c = (TextView) itemView.findViewById(R.id.t13c);
            t14c = (TextView) itemView.findViewById(R.id.t14c);
            t15c = (TextView) itemView.findViewById(R.id.t15c);


        }

    }


    }
