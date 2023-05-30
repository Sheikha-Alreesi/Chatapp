package com.example.scaledrone.chat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainMenu extends AppCompatActivity {

    CardView f1, f2, f3, f4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        f1 = (CardView) findViewById(R.id.friend1);
        f2 = (CardView) findViewById(R.id.friend2);
        f3 = (CardView) findViewById(R.id.friend3);
        f4 = (CardView) findViewById(R.id.friend4);

        f1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainMenu.this, MainActivity.class);
                startActivity(intent);
//                finish();
            }
        });
        f2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainMenu.this, MainActivity.class);
                startActivity(intent);
//                finish();
            }
        });
        f3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainMenu.this, MainActivity.class);
                startActivity(intent);
//                finish();
            }
        });
        f4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainMenu.this, MainActivity.class);
                startActivity(intent);
//                finish();
            }
        });

    }
}