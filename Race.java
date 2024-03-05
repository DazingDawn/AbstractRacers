/**
 * The Race class describes a race distance and the racers
 * that are competing on it. It includes methods for moving
 * every racer on the course
 */
import java.util.ArrayList;

public class Race {
    private ArrayList<AbstractRacer> contestants;
    private int DISTANCE;

    public Race(int distance) {
        DISTANCE = distance;
        contestants = new ArrayList<AbstractRacer>();
    }
    public void addContestant(AbstractRacer r) {
        contestants.add(r);
    }
    public ArrayList<AbstractRacer> getContestants() {
        return contestants;
    }
    public int getDistance() {
        return DISTANCE;
    }


}
