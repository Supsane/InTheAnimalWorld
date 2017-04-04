package com.example.chashurinevgeny.intheanimalworld;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Chashurin Evgeny on 03.04.2017.
 */

public class Controller {
    private int i = 1;

    public void clickHandler(View view, Context context, TextView startTextView, TextView questionsLeftNumber, TextView questionsCompleteNumber) {
        String[] questions = context.getResources().getStringArray(R.array.questions);
        if (view.getId() == R.id.startButton) {
            startTextView.setText(questions[0]);
        }
        if (view.getId() == R.id.trueButton || view.getId() == R.id.falseButton) {
            startTextView.setText(questions[i]);
            i++;
            if (i > questions.length) System.exit(0);
        }
    }
}
