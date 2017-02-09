package com.example.coolweather1.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by 远鹏 on 2017/2/6.
 */

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
