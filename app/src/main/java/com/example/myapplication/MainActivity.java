package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {


    String tag="main_activity";


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game2);
        Log.d(tag,"onCreate | ");


    }


    protected void onResume(){
        super.onResume();
        Log.d(tag,"onResume | ");
    }

    protected void onStop(){
        super.onStop();
        Log.d(tag,"onStop | ");
    }

    protected void onPause(){
        super.onPause();
        Log.d(tag,"onPause | ");
    }


}