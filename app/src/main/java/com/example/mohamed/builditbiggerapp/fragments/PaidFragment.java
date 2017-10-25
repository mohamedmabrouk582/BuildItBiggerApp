package com.example.mohamed.builditbiggerapp.fragments;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.mohamed.builditbiggerapp.BuildConfig;
import com.example.mohamed.builditbiggerapp.R;
import com.example.mohamed.builditbiggerapp.model.JokeAsyncTask;
import com.example.mohamed.builditbiggerapp.presenter.MainViewPresenter;
import com.example.mohamed.builditbiggerapp.view.MainView;

/**
 * Created by mohamed on 21/10/2017.
 */

public class PaidFragment extends Fragment implements View.OnClickListener,MainView {
    private View view;
    private Button mButton;
    private MainViewPresenter mainViewPresenter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.paid_view,container,false);
        mainViewPresenter=new MainViewPresenter(this);
        initView();


        return view;
    }

    private void initView() {
      mButton=view.findViewById(R.id.tell_joke);
      mButton.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
      mainViewPresenter.TellJoke();
    }

    @Override
    public void TellJoke() {
         excuted();
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
