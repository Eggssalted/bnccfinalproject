package com.jonathan.bnccfinaltest;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class Counter extends Fragment {


    public Counter() {
        // Required empty    public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_counter, container, false);

        TextView number = view.findViewById(R.id.counternumber);
        Button increase = view.findViewById(R.id.counterincrease);
        Button decrease = view.findViewById(R.id.counterdecrease);
        Button reset = view.findViewById(R.id.counterreset);
        final int[] counter = {0};

        number.setText(counter[0]);

        increase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            counter[0]++;
            }
        });
        decrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter[0]--;
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter[0] = 0;
            }
        });
        return view;
    }
}