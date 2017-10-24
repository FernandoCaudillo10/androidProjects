package com.example.leeon.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.*;

public class MainActivity extends AppCompatActivity {
    int randNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();
        randNumber = rand.nextInt(20) + 1;

    }

    public void onClickGuess(View view){
        EditText guessEditText = (EditText) findViewById(R.id.editText);


        int guessedNumber = Integer.parseInt(guessEditText.getText().toString());

        if( guessedNumber > randNumber){
            Toast.makeText(this, "Wrong Number... Lower!", Toast.LENGTH_SHORT).show();
            guessEditText.setText("");
        }
        else if ( guessedNumber < randNumber){
            Toast.makeText(this, "Wrong Number... Higher!", Toast.LENGTH_SHORT).show();
            guessEditText.setText("");
        }
        else{
            Toast.makeText(MainActivity.this, "You got the number! Try again!", Toast.LENGTH_LONG).show();
            Random rand = new Random();
            randNumber = rand.nextInt(20) + 1;
            guessEditText.setText("");
        }
    }
}
