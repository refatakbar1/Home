package com.refat.home;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(TextView)findViewById(R.id.textView2);
        t1.animate().rotationYBy(360f).setDuration(5000);
    }
public void about(View v){
    Intent i=new Intent(this,About.class);
    startActivity(i);
}
 public  void contact(View v){
        Intent i=new Intent(this,Contact.class);
        startActivity(i);

}
    public void portfolio(View v){
        Intent i=new Intent(this,Portfolio.class);
        startActivity(i);
    }
}