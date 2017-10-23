package com.example.showjoke.utils;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import com.example.showjoke.R;


/**
 * Created by mohamed on 21/10/2017.
 */

public abstract class SingleFragmentActiviy extends AppCompatActivity {
    public abstract Fragment CreateFragment();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        FragmentManager fragmentManager=getSupportFragmentManager();
        Fragment fragment=fragmentManager.findFragmentById(R.id.main_container);

        if (fragment==null){
            fragment=CreateFragment();
            fragmentManager.beginTransaction().add(R.id.main_container,fragment).commit();
        }
    }
}
