package com.SarkarSiddhant.developer;

public class Main {

    public static void main(String[] args) {
//        FootBall_Player Messi=new FootBall_Player("Messi");
//        FootBall_Player Beckham=new FootBall_Player("Beckham");
//        FootBall_Player Ronaldo=new FootBall_Player("Ronaldo");
//        FootBall_Player Zidane=new FootBall_Player("Zidane");
//        FootBall_Player Zalatan=new FootBall_Player("Zalatan");



        Team<FootBall_Player> invincible_united =new Team<>("Invincible United",10,5,5,5);
        Team<FootBall_Player> Real_Madrid=new Team<>("Real Madrid",10,4,4,4);
        Team<FootBall_Player> La_Galaxy =new Team<>("La Galaxy ",10,3,3,3);
//        invincible_united.Add(Messi);
//        invincible_united.Add(Beckham);
//        invincible_united.Add(Ronaldo);
//        invincible_united.Add(Zidane);
//        invincible_united.Add(Zalatan);
////        invincible_united.Add(charlie);


        League_Table<Team> Uefa_League=new League_Table<>("UEFA League");
        Uefa_League.addTeam(Real_Madrid);

        Uefa_League.addTeam(invincible_united);
        Uefa_League.addTeam(La_Galaxy);


        Uefa_League.ranking();







    }
}
