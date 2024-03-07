public class Tortise extends AbstractRacer {

    public Tortise(double speed, double location) {
        super(speed, location);
    }
    public void move() {
        location += speed;
    }
}
