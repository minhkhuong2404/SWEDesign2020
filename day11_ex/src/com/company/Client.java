package com.company;

public class Client {

    public static void main(String[] args) {
        //Generate 8 players
        Player player1 = new Player("1");
        Player player2 = new Player("2");
        Player player3 = new Player("3");
        Player player4 = new Player("4");
        Player player5 = new Player("5");
        Player player6 = new Player("6");
        Player player7 = new Player("7");
        Player player8 = new Player("8");

        //First 4 games
        TournamentWithIterator match1 = new SinglesBadminton(player1, player2);
        TournamentWithIterator match2 = new SinglesBadminton(player3, player4);
        TournamentWithIterator match3 = new SinglesBadminton(player5, player6);
        TournamentWithIterator match4 = new SinglesBadminton(player7, player8);
        match1.setWinner(player1);
        match2.setWinner(player3);
        match3.setWinner(player5);
        match4.setWinner(player7);


        //Next 2 games
        TournamentWithIterator semifinal1 = new SinglesBadmintonTournament(match1,match2);
        TournamentWithIterator semifinal2 = new SinglesBadmintonTournament(match3,match4);

        semifinal1.setWinner(player1);
        semifinal2.setWinner(player5);

        //Last game
        TournamentWithIterator finalMatch = new SinglesBadmintonTournament(semifinal1, semifinal2);
        finalMatch.setWinner(player1);


        //Test DF - BF - First OPP
        testbf(finalMatch);
        testdf(finalMatch);
        testfirstopp(finalMatch,player1);
    }
    public static void testbf(TournamentWithIterator tournament){
        System.out.println("----------breadth first----------");
        Iterator bfIter = tournament.getIterator("breadthfirst");
        while (bfIter.hasNext()){
            TournamentWithIterator current = bfIter.next();
            current.showGame();
        }
    }
    public static void testdf(TournamentWithIterator tournament){
        System.out.println("----------depth first----------");
        Iterator dfIter = tournament.getIterator("depthfirst");
        while (dfIter.hasNext()){
            TournamentWithIterator current = dfIter.next();
            current.showGame();
        }
    }
    public static void testfirstopp(TournamentWithIterator tournament,Player name) {
        System.out.println("----------first opponent----------");
        Player firstopp = null;
        String player = name.toString();
        Iterator iterator = tournament.getIterator("breadthfirst");
        while (iterator.hasNext()) {
            TournamentWithIterator current = iterator.next();
            if(current.getClass().getSimpleName().equals("SinglesBadmintonTournament")){
                SinglesBadmintonTournament match = (SinglesBadmintonTournament) current;

                if(match.getLeftBracket().getWinner().toString().equals(player)){
                    iterator = match.getLeftBracket().getIterator("breadthfirst");
                } else if(match.getRightBracket().getWinner().toString().equals(player)){
                    iterator = match.getRightBracket().getIterator("breadthfirst");
                }

            } else if (current.getClass().getSimpleName().equals("SinglesBadminton")){
                SinglesBadminton match = (SinglesBadminton) current;
                if (match.getPlayerA().toString().equals(player)) {
                    firstopp = match.getPlayerB();
                } else if (match.getPlayerB().toString().equals(player)){
                    firstopp = match.getPlayerA();
                }
            }
        }

        System.out.println("First opponent of Player " + name.toString() + " is Player " + firstopp.toString());
    }

}
