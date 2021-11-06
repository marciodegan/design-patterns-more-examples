public class HomeTeatherFacade {
    Amplificador amp;
    ChannelProvider provider;
    Projetor projetor;
    RoomLights roomLights;
    String movie;

    public HomeTeatherFacade(Amplificador amp, ChannelProvider provider, Projetor projetor, RoomLights roomLights) {
        this.amp = amp;
        this.provider = provider;
        this.projetor = projetor;
        this.roomLights = roomLights;
    }

    /*
    watchMovie() envelopa uma sequência de chamadas em um único método que faz o trabalho inteiro.
    Para cada tarefa estamos delegando a responsabilidade ao componente correspondente no subsistema.
    */
    public void watchMovie(String movie) {
        System.out.println("Preparando o vídeo...");
        amp.on();
        roomLights.off();
        projetor.on();
        provider.on();
        provider.play(movie);
    }

    public void endMovie(String Movie) {
        System.out.println("Finalizando o filme...");
        amp.off();
        provider.off();
        projetor.off();
        roomLights.off();
    }
}
