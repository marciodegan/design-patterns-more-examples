public class Tuner {
    String description;
    Amplificador amplificador;

    public Tuner(String description, Amplificador amplificador) {
        this.description = description;
        this.amplificador = amplificador;
    }

    public void on(){
        System.out.println(description + ": ON");
    }

    public void off(){
        System.out.println(description + ": OFF");
    }

    @Override
    public String toString() {
        return "Tuner{" +
                "description='" + description + '\'' +
                ", amplificador=" + amplificador +
                '}';
    }
}
