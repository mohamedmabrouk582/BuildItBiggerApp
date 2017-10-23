package com.example.showjoke.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.showjoke.R;
import com.example.showjoke.presenter.JokeViewPresenter;
import com.example.showjoke.view.JokeView;

/**
 * Created by mohamed on 21/10/2017.
 */

public class ShowJokeFragment extends Fragment implements JokeView {
    private static String JOKE="joke";
    private String joke;
    private JokeViewPresenter mJokeViewPresenter;
    private TextView mJokeTextView;

    public static ShowJokeFragment newFragment(String joke){
        Bundle bundle=new Bundle();
        bundle.putSerializable(JOKE,joke);
        ShowJokeFragment fragment=new ShowJokeFragment();
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.show_joke,container,false);
        mJokeTextView=view.findViewById(R.id.joke_content);
        joke= (String) getArguments().getSerializable(JOKE);
        mJokeViewPresenter=new JokeViewPresenter(this,joke);
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
         mJokeViewPresenter.showJoke();
    }

    @Override
    public void showJoke(String joke) {
      mJokeTextView.setText(joke);
    }
}
