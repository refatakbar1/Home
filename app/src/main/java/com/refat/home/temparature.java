package com.refat.home;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class temparature extends AppCompatActivity {
ImageView i14;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temparature);
        i14=(ImageView)findViewById(R.id.imageView14);
        i14.animate().scaleXBy(.5f).setDuration(5000);
        i14.animate().scaleYBy(.3f).setDuration(5000);
    }
}
