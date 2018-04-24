package com.example.realnapster.weatherapp.main;


public class MainPresenter implements MainContract.Presenter {

    private MainContract.View mView;

    MainPresenter(MainContract.View view){
        mView = view;
    }
}
