public class RoomLights {

    String description;

    public RoomLights(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println("Room Lights: " + description + ": ON");
    }

    public void off() {
        System.out.println("Room Lights: " + description + ": OFF");
    }
}
