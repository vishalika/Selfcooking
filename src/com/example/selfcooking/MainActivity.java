package com.example.selfcooking;


import org.apache.cordova.DroidGap;

import android.os.Bundle;

public class MainActivity extends /* Activity */DroidGap {

   

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/www/index.html");
    }

   
} 