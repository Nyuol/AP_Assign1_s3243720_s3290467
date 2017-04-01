/**
 * Created by Nyuol on 1/04/2017.
 */
abstract public class Participant {
    String name;
    String particpntID;
    int age;
    int phoneNumber;

    public Participant(String name, String particpntID, int age, int phoneNumber ) {
        this.name = name;
        this.particpntID = particpntID;
        this.age = age;
        this.phoneNumber = phoneNumber;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParticpntID() {
        return particpntID;
    }

    public void setParticpntID(String particpntID) {
        this.particpntID = particpntID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    }

