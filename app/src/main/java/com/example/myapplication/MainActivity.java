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
    String[][] alpha=new String[12][7];

    String[] data = new String[84];

    GridView gvMain;
    ArrayAdapter<String> adapter;


    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game2);
        Log.d(tag,"onCreate | ");
        for(int i=0;i<84;i++){
            data[i]="[ ]";
        }


        adapter = new ArrayAdapter<String>(this, R.layout.activity_game2, R.id.tvText, data);
        gvMain = (GridView) findViewById(R.id.gvMain);
        gvMain.setAdapter(adapter);
        adjustGridView();

        gvMain.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.d(tag,"Нажата кнопка");
            }
        });
    }


    private void adjustGridView() {
        gvMain.setNumColumns(7);
        gvMain.setVerticalSpacing(1);
        gvMain.setHorizontalSpacing(1);
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