package com.example.lesionlens3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class about extends AppCompatActivity {
    ImageButton imageButton;
    ImageButton imageButton1;
    ImageButton imageButton2;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
        imageButton=findViewById(R.id.imageButton7);
        imageButton1=findViewById(R.id.detect2);
        imageButton2=findViewById(R.id.imageButton8);

        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(about.this, MainActivity.class);
                startActivity(intent);
            }
        });

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(about.this, Learnmore.class);
                startActivity(intent);
            }
        });

    }
}
