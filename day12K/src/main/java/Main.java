public class Main {
    public static void main(String[] args){
        ZumbaClass101 player1 = createPlayer("Hello");
        player1.checkState();
        player1.changePlayerStatus(State.NotEnroll);

        ZumbaClass101 player2 = createPlayer("XinChao");
        player2.checkState();

        ZumbaClass101 player3 = createPlayer("Hello");
        player3.checkState();

        ZumbaClass101 trainer1 = createTrainer("Hi", "101");
        trainer1.checkState();
        trainer1.changeTrainerStatus(State.NotTeach);

        ZumbaClass101 trainer2 = createTrainer("Hel", "102");
        trainer2.checkState();
    }

    private static ZumbaClass101 createPlayer(String name){
        ZumbaClass101 account = new ZumbaClass101(name);
        account.addPlayer(new PlayerEnroll());
        account.addPlayer(new PlayerUnEnroll());
        return account;
    }

    private static ZumbaClass101 createTrainer(String name, String ZumbaClass){
        ZumbaClass101 account = new ZumbaClass101(name, ZumbaClass);
        account.addTrainer(new TrainerTeach());
        account.addTrainer(new TrainerNotTeach());
        return account;
    }
}
