
public class TestesHomeTeather {

    public static void main(String[] args) {
        Amplificador amp = new Amplificador("Yamaha");
        Network network = new Network("Netflix");
        Projetor projetor = new Projetor("Sony");
        RoomLights roomLights = new RoomLights("Teto");
        Tuner tuner = new Tuner("Panasonic", amp);
        Channel channel = new Channel("Channel 1");

        HomeTeatherFacade homeTeatherFacade = new HomeTeatherFacade(amp, network, projetor, roomLights, tuner, channel);
        homeTeatherFacade.watchMovie("Titanic");

        System.out.println("===");
        homeTeatherFacade.endMovie("Titanic");

        System.out.println("===");
        homeTeatherFacade.playRadio(99.9);

        System.out.println("===");
        homeTeatherFacade.stopRadio();
    }
}
