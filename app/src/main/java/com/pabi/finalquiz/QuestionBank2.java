package com.pabi.finalquiz;

/**
 * Created by Admin on 6/9/2017.
 */

public class QuestionBank2 {

    public String myQuestions[] = {

            "What is the capital of Namibia ?",
            "What is the capital of Botswana ?",
            "What is the capital of Zimbabwe ?",
            "What is the capital of Lesotho ?",
            "What is the capital of Mozambique ?"
    };

    private String myAnswers[][] = {
            {"Maputo", "Windhoek", "Harare", "Bloemfointain", "Antananarivo"},
            {"Gaborone", "Maseru", "Capetown","Pretoria","Maputo"},
            {"Harare", "Pretoria", "Maseru", "Bloemfointain", "PE"},
            {"PE", "Maseru", "Antananarivo", "North west","Ghana"},
            {"Maputo", "Mbambane", "Maseru", "PE", "Botwsana"},

    };

    private String myCorrectAnswers[] = {"Windhoek","Gaborone","Harare","Maseru","Maputo"};

    public int getLength() {
        return myQuestions.length;
    }

    public String getmyQuestions(int a) {
        String question = myQuestions[a];
        return question;
    }

    public String getmyAnswer(int index, int num) {
        String answer0 = myAnswers[index][num-1];
        return answer0;
    }

    /**public String getAnswer2(int a) {
        String choice = myAnswers[a][0];
        return choice;
    }

    public String getAnswer3(int a) {
        String choice = myAnswers[a][0];
        return choice;
    }**/

    public String getCorrectAnswer1(int a) {
        String answer = myCorrectAnswers[a];
        return answer;
    }

}
