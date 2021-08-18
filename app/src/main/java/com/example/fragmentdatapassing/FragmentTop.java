package com.example.fragmentdatapassing;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class FragmentTop extends Fragment {
   EditText firstname, lastname;
   Button btn;


    public interface Communication{
        public void username(String fname, String lname);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final Communication com = (Communication)getActivity();
        View view = inflater.inflate(R.layout.fragment_top, container, false);
        firstname = (EditText) view.findViewById(R.id.firstname);
        lastname = (EditText) view.findViewById(R.id.lastname);
        btn = (Button) view.findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                com.username(firstname.getText().toString(),lastname.getText().toString());
            }
        });
        return view;
    }
}
