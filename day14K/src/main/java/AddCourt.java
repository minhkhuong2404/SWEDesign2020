public class AddCourt implements Request{
    private Player player;
    private Court court;

    public AddCourt(Court court, Player player){
        this.court = court;
        this.player = player;
    }
    @Override
    public void execute() {
        player.add();
    }
}
