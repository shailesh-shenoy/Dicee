package com.android.learning.dicee;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton = findViewById(R.id.rollButton);

        final ImageView diceFirst = findViewById(R.id.diceFirst);
        final ImageView diceSecond = findViewById(R.id.diceSecond);

        final int[] diceArray = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };

        rollButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Log.d("Dicee", "Roll Button has been pressed!");

                Random randomNumberGenerator = new Random();
                int randomNumberFirst = randomNumberGenerator.nextInt(6);
                int randomNumberSecond = randomNumberGenerator.nextInt(6);
                diceFirst.setImageResource(diceArray[randomNumberFirst]);
                diceSecond.setImageResource(diceArray[randomNumberSecond]);
            }
        });
    }
}
