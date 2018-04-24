package com.example.realnapster.weatherapp.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.realnapster.weatherapp.R;

public class MainActivity extends AppCompatActivity implements MainContract.View {

    private  MainPresenter mPresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        mPresenter = new MainPresenter(this);
    }
    
}
