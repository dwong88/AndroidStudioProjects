package com.halo.loginui2;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;

public class Activity_Login extends AppCompatActivity {

    RelativeLayout rellay1, rellay2;
    Button tambah,lihat,signup;
    EditText UsernameEt, PasswordEt;

    Handler handler = new Handler();
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            rellay1.setVisibility(View.VISIBLE);
            rellay2.setVisibility(View.VISIBLE);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        rellay1 = (RelativeLayout) findViewById(R.id.rellay1);
        rellay2 = (RelativeLayout) findViewById(R.id.rellay2);

        handler.postDelayed(runnable, 2000); //2000 is the timeout for the splash

        lihat =(Button) findViewById(R.id.btn_instruksi);

        lihat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),OnBoardingActivity.class);
                startActivity(intent);
            }
        });



        signup =(Button) findViewById(R.id.btn_signup);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Register.class);
                startActivity(intent);
            }
        });

    }

    public void OnLogin(View view) {

        UsernameEt = (EditText)findViewById(R.id.txtNama);
        PasswordEt = (EditText)findViewById(R.id.txtPass);
        //String username = UsernameEt.getText().toString();
        //String password = PasswordEt.getText().toString();

        String username = "aaa";
        String password = "aaa";
        String type = "login";
        BackgroundWorker backgroundWorker = new BackgroundWorker(this);
        //BackgroundWorker backgroundWorker = new BackgroundWorker(getBaseContext());
        backgroundWorker.execute(type, username, password);
        Intent intent = new Intent(getApplicationContext(),Dashboard.class);
        startActivity(intent);

    }

}
