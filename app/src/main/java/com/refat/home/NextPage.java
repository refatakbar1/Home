package com.refat.home;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class NextPage extends AppCompatActivity {
TextView t15;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_page);
        t15=(TextView)findViewById(R.id.textView15);
        t15.animate().rotationXBy(360f).setDuration(8000);
    }
    public void coffee(View v ){
        Intent i=new Intent(this,Coffee.class);
        startActivity(i);
    }
    public void temparature(View v){
        Intent i=new Intent(this,temparature.class);
        startActivity(i);
    }
}
