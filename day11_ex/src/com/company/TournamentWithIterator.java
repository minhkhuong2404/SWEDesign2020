package com.company;

public abstract class TournamentWithIterator {
    protected Player winner;
    protected Player playerA;
    protected Player playerB;
    protected int status = 0;

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
        if (status == 0) {
            System.out.println("Elements " + playerA.toString() + "-" + playerB.toString());
        }
        if (status == 1){
            System.out.println("Composite " + playerA.toString() + "-" + playerB.toString());
        }
    }
    public void setStatus(int status){
        this.status = status;
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
