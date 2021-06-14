public class SingleTournamentBadminton extends Tournament{
    private Tournament match1;
    private Tournament match2;

    public SingleTournamentBadminton(String name, Tournament match1, Tournament match2){
        super(name, match1.getWinner(), match2.getWinner());
        this.match1 = match1;
        this.match2 = match2;
    }

    @Override
    public void getAllParticipants() {
        match1.getAllParticipants();
        match2.getAllParticipants();
    }

    @Override
    public void bookGames() {
        match1.bookGames();
        match2.bookGames();
        System.out.println("Games has been created: " + participant1.getName() + " vs " + participant2.getName());
    }

    @Override
    public Participants getYoungestParticipant() {
        Participants participant1 = match1.getYoungestParticipant();
        Participants participant2 = match2.getYoungestParticipant();
        return (participant1.getAge() < participant2.getAge()) ? participant1: participant2;
    }
}
