public class PlayerUnEnroll implements allPeople{
    @Override
    public void update(Trainer trainer) {
    }

    @Override
    public void update(Player player) {
        if (player.getState() == State.NotEnroll){
            System.out.println("Player is not enrolled");
        }
    }
}
