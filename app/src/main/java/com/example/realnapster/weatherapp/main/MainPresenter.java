package com.example.realnapster.weatherapp.main;


import android.util.Log;

import com.example.realnapster.weatherapp.api.Service;
import com.example.realnapster.weatherapp.model.Data;
import com.google.gson.Gson;


public class MainPresenter implements MainContract.Presenter {

    private MainContract.View mView;
    private Service service;

    MainPresenter(MainContract.View view) {
        mView = view;
    }

    @Override
    public void handleEnterClick(String zip) {
        service = new Service(zip);
        service.responseCall(new Service.ResponseListener() {
            @Override
            public void onResponse(Data data) {
                Log.v("TEST", "DATA: " + new Gson().toJson(data));
                if (data.isSuccess()) {
                    Log.v("TEST", "Tempreture: " + data.getTemperature());
                    mView.showEnterScreen();
                } else {
                    Log.v("TEST", "Failed");
                }
            }
        });

    }

}
