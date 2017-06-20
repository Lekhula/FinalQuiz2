package com.pabi.finalquiz;

/**
 * Created by Admin on 6/9/2017.
 */

public class QuestionBank3 {

    public String theQuestions[] = {

            "What is the tallest animal in the world ?",
            "What is the largest type of ‘big cat’ in the world ?",
            "What is the only continent on earth where Giraffes live in the wild ?",
            " How many pairs of wings does a bee have ?",
            "What type of animal is the largest primate in the world?"
    };

    private String theAnswers[][] = {
            {"Ellephant", "Giraffe", "Tiger", "Mouse", "Bee"},
            {"Gorilla","Tiger", "Sheep","Monkey","Cat"},
            {"Africa", "Pretoria", "Maseru", "Bloemfointain", "PE"},
            {"2", "4", "6", "1","8"},
            {"Monkey", "Gorilla", "Bee", "Tiger", "Cow"},

    };

    private String theCorrectAnswers[] = {"Giraffe","Tiger","Africa","2","Gorilla"};

    public int getLength() {
        return theQuestions.length;
    }


    public String gettheQuestions(int a) {
        String question = theQuestions[a];
        return question;
    }

    public String gettheAnswer(int index, int num) {
        String answ0 = theAnswers[index][num-1];
        return answ0;
    }

   /** public String gettheAnswer2(int a) {
        String choice = theAnswers[a][0];
        return choice;
    }

    public String gettheAnswer3(int a) {
        String choice = theAnswers[a][0];
        return choice;
    }**/

    public String gettheCorrectAnswer(int a) {
        String answer = theCorrectAnswers[a];
        return answer;
    }

}




