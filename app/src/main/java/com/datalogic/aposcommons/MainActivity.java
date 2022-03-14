package com.datalogic.aposcommons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.datalogic.dlapos.commons.constant.CommonsConstants;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int val = CommonsConstants.PN_DISABLED;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}