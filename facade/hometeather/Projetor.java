public class Projetor {

    String description;
    int channel;

    public Projetor(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println("Projetor " + description + ": ON");
    }

    public void off() {
        System.out.println("Projetor " + description + ": OFF");
    }

    public void setChannel(int channel) {
        this.channel = channel;
        System.out.println("Projetor " + description + " setting to channel: " + channel);
    }
}
