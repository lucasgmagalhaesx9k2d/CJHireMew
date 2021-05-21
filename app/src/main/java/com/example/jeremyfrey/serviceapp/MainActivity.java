package com.example.jeremyfrey.serviceapp;

import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonLawn, buttonPool, buttonOther;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonLawn = (Button) findViewById(R.id.button_Lawn);
        buttonLawn.setOnClickListener(this);
        buttonPool = (Button) findViewById(R.id.button_Pool);
        buttonPool.setOnClickListener(this);
        buttonOther = (Button) findViewById(R.id.button_Other);
        buttonOther.setOnClickListener(this);

    }

    public void homeView(View v){
        if(v.equals(buttonLawn)) {
            //lawn view
            setContentView(R.layout.activity_lawn_tiles);

        }

        else if(v.equals(buttonPool)) {
            //pool View
            setContentView(R.layout.activity_pool_tiles);

        }
        else if(v.equals(buttonOther)){
            //other View
            buttonPool.setVisibility(View.INVISIBLE);
            buttonLawn.setVisibility(View.INVISIBLE);
            Toast.makeText(getApplicationContext(), "other view...",
                    Toast.LENGTH_SHORT).show();
        }
        else {
            setContentView(R.layout.activity_main);
        }

    }




    @Override
    public void onClick(View v) {
        homeView(v);
    }
}
