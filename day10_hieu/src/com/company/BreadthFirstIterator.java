package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstIterator extends Iterator {
    private Queue<TournamentWithIterator> queue = new LinkedList<TournamentWithIterator>();
    public BreadthFirstIterator(TournamentWithIterator tournament){
        queue.add(tournament);
    }

    @Override
    public TournamentWithIterator next() {
        TournamentWithIterator current = null;
        if (this.hasNext()){
            current = queue.poll();
            if(current.getClass().getSimpleName().equals("SinglesBadmintonTournament")){
                SinglesBadmintonTournament match = (SinglesBadmintonTournament) current;
                TournamentWithIterator left = match.getLeftBracket();
                TournamentWithIterator right = match.getRightBracket();
                queue.add(left);
                queue.add(right);

            }
        }
        return current;
    }

    @Override
    public boolean hasNext() {
        return !queue.isEmpty();
    }
}
