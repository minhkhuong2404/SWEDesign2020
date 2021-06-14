package com.company;

public abstract class TournamentWithIterator {
    protected Player winner;
    protected Player playerA;
    protected Player playerB;

    public Player getWinner() {
        return winner;
    }
    public void setWinner(Player winner){
        this.winner = winner;
    }
    public Player getPlayerA(){
        return playerA;
    }

    public Player getPlayerB(){
        return playerB;
    }
    public void showGame() {
        System.out.println(playerA.toString() + "-" + playerB.toString());
    }
    public Iterator getIterator(String type) {
        Iterator iter = null;
        switch (type) {
            case "depthfirst": {
                iter = new DepthFirstIterator(this);
                break;
            }
            case "breadthfirst": {
                iter = new BreadthFirstIterator(this);
                break;
            }
        }
        return iter;
    }
}
