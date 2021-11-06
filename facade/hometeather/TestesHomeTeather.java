public class TestesHomeTeather {

    public static void main(String[] args) {
        Amplificador amp = new Amplificador("Yamaha");
        ChannelProvider provider = new ChannelProvider("Netflix");
        Projetor projetor = new Projetor("Sony");
        RoomLights roomLights = new RoomLights("Teto");

        HomeTeatherFacade homeTeatherFacade = new HomeTeatherFacade(amp, provider, projetor, roomLights);
        homeTeatherFacade.watchMovie("Titanic");
    }
}
