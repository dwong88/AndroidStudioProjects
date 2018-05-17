package com.myandroid.davidwong.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lstItem;
    TextView txtTanggal;
    ArrayList<String> source;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstItem =(ListView)findViewById(R.id.lstItem);
        txtTanggal =(TextView) findViewById(R.id.txtTanggal);

        for(int i=0; i<20;i++){
            source.add("Item ke"+i);
        }
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_checked,source);
        lstItem.setAdapter(adapter);
    }
}
