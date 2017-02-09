package com.example.coolweather1.gson;

/**
 * Created by 远鹏 on 2017/2/6.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
