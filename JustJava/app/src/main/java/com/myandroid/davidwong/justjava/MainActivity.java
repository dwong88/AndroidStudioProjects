package com.myandroid.davidwong.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;


public class MainActivity extends AppCompatActivity {

    int qty=0; //global

    ListView lstItem;
    TextView txtTanggal;
    ArrayList<String> source;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstItem = (ListView)findViewById(R.id.lstItem);
        txtTanggal = (TextView)findViewById(R.id.txtTanggal);

        source =  new ArrayList<String>();

        for(int i=0;i<20;i++){
            source.add("ini item ke"+i);
        }

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_checked,source);
        lstItem.setAdapter(adapter);

        String tanggalSekarang = DateFormat.getDateTimeInstance().format(new Date());
        txtTanggal.setText(tanggalSekarang);
    }

    public void pressButton(View view){
        qty = qty + 1;
        display(qty); //panggil private void number
    }

    private void display(int number){
        TextView jumlah = (TextView) findViewById(R.id.lblJumlah);
        jumlah.setText(""+qty);
    }

    public void pressDecrement(View view){
        qty = qty - 1;
        display(qty); //panggil private void number
    }

    //fungsi hitung harga
    public void hitungHarga(View v){
        displayHarga(qty);
    }

    public void displayHarga(int number){
        int bayar = 0;
        bayar = number *8000;
        TextView total = (TextView) findViewById(R.id.harga);
        total.setText("Rp."+bayar);
    }

}
