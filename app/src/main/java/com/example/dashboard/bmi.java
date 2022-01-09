package com.example.dashboard;

import android.content.Intent;
import android.os.Bundle;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;


public class bmi extends Fragment {

    public bmi() {
        // Required empty public constructor
    }



    android.widget.Button mcalcuatebmi;

    TextView mcurrentheight;
    TextView mcurrentage,mcurrentweight;
    ImageView mincrementage, mincrementweight, mdecrementage, mdecrementweight;
    SeekBar mseekbarforheight;
    RelativeLayout mmale, mfemale;
    int intweight=55;
    int intage=22;
    int currentprogress;
    String mintprogress = "170";
    String typeofuser = "0";
    String weight2 = "55";
    String age2 = "22";




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bmi, container, false);



        mcalcuatebmi = view.findViewById(R.id.calcuatebmi);
        mcurrentage= view.findViewById(R.id.currentage);
        mcurrentweight= view.findViewById(R.id.currentweight);
        mcurrentheight= view.findViewById(R.id.currentheight);
        mincrementage= view.findViewById(R.id.incrementage);
        mdecrementage= view.findViewById(R.id.decrementage);
        mincrementweight= view.findViewById(R.id.incrementweight);
        mdecrementweight= view.findViewById(R.id.decrementweight);
        mseekbarforheight= view.findViewById(R.id.seekbarforheight);
        mmale= view.findViewById(R.id.male);
        mfemale= view.findViewById(R.id.female);






        mmale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mmale.setBackground(ContextCompat.getDrawable(getActivity().getApplicationContext(),R.drawable.malefemalefocus));
                mfemale.setBackground(ContextCompat.getDrawable(getActivity().getApplicationContext(),R.drawable.malefemalenotfocus));
                typeofuser="Male";

            }
        });




        mfemale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mfemale.setBackground(ContextCompat.getDrawable(getActivity().getApplicationContext(),R.drawable.malefemalefocus));
                mmale.setBackground(ContextCompat.getDrawable(getActivity().getApplicationContext(),R.drawable.malefemalenotfocus));
                typeofuser="Female";
            }
        });



        mseekbarforheight.setMax(400);
        mseekbarforheight.setProgress(170);
        mseekbarforheight.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                currentprogress  = progress;
                mintprogress = String.valueOf(currentprogress);
                mcurrentheight.setText(mintprogress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });




        mincrementage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intage = intage+1;
                age2 = String.valueOf(intage);
                mcurrentage.setText(age2);
            }
        });




        mdecrementage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intage = intage-1;
                age2 = String.valueOf(intage);
                mcurrentage.setText(age2);
            }
        });


        mincrementweight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intweight = intweight+1;
                weight2 = String.valueOf(intweight);
                mcurrentweight.setText(weight2);
            }
        });


        mdecrementweight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intweight = intweight-1;
                weight2 = String.valueOf(intweight);
                mcurrentweight.setText(weight2);
            }
        });




        mcalcuatebmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (typeofuser.equals("0"))
                {
                    Toast.makeText(getActivity().getApplicationContext(), "Select Your Gender First", Toast.LENGTH_SHORT).show();


                }


                else if (mintprogress.equals("0"))
                {
                    Toast.makeText(getActivity().getApplicationContext(), "Select Your Height First", Toast.LENGTH_SHORT).show();

                }

                else if (intage == 0 || intage < 0)
                {
                    Toast.makeText(getActivity().getApplicationContext(), "Age is incorrect", Toast.LENGTH_SHORT).show();


                }

                else if (intweight == 0 || intweight < 0)
                {
                    Toast.makeText(getActivity().getApplicationContext(), "Weight is incorrect", Toast.LENGTH_SHORT).show();

                }


                else
                {
                    Intent intent = new Intent(getActivity(),bmiactivity.class);
                    intent.putExtra("gender", typeofuser);
                    intent.putExtra("height", mintprogress);
                    intent.putExtra("weight", weight2);
                    intent.putExtra("age", age2);
                    startActivity(intent);

                }

//                Intent intent = new Intent(getActivity(), MainActivityList.class);
//                startActivity(intent);
//                Intent intent = new Intent(getActivity().getApplication(), MainActivityList.class);
//                startActivity(intent);

//                else{
//
//                    Intent intent = new Intent(bmi.this, bmiactivity.class);
//                    intent.putExtra("gender", typeofuser);
//                    intent.putExtra("height", mintprogress);
//                    intent.putExtra("weight", weight2);
//                    intent.putExtra("age", age2);
//                    startActivity(intent);
//                }



            }
        });




















        return view;

    }
}