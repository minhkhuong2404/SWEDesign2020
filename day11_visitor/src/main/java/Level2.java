import java.util.*;

public class Level2 extends VisitableTournament{
    private VisitableTournament tournament;
    private VisitableTournament leftBracket;
    private VisitableTournament rightBracket;
    private ArrayList level3 = new ArrayList();

    public Level2 ( VisitableTournament leftBracket, VisitableTournament rightBracket){
        this.leftBracket = leftBracket;
        this.rightBracket = rightBracket;
        this.playerA = this.leftBracket.getWinner();
        this.playerB = this.rightBracket.getWinner();
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        for (Iterator it = level3.iterator(); it.hasNext();){
            ((VisitableTournament) it.next()).accept(visitor);
        }

    }

    public void addLevel3 (Level3 level){
        level3.add(level);
    }
}
