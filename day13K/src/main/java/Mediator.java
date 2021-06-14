import java.util.*;

public class Mediator {
    private Map<Person, ArrayList<Person>> list = new HashMap<>();

    public void addSender(Person sender){
        list.put(sender, new ArrayList<>());
    }

    public void addReceiver(Person sender, Person receiver){
        list.put(sender, updateList(list.get(sender), receiver));

    }

    public void signalAll(Person sender){
        for (Person p: list.get(sender)){
            p.getState(sender);
        }
    }

    public ArrayList<Person> updateList(ArrayList<Person> list, Person person){
        list.add(person);
        return list;
    }
}
