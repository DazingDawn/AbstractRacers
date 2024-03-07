public class Hare extends AbstractRacer{
    private double energy;

    public Hare(double speed, double location, double energy) {
        super(speed, location);
        this.energy = energy;
    }
    public void move() {
        if (Math.random() < 0.2) {
            energy += 1;
        } else if (energy > 0) {
            location += speed;
            energy -= 1;
        } else {
            energy += 1;
        }
    }
}
