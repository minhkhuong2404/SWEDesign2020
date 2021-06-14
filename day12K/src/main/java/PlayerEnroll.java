public class PlayerEnroll implements allPeople{

    @Override
    public void update(Trainer trainer) {
    }

    @Override
    public void update(Player player) {
        if (player.getState() == State.Enroll){
            System.out.println("Player is enrolled");
        }
    }
}
