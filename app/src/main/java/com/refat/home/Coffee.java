package com.refat.home;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Coffee extends AppCompatActivity {
    ImageView i13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffee);
        i13=(ImageView)findViewById(R.id.imageView13);
        i13.animate().scaleXBy(.8f).setDuration(5000);
        i13.animate().scaleYBy(1.7f).setDuration(5000);
    }
}
