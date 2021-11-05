package restaurant;

public class CeilingFan {

    String location = "";

    public CeilingFan(String location) {
        this.location = location;
    }

    public void on(){
        System.out.println("The ceiling fan is now ON");
    }

    public void off(){
        System.out.println("The ceiling fan is now OFF");
    }
}
