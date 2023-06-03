import java.util.ArrayList;
import java.util.List;

/**
 * Observer is used to alert other subclasses object when there is some particular action in the associate object
 * we know all the current observers, when something happen we call them.
 */
public class ObserverDP {
    public static void main(String[] args) {
        Observer ps1 = new Passenger("Tai");
        Observer ps2 = new Passenger("Thanh");
        Observer ps3 = new Passenger("Ha");
        Subject newFlight = new FlightVN103();
        newFlight.attach(ps1);
        newFlight.attach(ps2);
        newFlight.attach(ps3);
        newFlight.detach(ps2);
        newFlight.notifyAllObserver();
    }
}
interface Observer {
    void update();
}
interface Subject {
    void detach(Observer observer);
    void attach(Observer observer);
    void notifyAllObserver();
}
class FlightVN103 implements Subject{
    private List<Observer> observers = new ArrayList<>();
    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyAllObserver() {
        for (Observer obs : observers) {
            obs.update();
        }
    }

    public List<Observer> getObservers() {
        return observers;
    }
}
class Passenger implements Observer {
    private String name;

    public Passenger(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println(name + " noticed! your flight will be departed soon please navigated to your gate.");
    }
}
