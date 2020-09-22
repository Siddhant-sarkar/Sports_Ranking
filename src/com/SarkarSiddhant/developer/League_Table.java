package com.SarkarSiddhant.developer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class League_Table<M extends Team>{
    private String Name_of_the_league;
    private List<M>List_of_team;

    public League_Table(String name_of_the_league) {
        Name_of_the_league = name_of_the_league;
        this.List_of_team=new ArrayList<M>();
    }

    public String getName_of_the_league() {
        return Name_of_the_league;
    }

    public boolean addTeam(M team){
        if(team!=null){
            if (this.List_of_team.contains(team)){
                System.out.println("The team : "+team.getName()+"Already Exists in the "+this.Name_of_the_league);
                return false;
            }
            else {
                this.List_of_team.add(team);
                System.out.println("The team : "+team.getName()+"successfully added to the  "+this.Name_of_the_league);
                return true;
            }
        }
        return false;
    }

    public void ranking(){
        Collections.sort(this.List_of_team);
        Collections.reverse(this.List_of_team);
        System.out.println("*************************");
        for (M t:this.List_of_team
             ) {
            System.out.println(t.getName()+" =======> "+t.ranking());
        }
        System.out.println("*************************");

    }
}
