public class Trainer {
    private String name;
    private String ZumbaClass;
    private State state;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getZumbaClass(){
        return ZumbaClass;
    }

    public void setZumbaClass(String zumbaClass){
        this.ZumbaClass = zumbaClass;
    }

    public State getState(){
        return state;
    }

    public void setState(State state){
        this.state = state;
    }
}
