package restaurant;

/*  Invocador
    O controle remoto terá que lidar com sete comandos On e Off, que serão armazenados nas matrizes correspondentes.
    Tudo o que precisamos fazer no construtor é criar instâncias e inicializar as matrizes on e off. */

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand; // aqui armazenaremos o último comando executado para o botão undo.

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        /* Atribuímos por default um objeto NoCommand a cada slot, o que nos permite saber que sempre haverá um comando para ser chamado em cada slot */
        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

/*  O método setCommand() recebe uma posição de slot e os comandos On e Off para serem armazenados
    nesse slot. Ele armazena esses comandos nas matrizes On e Off para uso posterior */
    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }


/*  Quando um botão On ou Off é pressionado, chama os métodos correspondentes,
    onButtonWasPushed() ou offButtonWasPushed(). */
    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed(){
        System.out.println("* Undo Button was pressed");
        undoCommand.undo();
    }

/*  Sobrescrevemos toString() para imprimir cada slot e o respectivo comando. */
    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ Remote Control -------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuff.append("[SLOT " + i + "] " + onCommands[i].getClass().getName()
                    + "  -  " + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuff.toString();
    }
}

