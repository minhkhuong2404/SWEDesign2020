import java.util.ArrayList;
import java.util.Stack;

public class DisplayGames {
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

    public static Tournament generateTournament(){
        ArrayList<Player> players = generatePlayers();

        Tournament quarterfinal1 = new SinglesBadminton(players.get(0), players.get(1));
        Tournament quarterfinal2 = new SinglesBadminton(players.get(2), players.get(3));
        Tournament quarterfinal3 = new SinglesBadminton(players.get(4), players.get(5));
        Tournament quarterfinal4 = new SinglesBadminton(players.get(6), players.get(7));

        quarterfinal1.setWinner(players.get(0));
        quarterfinal2.setWinner(players.get(2));
        quarterfinal3.setWinner(players.get(4));
        quarterfinal4.setWinner(players.get(6));

        Tournament semifinal1 = new SinglesBadmintonTournament(quarterfinal1, quarterfinal2);
        Tournament semifinal2 = new SinglesBadmintonTournament(quarterfinal3, quarterfinal4);

        semifinal1.setWinner(players.get(0));
        semifinal2.setWinner(players.get(4));

        Tournament finalMatch = new SinglesBadmintonTournament(semifinal1, semifinal2);

        finalMatch.setWinner(players.get(0));
        return finalMatch;

    }

    public static void depthFirst(Tournament match) {
        System.out.println("--DFS--");
        Iterator iterator = match.getIterator("dfs");
        while (iterator.hasNext()) {
            Tournament tournament = iterator.next();
            tournament.print();
            tournament.showGame();
        }
    }
    
    public static void breadFirst(Tournament match) {
        System.out.println("--BFS--");
        Iterator iterator = match.getIterator("bfs");
        while (iterator.hasNext()) {
            Tournament tournament = iterator.next();
            tournament.print();
            tournament.showGame();
        }
    }

    public static Player firstOpponent(Tournament tournament, Player player) {

        Player firstOpponent = null;
        String name = player.toString();
        Iterator iterator = tournament.getIterator("bfs");
        while(iterator.hasNext()){
            Tournament currentTournament = iterator.next();

            if(currentTournament.getClass().getSimpleName().equals("SinglesBadmintonTournament")){
                SinglesBadmintonTournament match = (SinglesBadmintonTournament) currentTournament;

                if(match.getLeftBracket().getWinner().toString().equals(name)){
                    iterator = match.getLeftBracket().getIterator("bfs");
                } else if(match.getRightBracket().getWinner().toString().equals(name)){
                    iterator = match.getRightBracket().getIterator("bfs");
                }

            } else if (currentTournament.getClass().getSimpleName().equals("SinglesBadminton")){
                SinglesBadminton match = (SinglesBadminton) currentTournament;
                if (match.getPlayerA().toString().equals(name)) {
                    firstOpponent = match.getPlayerB();
                } else if (match.getPlayerB().toString().equals(name)){
                    firstOpponent = match.getPlayerA();
                }
            }
        }

        System.out.println(
                "First opponent of " + player.toString() + " is " +firstOpponent.toString()
        );
        return firstOpponent;
    }

    public static void main(String args[]){
        Tournament match = generateTournament();
        breadFirst(match);
        depthFirst(match);
        firstOpponent(match, new Player("6"));
    }
}