package com.example.fragmentdatapassing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements FragmentTop.Communication{
    String firstname="",lastname="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Fragment topFragment = new FragmentTop();

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.topfragment,topFragment);
        ft.commit();


    }

    @Override
    public void username(String fname, String lname) {
        firstname = fname;
        lastname = lname;
        Fragment bottomFragment = new FragmentBottom();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ftbottom = fm.beginTransaction();
        Bundle bundle=new Bundle();
        bundle.putString("name",firstname+" "+lastname);
        bottomFragment.setArguments(bundle);
        ftbottom.add(R.id.bottomfragment,bottomFragment);
        ftbottom.commit();
    }
}
