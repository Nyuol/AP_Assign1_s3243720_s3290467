/**
 * Created by Nyuol on 31/03/2017.
 */
import java.util.Date;
import java.util.Timer;
abstract public class Game {
   private String ozlympicID;
   private String gameName;
    private Date date;
    private Timer time;

    public Game(String ozlympicID, String gameName, Date, Timer time) {
this.ozlympicID = ozlympicID;
this.gameName = gameName;
this.date = date;
this.time = time;

    }

    public String getOzlympicID() {
        return ozlympicID;
    }

    public void setOzlympicID(String ozlympicID) {
        this.ozlympicID = ozlympicID;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Timer getTime() {
        return time;
    }

    public void setTime(Timer time) {
        this.time = time;
    }


}

