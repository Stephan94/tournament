package com.capgemini.tournament.model;

import com.sun.scenario.animation.AbstractMasterTimer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TeamList {
    public static boolean size;
    private HashMap list;

    // Creates teams and add them to an ArrayList.

    public List<Team> teams() {

        List<Team> teams = new ArrayList<>();

        teams.add(new Team("Utrecht", "Professionals", "sponsor"));
        teams.add(new Team("Amsterdam", "Professionals", "sponsor"));
        teams.add(new Team("Rotterdam", "Amateurs", "drinkbuddy"));
        teams.add(new Team("Den Haag", "Professionals", "sponsor"));
        teams.add(new Team("Enschede", "Amateurs", "drinkbuddy"));
        teams.add(new Team("Groningen", "Professionals", "sponsor"));
        teams.add(new Team("Eindhoven", "Amateurs", "drinkbuddy"));
        teams.add(new Team("Maastricht", "Amateurs", "drinkbuddy"));

        return teams;
    }
}




/**
        private void shuffle(List teamList) {
        // Size of the list
            int totalElements = teamList.size();

            // initialize random number generator
            Random random = new Random();
            for (int loopCounter = 0; loopCounter < totalElements; loopCounter++) {

                // get the list element at current index
                int currentElement = teamList.get(loopCounter);

                // generate a random index within the range of list size
                int randomIndex = loopCounter + random.nextInt(totalElements - loopCounter);

                // set the element at current index with the element at random
                // generated index
                list.set(loopCounter, list.get(randomIndex));
                // set the element at random index with the element at current loop
                // index
                list.set(randomIndex, currentElement);
            }

 }
    }



    // Here the player can choose its team

    public static void playerTeam() {
        Scanner reader = new Scanner(System.in);
        System.out.println("What is the name of your team?");
        String s = reader.next();
        reader.close();
    }
     */