package com.example.dashboard;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;


public class doctor extends Fragment {



    public doctor() {
        // Required empty public constructor
    }

    String[] items = {"Material", "Design", "Components","Android", "5.0 Lollipop" };

    AutoCompleteTextView autoCompleteTxt;

    ArrayAdapter<String> adapterItems;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_doctor, container, false);



        autoCompleteTxt = view.findViewById(R.id.auto_complete_txt);





       // adapterItems = new ArrayAdapter<String>(this,R.layout.list_item,items);


       // listAdapter = new ArrayAdapter<String>(getActivity(), R.layout.simplerow, planetList);

        adapterItems = new ArrayAdapter<String>(getActivity(), R.layout.list_item,items);







        autoCompleteTxt.setAdapter(adapterItems);

       autoCompleteTxt.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               String item = parent.getItemAtPosition(position).toString();
               Toast.makeText(getActivity(), "Item: "+item, Toast.LENGTH_SHORT).show();
           }
       });

        return view;

    }
}