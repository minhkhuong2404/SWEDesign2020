import java.nio.file.attribute.*;

public abstract class Person {
    private String name;
    private Mediator mediator;
    private int state;

    Person(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public void addMediator(Mediator mediator){
        this.mediator = mediator;
        mediator.addSender(this);
    }

    public void setState(int state){
        this.state = state;
        mediator.signalAll(this);
    }

    public int getState(){
        return state;
    }

    public void getState(Person person){
        System.out.println(name + ": " + person.getName() + " sent " + person.getState());
    }
}
