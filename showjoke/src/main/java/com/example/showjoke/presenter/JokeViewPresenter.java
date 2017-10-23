package com.example.showjoke.presenter;

import com.example.showjoke.view.JokeView;

/**
 * Created by mohamed on 21/10/2017.
 */

public class JokeViewPresenter extends BasePresenter implements JokePresnter {
    private String  joke;
    private JokeView jokeView;

    public JokeViewPresenter(JokeView jokeView,String joke){
        this.joke=joke;
        this.jokeView=jokeView;
    }
    @Override
    public void showJoke() {
        jokeView.showJoke(joke);
    }
}
