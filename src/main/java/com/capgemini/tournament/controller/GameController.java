package com.capgemini.tournament.controller;

import com.capgemini.tournament.model.Team;
import java.util.ArrayList;

public class GameController {

    private ArrayList<Team> teams;
    private Team homeTeam;
    private Team awayTeam;


    public GameController(Team homeTeam, Team awayTeam) {

        this.setAwayTeam(awayTeam);


    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }
}
