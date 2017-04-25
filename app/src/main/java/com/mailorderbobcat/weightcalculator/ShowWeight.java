package com.mailorderbobcat.weightcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class ShowWeight extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_weight);

        Intent intent = getIntent();
        String value = intent.getStringExtra(MainActivity.EXTRA_VALUE);
        double valInt = Double.parseDouble(value);

        double oneSide = (valInt - 45) / 2;
        double side = oneSide;
        int fourtyfives = ((int) oneSide) / 45;
        oneSide -= (45 * fourtyfives);
        int thirtyfives = ((int) oneSide) / 35;
        oneSide -= (35 * thirtyfives);
        int twentyfives = ((int) oneSide) / 25;
        oneSide -= (25 * twentyfives);
        int tens = ((int) oneSide) / 10;
        oneSide -= (10 * tens);
        int fives = ((int) oneSide) / 5;
        oneSide -= (5 * fives);
        int twoPointFives = ((int) (oneSide / 2.5));

        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText("Weight:" + value + "\nOne Side: " + side
                + "\n45's: " + fourtyfives
                + "\n35's: " + thirtyfives
                + "\n25's: " + twentyfives
                + "\n10's: " + tens
                + "\n5's: " + fives
                + "\n2.5's: " + twoPointFives
        );

        RelativeLayout layout = (RelativeLayout) findViewById(R.id.content);
        layout.addView(textView);
    }
}
