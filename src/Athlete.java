/**
 * Created by Nyuol on 30/03/2017.
 */

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Athlete extends Participant {

    String name;
    String particpntID;
    int age;
    int phoneNumber;
    public String athleteType;
    String repnState;
    Random rand;

    public Athlete(String name, String particpntID, int age, int phoneNumber) {
        super(name, particpntID, age, phoneNumber);
    }

    public void canCompete(Random rand) {
        return String Object ozlympID;
        int totalPoints = 0;

        boolean[] canCompete = new boolean[3];

    public String getOzlympID() {
        return ozlympID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAthleteType() {
        return athleteType;
    }

    public String getRepnState() {
        return repnState;
    }

    public void awardPoints(int n) {
        totalPoints = totalPoints + n;
    }

    public String gameType;
    public double finishTime;

    public double compete(int gameType) {
        Random rand = new Random();
        if (gameType == 1) { //running
            finishTime = rand.nextDouble() * (10) + 10; //TO-DO check that this falls between 10 and 20
        } else if (gameType == 2) { //cycling
            finishTime = rand.nextDouble() * (300) + 500; //TO-DO check that this falls between 500 and 800
        } else if (gameType == 3) { //3 corresponds to swimming in ozlympic.java
            finishTime = rand.nextDouble() * (100) + 100; //TO-DO check that this falls between 100-200
            return finishTime;
        } else {
            System.out.println("Error: Game Type is not valid in Athlete.java");
            return 0;
        }
        return finishTime;
    }


}





