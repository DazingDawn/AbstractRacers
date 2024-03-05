import java.util.Random;

public class McQueen extends AbstractRacer 
{
    public McQueen(double location) 
    {
        super(location);
    }
    public void move() 
    {
        Random rand = new Random();
        double randNum = rand.nextDouble(11);
        if (randNum < 8.0)
        {
            location += randNum;
        }
        else
        {
            location = 0;
        }
    }
}