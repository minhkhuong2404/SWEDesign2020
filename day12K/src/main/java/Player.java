public class Player {
    private String name;
    private State state;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public State getState(){
        return state;
    }

    public void setState(State state){
        this.state = state;
    }
}
