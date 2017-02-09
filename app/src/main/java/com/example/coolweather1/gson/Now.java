package com.example.coolweather1.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 远鹏 on 2017/2/6.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
