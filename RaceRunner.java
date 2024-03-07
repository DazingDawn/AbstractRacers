public class RaceRunner {
    public static void main(String[] args) 
    {
        Race race = new Race(100);
        race.addContestant(new McQueen(2.0, 0));
        race.addContestant(new Hare(1.5, 0, 10));
        while (!isRaceFinished(race)) 
        {
            moveAllContestants(race);
            printRaceStatus(race);
        }
    }
    private static void moveAllContestants(Race race) 
    {
        for (AbstractRacer racer : race.getContestants()) 
        {
            racer.move();
        }
    }
    private static boolean isRaceFinished(Race race) 
    {
        for (AbstractRacer racer : race.getContestants()) 
        {
            if (racer.getLocation() >= race.getDistance()) 
            {
                System.out.println("The winner is: " + racer.getClass().getSimpleName());
                return true;
            }
        }
        return false;
    }
    private static void printRaceStatus(Race race) 
    {
        for (AbstractRacer racer : race.getContestants()) 
        {
            System.out.println(racer.getClass().getSimpleName() + " is at location " + racer.getLocation());
        }
        System.out.println();
    }
}
