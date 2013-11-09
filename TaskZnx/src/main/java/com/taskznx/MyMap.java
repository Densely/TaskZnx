package com.taskznx;

/**
 * Created by Densely on 30.10.13.
 */

import android.os.Bundle;

import com.google.android.maps.MapActivity;


public class MyMap extends MapActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map);


    }

    @Override
    protected boolean isRouteDisplayed() {
        // TODO Auto-generated method stub
        // Этот метод должен возвращать true, если ваша активность
        // показывает направления движения. В ином случае он должен
        // вернуть false.
        return false;
    }
}