package com.example.mohamed.builditbiggerapp.fragments;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


import com.example.mohamed.builditbiggerapp.R;
import com.example.mohamed.builditbiggerapp.model.JokeAsyncTask;
import com.example.mohamed.builditbiggerapp.presenter.MainViewPresenter;
import com.example.mohamed.builditbiggerapp.view.MainView;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

/**
 * Created by mohamed on 21/10/2017.
 */

public class MainFragment extends Fragment implements View.OnClickListener,MainView {
    private View view;
    private Button mButton;
    private AdView mAdView;
    private MainViewPresenter mainViewPresenter;
    private InterstitialAd mInterstitialAd;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.activity_main,container,false);
        mainViewPresenter=new MainViewPresenter(this);
        MobileAds.initialize(getActivity(),"ca-app-pub-9388449991695593/9029301388");
        initView();
        InterstitialAd();
        return view;
    }

    private void initView() {
      mButton=view.findViewById(R.id.tell_joke);
      mAdView=view.findViewById(R.id.adView);
      mButton.setOnClickListener(this);
      AdRequest adRequest=new  AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

    private void InterstitialAd(){
        mInterstitialAd=new InterstitialAd(getActivity());
        mInterstitialAd.setAdUnitId("ca-app-pub-9388449991695593/3913540223");
        mInterstitialAd.loadAd(new  AdRequest.Builder().build());

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                 excuted();
            }
        });
    }

    @Override
    public void onClick(View v) {
      mainViewPresenter.TellJoke();
    }

    @Override
    public void TellJoke() {
        if (mInterstitialAd.isLoaded()){
            mInterstitialAd.show();
        }else {
         excuted();
        }
    }

    private void excuted(){
        Handler handler=new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
              new JokeAsyncTask().execute(getActivity());
            }
        });
    }
}
