package restaurant;

public interface Command {
    void execute(); // tudo que precisamos é um método chamado execute().

    void undo();
}
