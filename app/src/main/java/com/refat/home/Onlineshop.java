package com.refat.home;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Onlineshop extends AppCompatActivity {
    ImageView t12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onlineshop);
        t12=(ImageView)findViewById(R.id.imageView12);
        t12.animate().scaleXBy(.5f).setDuration(5000);
        t12.animate().scaleYBy(.5f).setDuration(3000);
    }
}
