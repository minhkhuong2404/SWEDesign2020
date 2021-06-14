public class Client {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();

        Player player1 = new Player("player1");
        Player player2 = new Player("player2");
        Player player3 = new Player("player3");

        Coach coach1 = new Coach("coach1");
        Coach coach2 = new Coach("coach2");
        Coach coach3 = new Coach("coach3");

        player1.addMediator(mediator);
        mediator.addReceiver(player1, coach1);
        mediator.addReceiver(player1, coach2);

        player2.addMediator(mediator);
        mediator.addReceiver(player2, coach2);

        player3.addMediator(mediator);
        mediator.addReceiver(player3, coach2);
        mediator.addReceiver(player3, coach3);

        player1.setState(1);

        player2.setState(2);

        player3.setState(3);
    }
}
