package com.rubenmimoun.serviceexamplejava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button start  =  findViewById(R.id.start) ;
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startService();
            }
        });
        Button stop =  findViewById(R.id.stop);
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopService();
            }
        });
    }



    private void startService(){
        Intent intent = new Intent(this, MyService.class);
        startService(intent);
    }


    private void stopService(){
        Intent intent =  new Intent(this, MyService.class);
        stopService(intent);
    }


}
