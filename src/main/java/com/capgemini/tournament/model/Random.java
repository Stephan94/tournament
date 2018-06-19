package com.capgemini.tournament.model;


import com.capgemini.tournament.App;

import java.lang.Math;

public class Random {

    // Arraylist of teams counts from 0 to 7 for the 8 teams in total.
    // Then, a random int is generated that will state the winner according to its index.

        public void RandomGenerator() {

        int max = 7;
        int min = 0;
        int range = max - min - 1;

        for (int i = 0; i < 8; i++) {
            int rand = (int) (Math.random() * range) + min;

            System.out.println(rand);
        }
    }
}


