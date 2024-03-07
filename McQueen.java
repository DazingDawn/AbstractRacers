import java.util.Random;

public class McQueen extends AbstractRacer {
    public McQueen(double speed, double location) {
        super(speed, location);
    }
    public void move() {
        Random rand = new Random();
        double randNum = rand.nextDouble();
        if (randNum < 0.9) {
            location += speed;
        } else {
            location = 0;
            System.out.println("McQueen crashed!");
        }
    }
}
