package com.example.realnapster.weatherapp.display;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;

import com.example.realnapster.weatherapp.R;

public class DisplayActivity extends AppCompatActivity implements DisplayContract.View {
    private DisplayPresenter displayPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        displayPresenter = new DisplayPresenter(this);
    }
}
