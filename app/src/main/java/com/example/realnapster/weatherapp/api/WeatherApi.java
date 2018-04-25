package com.example.realnapster.weatherapp.api;

import com.example.realnapster.weatherapp.model.WeatherInfo;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherApi {

@GET("weather?")
    Call<WeatherInfo> getWeatherInfo(@Query("zip") String zip, @Query("appid") String appid );
}
