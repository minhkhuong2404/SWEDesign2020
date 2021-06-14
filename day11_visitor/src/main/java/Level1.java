import java.util.*;

public class Level1 extends VisitableTournament {
    private VisitableTournament tournament;
    private VisitableTournament leftBracket;
    private VisitableTournament rightBracket;
    private ArrayList level2 = new ArrayList();

    public Level1 ( VisitableTournament leftBracket, VisitableTournament rightBracket){
        this.leftBracket = leftBracket;
        this.rightBracket = rightBracket;
        this.playerA = this.leftBracket.getWinner();
        this.playerB = this.rightBracket.getWinner();
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        for (Iterator it = level2.iterator(); it.hasNext();){
            ((VisitableTournament) it.next()).accept(visitor);
        }

    }

    public void addLevel2( Level2 level){
        level2.add(level);
    }


}
