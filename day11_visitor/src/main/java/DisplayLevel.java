import java.util.*;

public class DisplayLevel {
    public static ArrayList<Player> generatePlayers(){
        ArrayList<Player> players = new ArrayList<>();

        players.add(new Player("1"));
        players.add(new Player("2"));
        players.add(new Player("3"));
        players.add(new Player("4"));
        players.add(new Player("5"));
        players.add(new Player("6"));
        players.add(new Player("7"));
        players.add(new Player("8"));

        return players;
    }

    public static VisitableTournament generateTournament(){
        ArrayList<Player> players = generatePlayers();

        Level3 quarterfinal1 = new Level3(players.get(0), players.get(1));
        Level3 quarterfinal2 = new Level3(players.get(2), players.get(3));
        Level3 quarterfinal3 = new Level3(players.get(4), players.get(5));
        Level3 quarterfinal4 = new Level3(players.get(6), players.get(7));

        quarterfinal1.setWinner(players.get(0));
        quarterfinal2.setWinner(players.get(2));
        quarterfinal3.setWinner(players.get(4));
        quarterfinal4.setWinner(players.get(6));


        Level2 semifinal1 = new Level2(quarterfinal1, quarterfinal2);
        Level2 semifinal2 = new Level2(quarterfinal3, quarterfinal4);

        semifinal1.setWinner(players.get(0));
        semifinal1.addLevel3(quarterfinal1);
        semifinal1.addLevel3(quarterfinal2);
        semifinal2.setWinner(players.get(4));
        semifinal1.addLevel3(quarterfinal3);
        semifinal1.addLevel3(quarterfinal4);

        Level1 finalMatch = new Level1(semifinal1, semifinal2);

        finalMatch.setWinner(players.get(0));
        finalMatch.addLevel2(semifinal1);
        finalMatch.addLevel2(semifinal2);

        return finalMatch;

    }

    public static void main(String[] args){
        VisitableTournament tournament = generateTournament();
        TournamentLevel level = new TournamentLevel();
        tournament.accept(level);
    }
}
