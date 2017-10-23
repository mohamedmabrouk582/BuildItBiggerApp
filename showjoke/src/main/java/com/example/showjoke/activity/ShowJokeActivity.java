package com.example.showjoke.activity;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import com.example.showjoke.R;
import com.example.showjoke.fragment.ShowJokeFragment;
import com.example.showjoke.presenter.JokeViewPresenter;
import com.example.showjoke.utils.SingleFragmentActiviy;
import com.example.showjoke.view.JokeView;

/**
 * Created by mohamed on 21/10/2017.
 */

public class ShowJokeActivity extends SingleFragmentActiviy  {

    private static String JOKE="joke";
    public static Intent intent(Context context, String joke){
        Intent intent=new Intent(context,ShowJokeActivity.class);
        intent.putExtra(JOKE,joke);
        return intent;
    }

    @Override
    public Fragment CreateFragment() {
        return ShowJokeFragment.newFragment(getIntent().getStringExtra(JOKE));
    }
}
