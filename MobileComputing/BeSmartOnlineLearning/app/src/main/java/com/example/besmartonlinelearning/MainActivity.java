package com.example.besmartonlinelearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button Learn;
    Button Test;
    Button repo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Learn = findViewById(R.id.button);
        Test = findViewById(R.id.button2);
        repo = findViewById(R.id.button3);
        Learn.setOnClickListener((View.OnClickListener) this);
        Test.setOnClickListener((View.OnClickListener) this);
        repo.setOnClickListener((View.OnClickListener) this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button:
                Intent intent1=new Intent(this, Learning.class);
                startActivity(intent1);
                break;
            case R.id.button2:
                Intent intent2=new Intent(this, Exam.class);
                startActivity(intent2);
                break;
            case R.id.button3:
                Uri webpage=Uri.parse("https://github.com/AshbalFatima/MobileComputing/tree/main/MobileComputing/EnglishLearningApplication");
                Intent intent3=new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(intent3);
                break;
        }
    }

    public void openLearning() {
        Intent intent = new Intent(this, Learning.class);
        startActivity(intent);
    }
}