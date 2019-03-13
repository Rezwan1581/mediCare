package com.example.gradientloginsignup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    private Button signupnowbtn,frgtpassbtn,loginbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        signupnowbtn=(Button)findViewById(R.id.signupnowbtn);
        frgtpassbtn =(Button)findViewById(R.id.frgtpassbtn);
        loginbtn=(Button)findViewById(R.id.loginbtn);

        signupnowbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ltos= new Intent(LoginActivity.this,SignUpActivity.class);
                startActivity(ltos);
            }
        });

        frgtpassbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ltof= new Intent(LoginActivity.this,ForgetPassword.class);
                startActivity(ltof);
            }
        });

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lto4= new Intent(LoginActivity.this,FourButtonPage.class);
                startActivity(lto4);
            }
        });

        }
}
