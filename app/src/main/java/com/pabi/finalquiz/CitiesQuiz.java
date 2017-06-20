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

public class CitiesQuiz extends AppCompatActivity {

    Button button1, button2, button3;
    TextView txtQuestion;

    private QuestionBank2 myQuestions = new QuestionBank2();

    private String myAnswer;
    private int mScore = 0;
    private int QuestionNumber = 0;
    private int score = 0;


    private int mQuestionsLength = myQuestions.myQuestions.length;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.citiesquizquestion_activity);

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
                if (button1.getText() == myAnswer) {
                    mScore++;
                    updateScore(mScore);
                    updateQuestion();
                } else {
                    if (button1.getText() != myAnswer) {
                        updateScore(mScore);
                        updateQuestion();
                    }
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button2.getText() == myAnswer) {
                    mScore++;
                    updateScore(mScore);
                    updateQuestion();
                } else {
                    if (button2.getText() != myAnswer) {
                        updateScore(mScore);
                        updateQuestion();
                    }
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button3.getText() == myAnswer) {
                    mScore++;
                    updateScore(mScore);
                    updateQuestion();
                } else {
                    if (button3.getText() != myAnswer) {
                        updateScore(mScore);
                        updateQuestion();
                    }
                }
            }
        });
    }

       private void updateScore(int point) {

           score = (mScore + myQuestions.getLength());

        //score.setText("" + mScore + "/" + myQuestions.getLength());

    }

    private void updateQuestion() {
        if(QuestionNumber< myQuestions.getLength()){

            txtQuestion.setText(myQuestions.getmyQuestions(QuestionNumber));
            button1.setText(myQuestions.getmyAnswer(QuestionNumber, 1));
            button2.setText(myQuestions.getmyAnswer(QuestionNumber, 2));
            button3.setText(myQuestions.getmyAnswer(QuestionNumber, 3));

            myAnswer = myQuestions.getCorrectAnswer1(QuestionNumber);
            QuestionNumber++;
        }

        else {
            double highnum  = 5;
            double div = mScore/highnum;
            double perc= div*100;

            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(CitiesQuiz.this);
            alertDialogBuilder

                    .setMessage("Your score is " + mScore + "\n" + "And Your percentage is " + perc + "%" )
                    .setCancelable(false)
                    .setPositiveButton("NEXT CATEGORY?",
                            new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int i) {
                                    startActivity(new Intent(getApplicationContext(),TimeQuizActivity.class));
                                    finish();
                                    }
                            })
                    .setNegativeButton("TRY AGAIN",
                            new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int i) {
                                    startActivity(new Intent(getApplicationContext(), CitiesQuiz.class));
                                    finish();
                                    }
                            });

            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
            }
            }

}
