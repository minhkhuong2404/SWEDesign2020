import java.util.*;

public abstract class Tournament {

    protected Player winner;
    protected Player playerA;
    protected Player playerB;

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public void showGame() {
        System.out.println(playerA.toString() + "-" + playerB.toString());
    }

    public Player getPlayerA(){
        return playerA;
    }

    public Player getPlayerB(){
        return playerB;
    }

    public Iterator getIterator(String type) {
        Iterator iterator = null;

        switch (type) {
            case "bfs":
                iterator = new BreathFirstSearch(this);
                break;
            case "dfs":
                iterator = new DepthFirstSearch(this);
        }
        return iterator;
    }

    public abstract void print();


}