public class BookCourt implements Request{
    private Player player;
    private Court court;

    public BookCourt(Court court, Player player){
        this.court = court;
        this.player = player;
    }
    @Override
    public void execute() {
        player.book();
    }
}
