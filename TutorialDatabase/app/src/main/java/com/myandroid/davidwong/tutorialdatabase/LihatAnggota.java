package com.myandroid.davidwong.tutorialdatabase;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class LihatAnggota extends AppCompatActivity {
    ListView lst ;
    DatabaseHelper mDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_anggota);

        lst = (ListView)findViewById(R.id.listView);

        mDB = new DatabaseHelper(this);

        isiList();
    }

    private void isiList(){
        Cursor data = mDB.getData();
        ArrayList<String> listData = new ArrayList<>();

        while(data.moveToNext()){
            //get the value from the database in column 1
            //then add it to the ArrayList
            listData.add(data.getString(2));
            //ekspektasi yang  muncul ID

        }
        //create the list adapter and set the adapter
        ListAdapter adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listData);
        lst.setAdapter(adapter);
    }
}
