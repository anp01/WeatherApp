package com.example.realnapster.weatherapp.model;

import android.os.Parcel;
import android.os.Parcelable;

@SuppressWarnings("unused")
public class Data implements Parcelable {

    private String temperature;
    private String weatherStatus;
    private String windStatus;
    private String cloudStatus;
    private String pressureStatus;
    private String humidityStatus;
    private String measured;

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public boolean isSuccess() {
        return success;
    }

    private boolean success;

    public Data() {
    }


    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        int kelvin = Integer.parseInt(temperature);
        int f = (int) (((kelvin - 273.0) * 9.0/5.0) + 32.0);
        this.temperature = String.valueOf(f);
    }

    public String getWeatherStatus() {
        return weatherStatus;
    }

    public void setWeatherStatus(String weatherStatus) {
        this.weatherStatus = weatherStatus.toUpperCase();
    }

    public String getWindStatus() {
        return windStatus;
    }

    public void setWindStatus(String windStatus) {
        this.windStatus = windStatus+" m/s";
    }

    public String getCloudStatus() {
        return cloudStatus;
    }

    public void setCloudStatus(String cloudStatus) {
        this.cloudStatus = cloudStatus;
    }

    public String getPressureStatus() {
        return pressureStatus;
    }

    public void setPressureStatus(String pressureStatus) {
        this.pressureStatus = pressureStatus + " hpa";
    }

    public String getHumidityStatus() {
        return humidityStatus;
    }

    public void setHumidityStatus(String humidityStatus) {
        this.humidityStatus = humidityStatus+"%";
    }

    public String getMeasured() {
        return measured;
    }

    public void setMeasured(String measured) {
        this.measured = measured;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        }

}
