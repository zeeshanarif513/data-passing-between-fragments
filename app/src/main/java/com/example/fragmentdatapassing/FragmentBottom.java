package com.example.fragmentdatapassing;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class FragmentBottom extends Fragment {
    TextView tv;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bottom, container, false);
        tv = (TextView) view.findViewById(R.id.bottomtext);
        String name = this.getArguments().getString("name");
        tv.setText(name);
        return view;
    }
}
