package com.example.myintagram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class LoginMyintaa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_myintaa);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.linearLayout9);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginMyintaa.this,MainActivity.class);
                startActivity(intent);
            }
        });
        ImageView linearLayout1 = (ImageView) findViewById(R.id.imageView3);
        linearLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(LoginMyintaa.this,LoginMyinta.class);
                startActivity(intent1);
            }
        });
    }
}