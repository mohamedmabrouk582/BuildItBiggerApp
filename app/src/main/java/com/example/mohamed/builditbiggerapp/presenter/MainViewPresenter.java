package com.example.mohamed.builditbiggerapp.presenter;


import com.example.mohamed.builditbiggerapp.view.MainView;

/**
 * Created by mohamed on 21/10/2017.
 */

public class MainViewPresenter extends BasePresenter implements MainPresenter {
    private MainView mainView;

    public MainViewPresenter(MainView  mainView){
        this.mainView=mainView;
    }
    @Override
    public void TellJoke() {
        mainView.TellJoke();
    }
}
