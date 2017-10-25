package com.example.mohamed.builditbiggerapp.activity;

import android.support.v4.app.Fragment;

import com.example.mohamed.buildbiggerapp.fragments.MainFragment;
import com.example.mohamed.builditbiggerapp.utils.SingleFragmentActiviy;


public class MainActivity extends SingleFragmentActiviy {

    @Override
    public Fragment CreateFragment() {
        return new MainFragment();
    }
}
