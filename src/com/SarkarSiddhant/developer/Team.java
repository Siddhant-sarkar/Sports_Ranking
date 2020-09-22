package com.SarkarSiddhant.developer;

import java.util.ArrayList;

public class Team <T extends Player> implements Comparable<Team<T>>{
    private String name;
    int played;
    int won;
    int tied;
    int lost;
    ArrayList<Player>members=new ArrayList<>();

    public Team(String name) {
        this.name=name;
    }

    public Team(String name, int played, int won, int tied, int lost) {
        this.name = name;
        this.played = played;
        this.won = won;
        this.tied = tied;
        this.lost = lost;
    }

    public String getName() {
        return name;
    }

    public boolean Add(T player){
        if(members.contains(player)) {
            System.out.println(player.getName()+"  Already in the team");
            return false;
        }
        else{
            System.out.println(player.getName()+"  Added to the team"+this.name);
            members.add(player);
            return true;
        }
    }
    public int NumPlayers(){
        return this.members.size();
    }
    public void matchResult(Team<T> opponent, int ourScore,int theirScore){
        if (ourScore > theirScore){
            won++;
            played++;
        }
        else if (ourScore < theirScore){
            lost++;
            played++;
        }
        else{
            tied++;
            played++;
        }
        if (opponent!=null){
            opponent.matchResult(null,theirScore,ourScore);
        }
    }
    public int ranking(){
        return( (won*2)+tied);
    }

    @Override
    public int compareTo(Team<T> team) {
        if (this.ranking()>team.ranking()){
            return 1;
        }
        else if (this.ranking()<team.ranking()){
            return -1;
        }
        else{
            return 0;
        }
    }
}
