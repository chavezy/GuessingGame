package com.example.chavez_yasmine.guessinggame;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {

            public void run() {
                Intent intent = new Intent(getApplicationContext(), GuessingActivity.class);
                startActivity(intent);
                finish();
            }
        }, 3000);
    }
}
