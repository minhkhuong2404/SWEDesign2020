public abstract class VisitableTournament {
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
    public void accept(Visitor visitor){

    }
}
