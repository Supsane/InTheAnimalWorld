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
    private Button restartButton = null;
    private Button exitButton = null;
    private TextView startTextView = null;
    private TextView questionsComplete = null;
    private TextView questionsCompleteNumber = null;
    private TextView questionsLeft = null;
    private TextView questionsLeftNumber = null;
    private Controller controller = new Controller();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        trueButton = (Button) findViewById(R.id.trueButton);
        falseButton = (Button) findViewById(R.id.falseButton);
        startButton = (Button) findViewById(R.id.startButton);
        restartButton = (Button) findViewById(R.id.restartButton);
        exitButton = (Button) findViewById(R.id.exitButton);
        startButton.setOnClickListener(this);
        trueButton.setOnClickListener(this);
        falseButton.setOnClickListener(this);
        restartButton.setOnClickListener(this);
        exitButton.setOnClickListener(this);
        startTextView = (TextView) findViewById(R.id.startTextView);
        questionsComplete = (TextView) findViewById(R.id.questionsComplete);
        questionsCompleteNumber = (TextView) findViewById(R.id.questionsCompleteNumber);
        questionsLeft = (TextView) findViewById(R.id.questionsLeft);
        questionsLeftNumber = (TextView) findViewById(R.id.questionsLeftNumber);
    }

    @Override
    public void onClick(View v) {
        Context context = getApplicationContext();
        if (v.getId() == R.id.startButton) {
            startButton.setVisibility(View.GONE);
            trueButton.setVisibility(View.VISIBLE);
            falseButton.setVisibility(View.VISIBLE);
            questionsComplete.setVisibility(View.VISIBLE);
            questionsCompleteNumber.setVisibility(View.VISIBLE);
            questionsLeft.setVisibility(View.VISIBLE);
            questionsLeftNumber.setVisibility(View.VISIBLE);
            controller.clickHandler(v, context, startTextView, questionsLeftNumber, questionsCompleteNumber, trueButton, falseButton, restartButton, exitButton);
        }
        if (v.getId() == R.id.trueButton || v.getId() == R.id.falseButton) {
            controller.clickHandler(v, context, startTextView, questionsLeftNumber, questionsCompleteNumber, trueButton, falseButton, restartButton, exitButton);
        }
        if (v.getId() == R.id.restartButton) {
            restartButton.setVisibility(View.GONE);
            exitButton.setVisibility(View.GONE);
            trueButton.setVisibility(View.VISIBLE);
            falseButton.setVisibility(View.VISIBLE);
            questionsCompleteNumber.setText(R.string.questionsCompleteNumber);
            questionsLeftNumber.setText(R.string.questionsLeftNumber);
            controller.clickHandler(v, context, startTextView, questionsLeftNumber, questionsCompleteNumber, trueButton, falseButton, restartButton, exitButton);
        }
        if(v.getId() == R.id.exitButton) System.exit(0);
    }
}
