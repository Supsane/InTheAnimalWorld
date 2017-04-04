package com.example.chashurinevgeny.intheanimalworld;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Chashurin Evgeny on 03.04.2017.
 */

public class Controller {
    private int i = 1;

    public void clickHandler(View view, Context context, TextView startTextView, TextView questionsLeftNumber, TextView questionsCompleteNumber, Button trueButton, Button falseButton, Button restartButton, Button exitButton) {
        String[] questions = context.getResources().getStringArray(R.array.questions);
        if (view.getId() == R.id.startButton || view.getId() == R.id.restartButton) {
            startTextView.setText(questions[0]);
            questionsLeftNumber.setText(String.valueOf(questions.length));
        }
        if (view.getId() == R.id.trueButton || view.getId() == R.id.falseButton) {
            if(i >= questions.length) {
                trueButton.setVisibility(View.INVISIBLE);
                falseButton.setVisibility(View.INVISIBLE);
                restartButton.setVisibility(View.VISIBLE);
                exitButton.setVisibility(View.VISIBLE);
                startTextView.setText(R.string.finishTextView);
                questionsCompleteNumber.setText(String.valueOf(i));
                questionsLeftNumber.setText(String.valueOf(questions.length - i));
                i = 1;
            } else {
                startTextView.setText(questions[i]);
                questionsCompleteNumber.setText(String.valueOf(i));
                questionsLeftNumber.setText(String.valueOf(questions.length - i));
                i++;
            }
        }
    }
}
