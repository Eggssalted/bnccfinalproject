package com.jonathan.bnccfinaltest;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;


public class Volumecalculator extends Fragment {
    private EditText volumebase;
    private EditText volumeheight;
    private EditText volumewidth;
    private EditText volumeradius;
    private EditText volumeheight2;
    private TextView volumetotalblock;
    private TextView volumetotalcylinder;

    public Volumecalculator() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_volumecalculator, container, false);
        volumebase = (EditText) view.findViewById(R.id.volumebase);
        volumeheight = (EditText) view.findViewById(R.id.volumeheight);
        volumewidth = (EditText) view.findViewById(R.id.volumewidth);
        volumeradius = (EditText) view.findViewById(R.id.volumeradius);
        volumeheight2 = (EditText) view.findViewById(R.id.volumeheight2);
        volumetotalblock = (TextView) view.findViewById(R.id.volumetotalblock);
        volumetotalcylinder = (TextView) view.findViewById(R.id.volumetotalcyl);
        return view;
    }

    public void calcpyramidvolume(View view) {
        int n1 = Integer.parseInt(volumebase.getText().toString());
        int n2 = Integer.parseInt(volumeheight.getText().toString());
        int n3 = Integer.parseInt(volumewidth.getText().toString());
        int product2 = n1*n2*n3/3;
        volumetotalblock.setText(String.valueOf(product2));
    }

    public void calcblockvolume(View view) {
        int n1 = Integer.parseInt(volumebase.getText().toString());
        int n2 = Integer.parseInt(volumeheight.getText().toString());
        int n3 = Integer.parseInt(volumewidth.getText().toString());
        int product2 = n1*n2*n3;
        volumetotalblock.setText(String.valueOf(product2));
    }

    public void calccylindervolume(View view) {
        int n4 = Integer.parseInt(volumeradius.getText().toString());
        int n5 = Integer.parseInt(volumeheight2.getText().toString());
        float product3 = n4*n5*355/113;
        volumetotalcylinder.setText(String.valueOf(product3));
    }
}