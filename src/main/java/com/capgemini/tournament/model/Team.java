package com.capgemini.tournament.model;

public class Team {

    //  This class sets the requirements for the participating teams

    //  Name of the team, professional or amateur and who supports them?
    private String teamName;
    private String level;
    private String support;

    //  Constructor for the teams

    public Team(String teamName, String level, String support){
        this.teamName = teamName;
        this.level = level;
        this.support = support;
    }


    // Getter and setter for the teams

    public String getTeamName() {
        return this.teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getLevel() {
        return this.level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getSupport() {
        return this.support;
    }

    public void setSupport(String support) {
        this.support = support;
    }


}














