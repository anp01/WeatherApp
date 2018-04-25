package com.example.realnapster.weatherapp.main;



import android.util.Log;

import com.example.realnapster.weatherapp.api.Service;


public class MainPresenter implements MainContract.Presenter {

    private MainContract.View mView;
    private Service service;

    MainPresenter(MainContract.View view){
        mView = view;
    }

    @Override
    public void handleEnterClick(String zip) {
        service = new Service(zip);
        if (service.responseCall().isSuccess()){
            Log.e("Success",service.responseCall().getTemperature());
            mView.showEnterScreen();
        }
        else{
            Log.e("Failure","Failed");
        }

    }

}
