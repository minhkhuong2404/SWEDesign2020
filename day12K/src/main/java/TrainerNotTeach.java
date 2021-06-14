public class TrainerNotTeach implements allPeople{
    @Override
    public void update(Trainer trainer) {
        if (trainer.getState() == State.NotTeach){
            System.out.println("Trainer is not teaching");
        }
    }

    @Override
    public void update(Player player) {

    }
}
