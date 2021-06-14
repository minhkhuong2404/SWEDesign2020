import java.util.LinkedList;
import java.util.Queue;

public class BreathFirstSearch implements Iterator {
    Queue<Tournament> queue;

    public BreathFirstSearch(Tournament tournament){
        queue = new LinkedList<Tournament>();
        queue.add(tournament);
    }

    @Override
    public boolean hasNext() {
        return !queue.isEmpty();
    }

    @Override
    public Tournament next() {
        Tournament tournament = null;
        if (hasNext()) {
            tournament = queue.poll();
            if (tournament.getClass().getSimpleName().equals("SinglesBadmintonTournament")){
                SinglesBadmintonTournament match = (SinglesBadmintonTournament) tournament;
                queue.add(match.getLeftBracket());
                queue.add(match.getRightBracket());
            }
        }
        return tournament;
    }
}
