package restaurant;

public class SimpleRemoteControl {

    // Temos um slot para armazenar nosso comando, que controlará um dispositivo específico.
    Command slot;

    public SimpleRemoteControl() {}

    // Temos um método para definir o comando que o slot deverá controlar.
    // Esse método poderia ser chamado diversas vezes caso o cliente do código quisesse mudar o comportamento do botão do controle remoto.
    public void setCommand(Command command) {
        slot = command;
    }

    // Este método é chamado qdo o botão é pressionado. Tudo o que fazemos é chamar o método execute() do comando que atualmente está associado ao slot.
    public void buttonWasPressed() {
        System.out.println("Button was pressed");
        slot.execute();
    }

    public Command getSlot() {
        return slot;
    }
}
