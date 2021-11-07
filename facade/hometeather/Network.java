public class Network {

    String description;
    String movie;

    public Network(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println("Network " + description + ": ON");
    }

    public void off() {
        System.out.println("Network " + description + ": OFF");
    }

    public void play(String movie) {
        System.out.println("Network " + description + " is playing the movie: " + movie);
    }

    public void stop() {
        System.out.println("Network " + description + " is stopping the movie... ");
    }
}
