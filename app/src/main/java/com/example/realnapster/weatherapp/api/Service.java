package com.example.realnapster.weatherapp.api;

import android.util.Log;

import com.example.realnapster.weatherapp.model.Data;
import com.example.realnapster.weatherapp.model.WeatherInfo;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Service {

    // Data Object of parsed data
    private Data data;
    // Zip Code
    private String zip;
    // App ID
    private final String appId= "ecf3cb32a773ee3e5ef718570372eba0";

    public Service(String zip){
        this.zip=zip;
    }

    public Data responseCall(){
        data = new Data();
        Log.e("Response","Inside Response Call");
        Log.e("Zip",zip);
        Log.e("AppID",appId);
        Call<WeatherInfo> call =ApiHandler.getWeatherApi().getWeatherInfo(zip,appId);
        Log.e("Call",call.toString());
        call.enqueue(new Callback<WeatherInfo>() {
            @Override
            public void onResponse(Call<WeatherInfo> call,Response<WeatherInfo> response) {
                WeatherInfo weatherInfo = response.body();
                data.setWeatherStatus(weatherInfo.getWeather().get(0).getDescription());
                data.setTemperature(weatherInfo.getMain().getTemp().toString());

                data.setWindStatus(weatherInfo.getWind().getSpeed().toString());
                data.setCloudStatus(weatherInfo.getClouds().getAll().toString());
                data.setHumidityStatus(weatherInfo.getMain().getHumidity().toString());
                data.setPressureStatus(weatherInfo.getMain().getPressure().toString());
                data.setMeasured(weatherInfo.getName());
                data.setSuccess(true);
            }

            @Override
            public void onFailure(Call <WeatherInfo> call, Throwable t) {
                data.setSuccess(false);
            }
        });
    return  data;
    }
}
