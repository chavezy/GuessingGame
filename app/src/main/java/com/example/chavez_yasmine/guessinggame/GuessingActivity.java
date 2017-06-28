package com.example.chavez_yasmine.guessinggame;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class GuessingActivity extends AppCompatActivity {

    int randomNumber = (int) (Math.random() * 100) + 1;
    int userGuess = 0;
    Button btn, btn2, btn3, btn4, btn5, btn6;
    TextView number, text;
    int numOfGuesses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guessing);

        text = (TextView) findViewById(R.id.Start);
        text.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

            }
        });

        number = (TextView) findViewById(R.id.Number);
        number.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

            }
        });

        btn = (Button) findViewById(R.id.add1);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                userGuess++;
                number.setText("" + userGuess);
                if (userGuess <= 100) {
                    btn.setEnabled(true);
                    btn2.setEnabled(true);
                }
            }
        });

        btn2 = (Button) findViewById(R.id.sub1);
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                userGuess--;
                number.setText("" + userGuess);
                if (userGuess >= 0) {
                    btn.setEnabled(true);
                    btn2.setEnabled(true);
                }
            }
        });

        btn3 = (Button) findViewById(R.id.Guess);
        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (userGuess > randomNumber) {
                    Toast.makeText(GuessingActivity.this, "Guess Lower", Toast.LENGTH_SHORT).show();
                    numOfGuesses++;
                } else if (userGuess < randomNumber) {
                    Toast.makeText(GuessingActivity.this, "Guess Higher", Toast.LENGTH_SHORT).show();
                    numOfGuesses++;
                } else if (userGuess == randomNumber) {
                    Toast.makeText(GuessingActivity.this, "You are Correct!", Toast.LENGTH_SHORT).show();
                    btn.setEnabled(false);
                    btn2.setEnabled(false);
                    btn3.setEnabled(false);
                    btn4.setEnabled(true);
                    numOfGuesses++;
                    number.setText("The answer was " + randomNumber + ", it took you " + numOfGuesses + " tries!");
                }
            }
        });

        btn4 = (Button) findViewById(R.id.Reset);
        btn4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), SplashActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btn5 = (Button) findViewById(R.id.plus5);
        btn5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                userGuess+=5;
                number.setText("" + userGuess);
                if (userGuess >= 95) {
                    btn5.setEnabled(false);
                }
            }

        });

        btn6 = (Button) findViewById(R.id.min5);
        btn6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                userGuess-=5;
                number.setText("" + userGuess);
                if (userGuess <= 5) {
                    btn6.setEnabled(false);
                }
            }

        });
    }

}