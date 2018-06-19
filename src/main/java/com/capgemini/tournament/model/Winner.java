package com.capgemini.tournament.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Winner {
}


    /**
    private Team HomeTeam;
    private Team AwayTeam;
    private Team Winner;



    public Team Round1(Team homeTeam, Team awayTeam) {

        TeamList teamList = new TeamList();
        List<Team> tournamentParticipants = teamList.teams();

        List<Team> winnerRound1 = new ArrayList<>();

        winnerRound1.add(play(tournamentParticipants.get(0), tournamentParticipants.get(1)));
        winnerRound1.add(play(tournamentParticipants.get(2), tournamentParticipants.get(3)));
        winnerRound1.add(play(tournamentParticipants.get(4), tournamentParticipants.get(5)));
        winnerRound1.add(play(tournamentParticipants.get(6), tournamentParticipants.get(7)));


    }

    public Team Round2(Team homeTeam, Team awayTeam) {

        List<Team> winnerRound2 = new ArrayList<>();

        winnerRound2.add(play(winnerRound1.get(0), winnerRound1.get(1)));
        winnerRound2.add(play(winnerRound1.get(2), winnerRound1.get(3)));

        return winnerRound2;

    }

    List<Team> winnerRound3 = new ArrayList<>();
        winnerRound3.add(play(winnerRound2.get(0), winnerRound2.get(1)));


        return winnerRound3



    private static Team play(Team homeTeam, Team awayTeam) {
        double team1 = Math.random();
        double team2 = Math.random();
    if(team1 > team2){
        return homeTeam;
    }
    else return awayTeam;
    }
}
*/