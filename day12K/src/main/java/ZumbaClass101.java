import java.util.*;

public class ZumbaClass101 implements ZumbaClass{
    private Trainer trainer;
    private Player player;
    private List<allPeople> trainerList = new ArrayList<>();
    private List<allPeople> playerList = new ArrayList<>();

    ZumbaClass101(String name, String ZumbaClass){
        trainer = new Trainer();
        trainer.setName(name);
        trainer.setZumbaClass(ZumbaClass);
    }

    ZumbaClass101(String name){
        player = new Player();
        player.setName(name);
    }

    @Override
    public void addTrainer(allPeople allPeople) {
        if (!trainerList.contains(allPeople)){
            trainerList.add(allPeople);
        }
    }

    @Override
    public void removeTrainer(allPeople allPeople) {
        if (!trainerList.contains(allPeople)){
            trainerList.remove(allPeople);
        }
    }

    @Override
    public void addPlayer(allPeople allPeople) {
        if (!playerList.contains(allPeople)){
            playerList.add(allPeople);
        }
    }

    @Override
    public void removePlayer(allPeople allPeople) {
        if (!playerList.contains(allPeople)){
            playerList.remove(allPeople);
        }
    }

    @Override
    public void notifyAllPeople() {
        for (allPeople people:trainerList){
            people.update(trainer);
        }
        for (allPeople people:playerList){
            people.update(player);
        }
    }

    public void changeTrainerStatus(State state) {
        trainer.setState(state);
        System.out.println("Trainer State is changed");
        this.notifyAllPeople();
    }

    public void changePlayerStatus(State state) {
        player.setState(state);
        System.out.println("Player State is changed");
        this.notifyAllPeople();
    }

    public void checkState(){
        if (this.isZumbaClass101()){
            trainer.setState(State.Teach);
        } else if (this.isEnrolled()){
            player.setState(State.Enroll);
        } else if (!this.isEnrolled()){
            player.setState(State.NotEnroll);
        } else if (!this.isZumbaClass101()){
            trainer.setState(State.NotTeach);
        }
        this.notifyAllPeople();
    }

    private boolean isZumbaClass101(){
        try {
            return "101".equals(trainer.getZumbaClass());
        }catch (NullPointerException e){
            return false;
        }
    }

    private  boolean isEnrolled(){
        try {
            return "Hello".equals(player.getName());
        } catch (NullPointerException e){
            return false;
        }
    }
}
