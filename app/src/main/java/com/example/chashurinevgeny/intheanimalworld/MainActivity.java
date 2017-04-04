package com.example.chashurinevgeny.intheanimalworld;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button trueButton = null;
    private Button falseButton = null;
    private Button startButton = null;
    private TextView startTextView = null;
    private Controller controller = new Controller();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        trueButton = (Button) findViewById(R.id.trueButton);
        falseButton = (Button) findViewById(R.id.falseButton);
        startButton = (Button) findViewById(R.id.startButton);
        startButton.setOnClickListener(this);
        trueButton.setOnClickListener(this);
        falseButton.setOnClickListener(this);
        startTextView = (TextView) findViewById(R.id.startTextView);
    }

    @Override
    public void onClick(View v) {
        Context context = getApplicationContext();
        if (v.getId() == R.id.startButton) {
            startButton.setVisibility(View.GONE);
            trueButton.setVisibility(View.VISIBLE);
            falseButton.setVisibility(View.VISIBLE);
            controller.startButtonHandler(v, context, startTextView);
        }
        if (v.getId() == R.id.trueButton || v.getId() == R.id.falseButton) controller.trueFalseButtonHandler(v, context, startTextView);
    }
}
