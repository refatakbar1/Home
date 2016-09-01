package com.refat.home;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Portfolio extends AppCompatActivity {
TextView t10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio);
        t10=(TextView)findViewById(R.id.textView10);
        t10.animate().rotationXBy(360f).setDuration(5000);
    }
    public void next(View v){
        Intent i=new Intent(this,NextPage.class);
        startActivity(i);
    }
    public void bengali(View v){
        Intent i=new Intent(this,Bengali.class);
        startActivity(i);

    }
    public void online(View v){
        Intent i=new Intent(this,Onlineshop.class);
        startActivity(i);
    }
}
