package com.example.realnapster.weatherapp.api;

import android.util.Log;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiHandler {
    private static final long HTTP_TIMEOUT = 30000;
    private static WeatherApi weatherApi;
    private static String BaseURL= "http://api.openweathermap.org/data/2.5/";

    public static WeatherApi getWeatherApi(){
        if (weatherApi == null) {

            HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
            interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
            OkHttpClient client = new OkHttpClient.Builder()
                    .readTimeout(HTTP_TIMEOUT, TimeUnit.MILLISECONDS)
                    .connectTimeout(HTTP_TIMEOUT, TimeUnit.MILLISECONDS)
                    .addInterceptor(interceptor).build();

            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(BaseURL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(client)
                    .build();
//            Log.e ("Retrofit",retrofit.baseUrl().)
            weatherApi = retrofit.create(WeatherApi.class);
            return weatherApi;
        } else {
            return weatherApi;
        }
    }
}
