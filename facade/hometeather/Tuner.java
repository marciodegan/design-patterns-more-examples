public class Tuner {
    String description;
    Amplificador amplificador;
    double frequency;

    public Tuner(String description, Amplificador amplificador) {
        this.description = description;
        this.amplificador = amplificador;
    }

    public void on(){
        System.out.println("Tuner " + description + ": ON");
    }

    public void off(){
        System.out.println("Tuner " + description + ": OFF");
    }

    public void setFrequency(double frequency) {
        System.out.println("Tuner " + description + " setting frequency to: " + frequency);
        this.frequency = frequency;
    }

    public void setFM(double frequency) {
        System.out.println("Tuner " + description + " setting to FM: " + frequency);
    }

    @Override
    public String toString() {
        return "Tuner{" +
                "description='" + description + '\'' +
                ", amplificador=" + amplificador +
                '}';
    }
}
