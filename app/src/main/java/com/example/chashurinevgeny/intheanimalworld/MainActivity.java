package com.example.chashurinevgeny.intheanimalworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button trueButton = null;
    private Button falseButton = null;
    private TextView startTextView = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        trueButton = (Button) findViewById(R.id.trueButton);
        falseButton = (Button) findViewById(R.id.falseButton);
        startTextView = (TextView) findViewById(R.id.startTextView);
    }

    @Override
    public void onClick(View v) {

    }
}
