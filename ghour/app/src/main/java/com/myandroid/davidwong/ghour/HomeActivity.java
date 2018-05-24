package com.myandroid.davidwong.ghour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class HomeActivity extends AppCompatActivity {
    Button lihat,signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        /*lihat =(Button) findViewById(R.id.btnIntro);

        lihat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),OnBoardingActivity.class);
                startActivity(intent);
            }
        });

        signup =(Button) findViewById(R.id.btnAdd);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Tambah.class);
                startActivity(intent);
            }
        });*/


        lihat =(Button) findViewById(R.id.btnIntro);

        lihat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),OnBoardingActivity.class);
                startActivity(intent);
            }
        });
    }
    public void OnReg(View view) {
        Intent intent = new Intent(getApplicationContext(),Tambah.class);
        startActivity(intent);

    }
    public void OnLogin(View view) {
        Intent intent = new Intent(getApplicationContext(),Login.class);
        startActivity(intent);

    }

    public void OnSkip(View view) {
        Intent intent = new Intent(getApplicationContext(),Menuatas.class);
        startActivity(intent);

    }
}
