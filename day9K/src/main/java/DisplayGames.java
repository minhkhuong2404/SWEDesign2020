import java.util.*;

public class DisplayGames {
    public static ArrayList<Participants> generatePlayer(){
        ArrayList<Participants> ParticipantsList = new ArrayList<Participants>();

        ParticipantsList.add(new Participants("Nam", 23));
        ParticipantsList.add(new Participants("Hieu", 21));
        ParticipantsList.add(new Participants("Viet", 25));
        ParticipantsList.add(new Participants("Hoang", 22));
        ParticipantsList.add(new Participants("Minh", 13));
        ParticipantsList.add(new Participants("Bao", 18));
        ParticipantsList.add(new Participants("Lon", 30));
        ParticipantsList.add(new Participants("Phat", 23));

        return ParticipantsList;
    }

    public static HashMap<String, Tournament> generateTournament()
    {
        HashMap<String, Tournament> tournamentsList = new HashMap<>();
        ArrayList<Participants> ParticipantsList = generatePlayer();

        Tournament quarterfinal1 = new SingleTournament(
                "quarterfinal1",
                ParticipantsList.get(0),
                ParticipantsList.get(1)
        );

        tournamentsList.put("quarterfinal1", quarterfinal1);

        Tournament quarterfinal2 = new SingleTournament(
                "quarterfinal2",
                ParticipantsList.get(2),
                ParticipantsList.get(3)
        );
        tournamentsList.put("quarterfinal2", quarterfinal2);

        Tournament quarterfinal3 = new SingleTournament(
                "quarterfinal3",
                ParticipantsList.get(4),
                ParticipantsList.get(5)
        );

        Tournament quarterfinal4 = new SingleTournament(
                "quarterfinal4",
                ParticipantsList.get(6),
                ParticipantsList.get(7)
        );
        tournamentsList.put("quarterfinal4", quarterfinal4);

        quarterfinal1.setWinner(ParticipantsList.get(0));
        quarterfinal2.setWinner(ParticipantsList.get(2));
        quarterfinal3.setWinner(ParticipantsList.get(4));
        quarterfinal4.setWinner(ParticipantsList.get(6));

        Tournament semifinal1 = new SingleTournamentBadminton(
                "semifinal1",
                quarterfinal1,
                quarterfinal2
        );
        tournamentsList.put("semifinal1", semifinal1);

        Tournament semifinal2 = new SingleTournamentBadminton(
                "semifinal2",
                quarterfinal3,
                quarterfinal4
        );
        tournamentsList.put("semifinal2", semifinal2);

        semifinal1.setWinner(ParticipantsList.get(2));
        semifinal2.setWinner(ParticipantsList.get(6));

        Tournament finalMatch = new SingleTournamentBadminton(
                "final",
                semifinal1,
                semifinal2
        );
        tournamentsList.put("final", finalMatch);
        finalMatch.setWinner(ParticipantsList.get(2));

        return tournamentsList;
    }

    public static void main(String args[]){
        HashMap<String, Tournament> tournamentList = generateTournament();
        System.out.println("All player: ");
        tournamentList.get("final").getAllParticipants();

        System.out.println("Games for final: ");
        tournamentList.get("final").bookGames();

        Participants youngestParticipants = tournamentList.get("final").getYoungestParticipant();
        System.out.println("Youngest Participants: "
                + youngestParticipants.getName() + " " + youngestParticipants.getAge() + " years old"
        );


    }
}
