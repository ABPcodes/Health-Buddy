package com.example.dashboard;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;


public class reports extends Fragment {



    public reports() {
        // Required empty public constructor
    }


    LinearLayout CBC,LIPID,HBA1C,THYROID,CRP;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_reports, container, false);


        CBC = (LinearLayout) view.findViewById(R.id.cbc);
        CBC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent1 = new Intent(getActivity(),cbc.class);
               startActivity(intent1);
            }
        });


        LIPID = (LinearLayout) view.findViewById(R.id.lipid);
        LIPID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(getActivity(),lipid123.class);
                startActivity(intent2);
            }
        });



        THYROID = (LinearLayout) view.findViewById(R.id.thyroid);
        THYROID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(getActivity(),thyroid.class);
                startActivity(intent3);
            }
        });



        HBA1C = (LinearLayout) view.findViewById(R.id.hba1c);
        HBA1C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(getActivity(),hba1c.class);
                startActivity(intent4);
            }
        });



        CRP = (LinearLayout) view.findViewById(R.id.crp);
        CRP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(getActivity(),crp.class);
                startActivity(intent5);
            }
        });





        return view;
    }
}