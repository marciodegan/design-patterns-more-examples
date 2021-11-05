package restaurant;

/*
No jargão do Command Pattern, este é o nosso cliente (a classe RemoteControlTest).
*/

public class RemoteControlTest {

    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl(); // O controle remoto é nosso invocador. Ele receberá um objeto de comando que poderá ser utilizado para fazer solicitações.
        Light light = new Light("Living Room"); // criamos um objeto Light, que será o receptor da solicitação.
        LightOnCommand lightOn = new LightOnCommand(light); // Aqui nós criamos um comando e o passamos para o Receptor.

        remote.setCommand(lightOn); // passamos o comando para o invocador
        remote.buttonWasPressed(); // e finalmente simulamos o botão sendo pressionado.

        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand openUp = new GarageDoorOpenCommand(garageDoor);
        remote.setCommand(openUp);
        remote.buttonWasPressed();

        GarageDoorCloseCommand close = new GarageDoorCloseCommand(garageDoor);
        remote.setCommand(close);
        remote.buttonWasPressed();

        Stereo stereo = new Stereo("Living Room");
        StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);
        remote.setCommand(stereoOn);
        remote.buttonWasPressed();

        System.out.println(remote);

    }
}
