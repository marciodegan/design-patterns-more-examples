public class Projetor {

    String description;

    public Projetor(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println("Projetor " + description + ": ON");
    }

    public void off() {
        System.out.println("Projetor " + description + ": OFF");
    }
}
