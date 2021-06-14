public class TrainerTeach implements allPeople {
    @Override
    public void update(Trainer trainer) {
        if (trainer.getState() == State.Teach){
            System.out.println("Trainer is teaching");
        }
    }

    @Override
    public void update(Player player) {

    }
}
