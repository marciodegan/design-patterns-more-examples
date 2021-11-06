package restaurant;

public class CeilingFan {

    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW  = 1;
    public static final int OFF = 0;
    int speed; // estado local representando a velocidade
    String location = "";

    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    public void on(){
        System.out.println(location + ": The ceiling fan is now ON");
    }

    public void off(){
        speed = OFF;
        System.out.println(location + ": The ceiling fan is now OFF");
    }

    public void high() {
        speed = HIGH;
        System.out.println(location +": The ceiling fan´s speed is now HIGH: " + speed);
    }

    public void medium() {
        speed = MEDIUM;
        System.out.println(location + ": The ceiling fan´s speed is now MEDIUM: " + speed);
    }

    public void low() {
        speed = LOW;
        System.out.println(location + ": The ceiling fan´s speed is now LOW: " + speed);
    }

    public int getSpeed() {
        return speed;
    }
}
