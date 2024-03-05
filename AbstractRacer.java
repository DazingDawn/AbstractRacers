/**
 * Makes a car
 */

public abstract class AbstractRacer {
    protected double speed;
    protected double location;

    public AbstractRacer(double speed, double location) {
        this.speed = speed;
        this.location = location;
    }

    public abstract void move();
}
