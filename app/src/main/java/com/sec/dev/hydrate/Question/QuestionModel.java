package com.sec.dev.hydrate.Question;

public class QuestionModel {

    private String question;
    private int p1, p2, p3;
    private int weight;

    public QuestionModel(String question, int p1, int p2, int p3) {
        this.question = question;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public String getQuestion() {
        return question;
    }

    public int getP1() {
        return p1;
    }

    public int getP2() {
        return p2;
    }

    public int getP3() {
        return p3;
    }

    public int getWeight() {
        return weight;
    }
}
