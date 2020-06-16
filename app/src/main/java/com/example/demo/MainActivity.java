package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button RollBtn;
        RollBtn= (Button) findViewById(R.id.RollBtn);

        final ImageView LeftDice=(ImageView) findViewById(R.id.leftDice_Image);
        final ImageView RightDice=(ImageView) findViewById(R.id.RightDice_Image);

        final int [] DiceArray={R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6,};

        RollBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random1=new Random();
                Random random2=new Random();

                int Number_for_LeftDice=random1.nextInt(6);
                int Number_for_RightDice=random2.nextInt(6);

                LeftDice.setImageResource(DiceArray[Number_for_LeftDice]);
                RightDice.setImageResource(DiceArray[Number_for_RightDice]);



            }
        });


    }
}
