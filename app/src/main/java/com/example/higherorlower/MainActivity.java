package com.example.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.util.TimeUnit;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.sql.Time;
import java.util.*;

public class MainActivity extends AppCompatActivity {


    int randomNumber;

    public void makeToast(String string){
        Toast.makeText(this, string, Toast.LENGTH_SHORT).show();
    }


    public void guessButton(View view){

        EditText guessInput = findViewById(R.id.guessInputBox);

        int guess = Integer.parseInt(guessInput.getText().toString());



        if(guess > randomNumber){
           makeToast("lower");
        }else if(guess < randomNumber){
            makeToast("higher");
        }else{
            Toast.makeText(this, "Correct! the number is " + randomNumber + "! Generating new number... Play again!", Toast.LENGTH_SHORT).show();

            Random rand = new Random();
            randomNumber = rand.nextInt(21);


        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();

        randomNumber = rand.nextInt(21);

    }
}