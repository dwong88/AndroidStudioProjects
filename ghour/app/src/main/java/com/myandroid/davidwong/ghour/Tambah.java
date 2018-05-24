package com.myandroid.davidwong.ghour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class Tambah extends AppCompatActivity {

    EditText nama,email;
    RadioButton rdbM;
    Button save;
    DatabaseHelper mDB;
    String n,g,e;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah);

        mDB = new DatabaseHelper(this);
        nama = (EditText)findViewById(R.id.txtNama);
        email = (EditText)findViewById(R.id.txtEmail);


        save = (Button)findViewById(R.id.btnAdd);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n = nama.getText().toString();
                e = email.getText().toString();
                g = getGender(rdbM);

                if(n.isEmpty() || e.isEmpty()){
                    //pesan error
                    showToast("Nama atau Email Tidak Boleh Kosong");
                }
                else {
                    //insert
                    boolean sukses = mDB.insertData(n,e,g);
                    if(sukses){
                        //info sukses
                        showToast("Sukses");
                    }
                    else {
                        showToast("Error");
                    }
                }
            }
        });
    }

    private String getGender(RadioButton male){
        if(male.isSelected()){
            return  "L";
        }
        else {
            return  "P";
        }
    }

    private void showToast(String text){
        Toast.makeText(getApplicationContext(),text,Toast.LENGTH_SHORT).show();
    }
}