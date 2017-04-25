package com.mailorderbobcat.weightcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_VALUE = "com.mailorderbobcat.weightcalculator.VALUE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**Called when the user presses the enter button*/
    public void enterValue(View view) {
        Intent intent = new Intent(this, ShowWeight.class);
        EditText editText = (EditText) findViewById(R.id.input);
        String value = editText.getText().toString();
        intent.putExtra(EXTRA_VALUE, value);
        startActivity(intent);
    }
}
