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
    private int correctAnswer = 0;
    java.util.Formatter formatter = new java.util.Formatter();

    public void clickHandler(View view, Context context, TextView startTextView, TextView questionsLeftNumber, TextView questionsCompleteNumber, Button trueButton, Button falseButton, Button restartButton, Button exitButton) {
        String[] questions = context.getResources().getStringArray(R.array.questions);
        if (view.getId() == R.id.startButton || view.getId() == R.id.restartButton) {
            startTextView.setText(questions[0]);
            questionsLeftNumber.setText(String.valueOf(questions.length));
        }
        if (view.getId() == R.id.trueButton || view.getId() == R.id.falseButton) {
            if (i >= questions.length) {
                trueButton.setVisibility(View.INVISIBLE);
                falseButton.setVisibility(View.INVISIBLE);
                restartButton.setVisibility(View.VISIBLE);
                exitButton.setVisibility(View.VISIBLE);
                String finishTextView = context.getResources().getString(R.string.finishTextView);
                startTextView.setText(String.valueOf(formatter.format(finishTextView, String.valueOf(correctAnswer))));
                questionsCompleteNumber.setText(String.valueOf(i));
                questionsLeftNumber.setText(String.valueOf(questions.length - i));
                i = 1;
                correctAnswer = 0;
            } else {
                startTextView.setText(questions[i]);
                questionsCompleteNumber.setText(String.valueOf(i));
                questionsLeftNumber.setText(String.valueOf(questions.length - i));
                String trueText = context.getResources().getString(R.string.trueButton);
                String falseText = context.getResources().getString(R.string.falseButton);
                String[] answer = context.getResources().getStringArray(R.array.answer);
                if (view.getId() == R.id.trueButton && trueText.equals(answer[i])) correctAnswer++;
                if (view.getId() == R.id.falseButton && falseText.equals(answer[i])) correctAnswer++;
                i++;
            }
        }
    }
}
