package com.pabi.finalquiz;

/**
 * Created by Admin on 6/8/2017.
 */

public class QuestionBank1 {

    public String mQuestions[] = {

            "2+18 = ?",
            "10-3 = ?",
            "5+7 = ?",
            "3+6 = ?",
            "1+5 = ?",


    };



    private String mChoices[][] = {

            {"18", "19", "20", "5", "21"},
            {"6", "7", "15", "8", "5"},
            {"12", "13", "14", "19", "15"},
            {"8", "7", "9", "1", "22"},
            {"6", "7", "5", "6", "11"},


    };

    private String mCorrectAnswers[] = {"20", "7", "12", "9", "6"};

    public int getLength() {
        return mQuestions.length;
    }



    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }

    public String getChoice(int index, int num) {
        String choice0 = mChoices[index][num-1];
        return choice0;
    }


   /** public String getChoice2(int a) {
        String choice = mChoices[a][0];
        return choice;
    }



    public String getChoice3(int a) {
        String choice = mChoices[a][2];
        return choice;
    }**/



    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;

    }



}
