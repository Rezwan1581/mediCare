package com.example.gradientloginsignup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class SplashScreen extends AppCompatActivity {

    private int SLEEP_TIMER = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash_screen);


        AppLauncher appLauncher = new AppLauncher();
        appLauncher.start();


    }

    private class AppLauncher extends Thread{
        public void run(){
            try{
                sleep(1000 * SLEEP_TIMER);
            }catch(InterruptedException e){
                e.printStackTrace();
            }

            Intent stol = new Intent(SplashScreen.this, LoginActivity.class);
            startActivity(stol);
            SplashScreen.this.finish();
        }
    }
}
