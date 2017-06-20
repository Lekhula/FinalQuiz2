package com.pabi.finalquiz;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Admin on 6/9/2017.
 */

public class TimeQuizActivity extends AppCompatActivity {
    Button button1, button2, button3;
    TextView txtQuestion;

    private QuestionBank3 theQuestions = new QuestionBank3();

    private String theAnswer;
    private int mScore = 0;
    private int QuestionNumber = 0;
    private int score = 0;


    private int mQuestionsLength = theQuestions.theQuestions.length;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.timequizquestion_activity);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);

        // score = (TextView) findViewById(R.id.score);
        txtQuestion = (TextView) findViewById(R.id.txtQuestion);

        // score.setText("Score: " + mScore);

        updateQuestion();
        updateScore(mScore);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button1.getText() == theAnswer) {
                    mScore++;
                    updateScore(mScore);
                    updateQuestion();
                } else {
                    if (button1.getText() != theAnswer) {
                        updateScore(mScore);
                        updateQuestion();
                    }
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button2.getText() == theAnswer) {
                    mScore++;
                    updateScore(mScore);
                    updateQuestion();
                } else {
                    if (button2.getText() != theAnswer) {
                        updateScore(mScore);
                        updateQuestion();
                    }
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button3.getText() == theAnswer) {
                    mScore++;
                    updateScore(mScore);
                    updateQuestion();
                } else {
                    if (button3.getText() != theAnswer) {
                        updateScore(mScore);
                        updateQuestion();
                    }
                }
            }
        });
    }

    private void updateScore(int point) {

        score = (mScore + theQuestions.getLength());

        //score.setText("" + mScore + "/" + myQuestions.getLength());

    }

    private void updateQuestion() {
        if(QuestionNumber< theQuestions.getLength()){

            txtQuestion.setText(theQuestions.gettheQuestions(QuestionNumber));
            button1.setText(theQuestions.gettheAnswer(QuestionNumber, 1));
            button2.setText(theQuestions.gettheAnswer(QuestionNumber, 2));
            button3.setText(theQuestions.gettheAnswer(QuestionNumber, 3));

            theAnswer = theQuestions.gettheCorrectAnswer(QuestionNumber);
            QuestionNumber++;
        }

        else {
            double highnum  = 5;
            double div = mScore/highnum;
            double perc= div*100;

            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(TimeQuizActivity.this);
            alertDialogBuilder

                    .setMessage("Your score is " + mScore + "\n" + "And Your percentage is " + perc + "%" )
                    .setCancelable(false)
                    .setPositiveButton("TRY AGAIN?",
                            new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int i) {
                                    startActivity(new Intent(getApplicationContext(),TimeQuizActivity.class));
                                    finish();
                                }
                            })
                    .setNegativeButton("EXIT",
                            new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int i) {
                                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                                    finish();
                                }
                            });

            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }
    }

}

