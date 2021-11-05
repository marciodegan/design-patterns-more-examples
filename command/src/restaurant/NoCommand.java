package restaurant;

public class NoCommand implements Command {

    @Override
    public void execute() {
    }
}


/*
    O objeto NoCommand é um exemplo de um objeto nulo.
    Os objetos nulos são úteis quando você não tem um objeto significativo para retornar,
    mas quer retirar do cliente a responsabilidade de lidar com uma resposta null.
    Por exemplo, como não tinhamos um objeto significativo para atribuir a cada slot do controle remoto,
    fornecemos um objeto "NoCommand" que atua como um substituto
    e não faz coisa alguma quando o seu método execute() é chamado.

    No controle remoto, não queremos ter que checar se um novo comando foi carregado sempre que referenciassemos um slot.
    Precisariamos de um trecho de código como:

    public void onButtonWasPushed(int slot) {
        if (onCommands[slot] != null) {
            onCommands[slot].execute();
            }
        }

    ==> Para contar implementamos um comando que não faz nada.

    No construtor do RemoteControl, atribuímos por default um objeto NoCommand a cada slot,
    o que nos permite saber que sempre haverá um comando para ser chamado em cada slot.

    Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
*/
