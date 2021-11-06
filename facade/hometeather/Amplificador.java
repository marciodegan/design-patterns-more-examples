public class Amplificador {

    String description;

    public Amplificador(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println("Amplificador " + description + ": ON");
    }

    public void off() {
        System.out.println("Amplificador " + description + ": OFF");
    }
}
