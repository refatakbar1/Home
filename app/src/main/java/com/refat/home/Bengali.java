package com.refat.home;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Bengali extends AppCompatActivity {
    ImageView i11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bengali);
        i11=(ImageView)findViewById(R.id.imageView11);
        i11.animate().scaleXBy(.8f).setDuration(5000);
    }
}
