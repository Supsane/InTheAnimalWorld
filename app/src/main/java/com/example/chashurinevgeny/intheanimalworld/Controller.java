package com.example.chashurinevgeny.intheanimalworld;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Chashurin Evgeny on 03.04.2017.
 */

public class Controller {
    private int i = 1;

    public void startButtonHandler(View view, Context context, TextView textView) {
        String[] questions = context.getResources().getStringArray(R.array.questions);
        if (view.getId() == R.id.startButton) {
            textView.setText(questions[0]);
        }
    }

    public void trueFalseButtonHandler(View view, Context context, TextView textView) {
        String[] questions = context.getResources().getStringArray(R.array.questions);
        textView.setText(questions[i]);
        i++;
        if (i > questions.length) System.exit(0);
    }
}
