public class Tortoise extends AbstractRacer{

    public Tortoise(double speed, double location) {
        super(speed, location);
    }
    public void move() {
        location += speed;
    }
}
