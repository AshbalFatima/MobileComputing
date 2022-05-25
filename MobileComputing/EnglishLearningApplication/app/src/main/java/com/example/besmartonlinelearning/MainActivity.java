package com.example.besmartonlinelearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button Learn;
    Button Test;
    Button repo;
    private static final String TAG="MainActivity";
    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Learn = (Button) findViewById(R.id.learn);
        Test = findViewById(R.id.button2);
        repo = findViewById(R.id.button3);

        Learn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intmove = new Intent(MainActivity.this, Learning.class);
                startActivity(intmove);
            }

        });
        Test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intmove = new Intent(MainActivity.this, Exam.class);
                startActivity(intmove);
            }

        });

        repo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/AshbalFatima/MobileComputing/tree/main/MobileComputing/EnglishLearningApplication"));
                startActivity(browserIntent);
            }
        });

    }
        public void openLearning() {
            Intent intent = new Intent(this, Learning.class);
            startActivity(intent);
        }
        @Override

        protected void onStart(){
            super.onStart();
            Log.d(TAG, " onStart Main");
        }

        @Override

        protected void onResume(){
            super.onResume();
            Log.d(TAG, " onResume Main");
        }

        @Override

        protected void onPause(){
            super.onPause();
            Log.d(TAG, " onPause Main");
        }

        @Override

        protected void onStop(){
            super.onStop();
            Log.d(TAG, " onStop Main");
        }

        @Override

        protected void onDestroy(){
            super.onDestroy();
            Log.d(TAG, " onDestroy Main");
        }

        @Override

        protected void onRestart(){
            super.onRestart();
            Log.d(TAG, " onRestart Main");
        }


    @Override
    public void onClick(View v) {

    }
}