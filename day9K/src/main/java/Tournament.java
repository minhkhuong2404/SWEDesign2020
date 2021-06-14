import java.util.*;

public abstract class Tournament {
    String name;
    Participants participant1;
    Participants participant2;
    Participants winner ;

    public Tournament(String name, Participants participant1, Participants participant2) {
        this.name = name;
        this.participant1 = participant1;
        this.participant2 = participant2;
    }

    public String getName() {
        return name;
    }

    public Participants getWinner() {
        return winner;
    }

    public void setWinner(Participants winner){
        this.winner = winner;
    }

    public abstract void getAllParticipants();

    public abstract void bookGames();

    public abstract Participants getYoungestParticipant();

}
