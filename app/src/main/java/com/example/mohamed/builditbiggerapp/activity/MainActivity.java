package com.example.mohamed.builditbiggerapp.activity;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.mohamed.builditbiggerapp.fragments.MainFragment;
import com.example.mohamed.builditbiggerapp.utils.SingleFragmentActiviy;


public class MainActivity extends SingleFragmentActiviy {

    @Override
    public Fragment CreateFragment() {
        return new MainFragment();
    }
}
