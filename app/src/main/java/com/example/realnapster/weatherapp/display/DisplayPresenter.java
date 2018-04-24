package com.example.realnapster.weatherapp.display;

public class DisplayPresenter implements DisplayContract.Presenter {

    private DisplayContract.View dView;

    DisplayPresenter(DisplayContract.View view){
        dView = view;
    }

}
