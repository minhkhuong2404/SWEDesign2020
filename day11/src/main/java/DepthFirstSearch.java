import java.util.Stack;

public class DepthFirstSearch implements Iterator {
    private Stack<Tournament> stack;

    public DepthFirstSearch(Tournament tournament){
        stack = new Stack<>();
        stack.push(tournament);
    }

    @Override
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    @Override
    public Tournament next() {
        Tournament tournament = null;
        if (hasNext()){
            tournament = stack.pop();
            if (tournament.getClass().getSimpleName().equals("SinglesBadmintonTournament")){
                SinglesBadmintonTournament match = (SinglesBadmintonTournament) tournament;
                stack.push(match.getLeftBracket());
                stack.push(match.getRightBracket());
            }
        }
        return tournament;
    }
}
