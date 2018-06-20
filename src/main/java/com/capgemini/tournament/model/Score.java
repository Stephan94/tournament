package com.capgemini.tournament.model;

import java.util.Random;

public abstract class Score {

   private int score;

    private int score(Score homeTeam, Score awayTeam) {

        // The teams start the match with 0 - 0

        Random random = new Random();
        score =+ random.nextInt(7);

        return score;
    }



    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
