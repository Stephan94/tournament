package com.capgemini.tournament.model;

import com.sun.scenario.animation.AbstractMasterTimer;

import java.util.ArrayList;
import java.util.List;

public class TeamList {

    // Creates teams and add them to an ArrayList.

    public List<Team> teams () {

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

    // Here the player can choose its team

    public static void playerTeam() {
        Scanner reader = new Scanner(System.in);
        System.out.println("What is the name of your team?");
        String s = reader.next();
        reader.close();
    }
     */