package com.company;

public class SinglesBadmintonTournament extends TournamentWithIterator {
    private TournamentWithIterator leftBracket;
    private TournamentWithIterator rightBracket;
    public SinglesBadmintonTournament(TournamentWithIterator leftBracket, TournamentWithIterator rightBracket) {
        this.leftBracket = leftBracket;
        this.rightBracket = rightBracket;
        this.playerA = this.leftBracket.getWinner();
        this.playerB = this.rightBracket.getWinner();
    }
    public TournamentWithIterator getLeftBracket(){
        return leftBracket;
    }

    public TournamentWithIterator getRightBracket(){
        return rightBracket;
    }
}

