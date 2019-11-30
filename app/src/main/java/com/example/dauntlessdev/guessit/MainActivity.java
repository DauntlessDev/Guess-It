package com.example.dauntlessdev.guessit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    Random random = new Random();
    int rand;
    public void guessListener(View view){
        EditText input = findViewById(R.id.inputEditText);
        int numberInput;
        if (!input.getText().toString().isEmpty()){
            numberInput = Integer.parseInt(input.getText().toString());
            if (numberInput > rand){
                Toast.makeText(this, "Lesser!", Toast.LENGTH_LONG).show();
            }else if(numberInput < rand){
                Toast.makeText(this, "Greater!", Toast.LENGTH_LONG).show();
            }else{
                Toast.makeText(this, "Correct!", Toast.LENGTH_LONG).show();
                rand = random.nextInt(200);
            }
        }else{
            Toast.makeText(this, "Input a number!", Toast.LENGTH_LONG).show();
        }


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rand = random.nextInt(200);
    }
}
