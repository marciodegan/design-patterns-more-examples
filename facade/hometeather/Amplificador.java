public class Amplificador {

    String description;
    Tuner tuner;
    Channel channel;

    public Amplificador(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println("Amplificador " + description + ": ON");
    }

    public void off() {
        System.out.println("Amplificador " + description + ": OFF");
    }

    public void setTuner(Tuner tuner) {
        System.out.println("Amplificador " + description + " setado para tuner: " + tuner.description);
        this.tuner = tuner;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }
}
