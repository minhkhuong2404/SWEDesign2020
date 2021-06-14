package com.company;

public class Tournament {
    public static void main(String[] args){

        //Game1
        Player Player1 = new Player("Hieu");
        Player Player2 = new Player("Khuong");
        Match match1 = new Match();
        match1.addParticipant(Player1);
        match1.addParticipant(Player2);
        System.out.println("Game 1: ");
        match1.showName();

        //Game2
        Player Player3 = new Player("Quan");
        Player Player4 = new Player("Khai");
        Match match2 = new Match();
        match2.addParticipant(Player3);
        match2.addParticipant(Player4);
        System.out.println("\nGame 2: ");
        match2.showName();

        //Game 3 without previous result
        Match match3 = new Match();
        match3.addParticipant(match1);
        match3.addParticipant(match2);
        System.out.println("\nPlayer wait for game 3: ");
        match3.showName();

        //Game 3 with results
        match1.eliminated(Player2);
        match2.eliminated(Player4);
        System.out.println("\nGame 3: ");
        match3.showName();

        //Winner
        match3.getWinner(Player3);
        System.out.println("\nWinner for Game 3: ");
        match3.showName();

    }
}
