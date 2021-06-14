public class Player {
    private String name;
    private int status;

    public Player(String name){
        this.name = name;
    }

    public void add(){
        System.out.println("Add a new court");
    }

    public void book(){
        System.out.println("Booked a new court");
    }
}
