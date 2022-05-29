package com.jonathan.bnccfinaltest;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Areacalculator extends Fragment {
    private EditText basevalue;
    private EditText heightvalue;
    private TextView areasqtrvalue;
    private EditText radiusvalue;
    private TextView areacircvalue;

    public Areacalculator() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view= inflater.inflate(R.layout.fragment_areacalculator, container, false);
        basevalue = (EditText) view.findViewById(R.id.basevalue);
        heightvalue = (EditText) view.findViewById(R.id.heightvalue);
        areasqtrvalue = (TextView) view.findViewById(R.id.areasqtrvalue);
        radiusvalue = (EditText) view.findViewById(R.id.radiusvalue);
        areacircvalue = (TextView) view.findViewById(R.id.areascirclevalue);


        return view;
    }

    public void calcsquare(View view) {
        int n1 = Integer.parseInt(basevalue.getText().toString());
        int n2 = Integer.parseInt(heightvalue.getText().toString());
        int product = n1*n2;
        areacircvalue.setText(String.valueOf(product));
    }

    public void calctri(View view) {
        int n1 = Integer.parseInt(basevalue.getText().toString());
        int n2 = Integer.parseInt(heightvalue.getText().toString());
        int product = n1*n2/2;
        areacircvalue.setText(String.valueOf(product));
    }

    public void calccircle(View view) {
        int n3 = Integer.parseInt(radiusvalue.getText().toString());
        float circproduct = n3*n3*355/113;
        areacircvalue.setText(String.valueOf(circproduct));
    }
}