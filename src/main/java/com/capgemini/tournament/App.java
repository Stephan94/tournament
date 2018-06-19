package com.capgemini.tournament;


import com.capgemini.tournament.model.Team;
import com.capgemini.tournament.model.TeamList;

import java.util.ArrayList;
import java.util.List;

public class App {

    // Set the fields

    // Runs the application

    public static void main(String[] args) {

        // Starts with printing the introduction to the tournament.

        System.out.println("Welcome to the soccer tournament of Capgemini! \n");
        System.out.println("In this tournament four professional and four amateur teams will contest for the cup.");
        System.out.println("Eight different cities in the Netherlands are represented.");
       // System.out.println("You can choose your own amateur team to compete as well. \n");
        System.out.println("Goodluck to everyone!\n\n\n");

        // Get the teams from TeamList.

        TeamList teamList = new TeamList();
        List<Team> tournamentParticipants = teamList.teams();

        // Create a new ArrayList containing the winners of round 1.

        List<Team> winnerRound1 = new ArrayList<>();

        // Run game 1, round 1
        System.out.println("The quarter final will start now!\n\n\n");
        System.out.println("The first match of today is:");
        System.out.println(tournamentParticipants.get(0).getTeamName() + " against " + tournamentParticipants.get(1).getTeamName() + "\n");
        winnerRound1.add(play(tournamentParticipants.get(0), tournamentParticipants.get(1)));
        System.out.println("The winner of this game is: " + winnerRound1.get(0).getTeamName() + "!\n");

        // Run game 2, round 1
        System.out.println("The second match of today is:");
        System.out.println(tournamentParticipants.get(2).getTeamName() + " against " + tournamentParticipants.get(3).getTeamName() + "\n");
        winnerRound1.add(play(tournamentParticipants.get(2), tournamentParticipants.get(3)));
        System.out.println("The winner of this game is: " + winnerRound1.get(1).getTeamName() + "!\n");

        // Run game 3, round 1
        System.out.println("The third match of today is:");
        System.out.println(tournamentParticipants.get(4).getTeamName() + " against " + tournamentParticipants.get(5).getTeamName() + "\n");
        winnerRound1.add(play(tournamentParticipants.get(4), tournamentParticipants.get(5)));
        System.out.println("The winner of this game is: " + winnerRound1.get(2).getTeamName() + "!\n");

        // Run game 4, round 1
        System.out.println("The last match of today is:");
        System.out.println(tournamentParticipants.get(6).getTeamName() + " against " + tournamentParticipants.get(7).getTeamName() + "\n");
        winnerRound1.add(play(tournamentParticipants.get(6), tournamentParticipants.get(7)));
        System.out.println("The winner of this game is: " + winnerRound1.get(3).getTeamName() + "!\n\n\n\n");


        // Store winners in a new Arraylist
        List<Team> winnerRound2 = new ArrayList<>();

        // Run game 1, round 2
        System.out.println("The semi-finals will start now! All winners compete here for the grand final\n");
        System.out.println("The first semi-final is:");
        System.out.println(winnerRound1.get(0).getTeamName() + " against " + winnerRound1.get(1).getTeamName()+ "\n");
        winnerRound2.add(play(winnerRound1.get(0), winnerRound1.get(1)));
        System.out.println(winnerRound2.get(0).getTeamName()+ " goes to the final! \n\n\n");

        // Rune game 2, round 2
        System.out.println("The second semi-final is:\n");
        System.out.println(winnerRound1.get(2).getTeamName() + " against " + winnerRound1.get(3).getTeamName()+ "\n");
        winnerRound2.add(play(winnerRound1.get(2), winnerRound1.get(3)));
        System.out.println(winnerRound2.get(1).getTeamName()+ " goes to the final! \n\n\n");


        System.out.println("The grand final starts now!\n\n\n");
        System.out.println(winnerRound2.get(0).getTeamName() + " against " + winnerRound2.get(1).getTeamName()+ "\n");
        winnerRound2.add(play(winnerRound2.get(0), winnerRound2.get(1)));
        System.out.println("The final winner is: " + winnerRound2.get(0).getTeamName());
        System.out.println("Congratulations " + winnerRound2.get(0).getTeamName() + "!\n");
        System.out.println(winnerRound2.get(0).getTeamName() + " is celebrating the victory with their " + winnerRound2.get(0).getSupport());
    }



    // The play method that simulates randomly wich team wins

        private static Team play(Team homeTeam, Team awayTeam) {
            double team1 = Math.random();
            double team2 = Math.random();
            if(team1 > team2){
                return homeTeam;
            }
            else return awayTeam;

        }

    }





