package com.example.administrator.weather.util;

/**
 * Created by Administrator on 2016/11/5.
 */

public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}
