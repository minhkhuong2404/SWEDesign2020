package com.company;

import java.util.Stack;


public class DepthFirstIterator extends Iterator {
    private Stack<TournamentWithIterator> stack = new Stack<TournamentWithIterator>();
    public DepthFirstIterator(TournamentWithIterator tournament){
        stack.push(tournament);
    }

    @Override
    public TournamentWithIterator next() {
        TournamentWithIterator current = null;
        if (this.hasNext()){
            current = stack.pop();
            if(current.getClass().getSimpleName().equals("SinglesBadmintonTournament")){
                SinglesBadmintonTournament match = (SinglesBadmintonTournament) current;
                TournamentWithIterator left = match.getLeftBracket();
                TournamentWithIterator right = match.getRightBracket();
                stack.push(left);
                stack.push(right);

            }
        }
        return current;
    }

    @Override
    public boolean hasNext() {
        return !stack.isEmpty();
    }
}
