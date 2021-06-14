import java.text.*;
import java.util.*;

public class SingleTournament extends Tournament {
    public SingleTournament(String name, Participants participant1, Participants participant2){
        super(name, participant1, participant2);
    }

    @Override
    public void getAllParticipants() {
        System.out.println(participant1.getName() + " with " + participant1.getAge());
        System.out.println(participant2.getName() + " with " + participant2.getAge());
    }

    @Override
    public void bookGames() {
        System.out.println("Booking has been created: " + participant1.getName() + " vs " + participant2.getName());
    }

    @Override
    public Participants getYoungestParticipant() {
        return (participant1.getAge() < participant2.getAge()) ? participant1 : participant2;
    }
}
