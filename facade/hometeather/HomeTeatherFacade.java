public class HomeTeatherFacade {
    Amplificador amp;
    Network provider;
    Projetor projetor;
    RoomLights roomLights;
    String movie;
    Tuner tuner;
    Channel channel;

    public HomeTeatherFacade(Amplificador amp, Network provider, Projetor projetor, RoomLights roomLights, Tuner tuner, Channel channel) {
        this.amp = amp;
        this.provider = provider;
        this.projetor = projetor;
        this.roomLights = roomLights;
        this.tuner = tuner;
    }

    /*
    watchMovie() envelopa uma sequência de chamadas em um único método que faz o trabalho inteiro.
    Para cada tarefa estamos delegando a responsabilidade ao componente correspondente no subsistema.
    */
    public void watchMovie(String movie) {
        System.out.println("Preparando o vídeo...");
        amp.on();
        amp.setTuner(tuner);
        projetor.on();
        projetor.setChannel(3);
        provider.on();
        roomLights.off();
        provider.play(movie);
    }

    public void endMovie(String Movie) {
        System.out.println("Finalizando o filme...");
        provider.stop();
        roomLights.on();
        provider.off();
        projetor.off();
        amp.off();
    }

    public void playRadio(double frequency) {
        System.out.println("Playing radio...");
        amp.on();
        amp.setTuner(tuner);
        tuner.on();
        tuner.setFM(frequency);
    }

    public void stopRadio() {
        System.out.println("turning radio off...");
        tuner.off();
        amp.off();
    }
}
