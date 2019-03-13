package com.example.gradientloginsignup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class FourButtonPage extends AppCompatActivity {

    private ImageButton medicalhistory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four_button_page);


        medicalhistory=(ImageButton) findViewById(R.id.medicalhistory);


        medicalhistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ftob= new Intent(FourButtonPage.this,bmiActivity.class);
                startActivity(ftob);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuinflater = getMenuInflater();
        menuinflater.inflate(R.menu.menu_item,menu);
        return super.onCreateOptionsMenu(menu);
    }
}
