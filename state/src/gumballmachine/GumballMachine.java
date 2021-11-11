package gumballmachine;

public class GumballMachine {

    // Todos os objetos state são criados e atribuídos no construtor. E não mais números inteiros
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;

    State state = soldOutState; // Agora contém um objeto State, não mais um número inteiro.
    int count = 0; // segunda variavel de instancia que armazena o número de gomas na máquina.

    public GumballMachine(int count) {
        soldOutState = new SoldOutState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        noQuarterState = new NoQuarterState(this);
        winnerState = new WinnerState(this);
        this.count = count;
        if (count > 0) {
            state = noQuarterState;
        }
    }

    public void insereMoeda() {
        state.insertQuarter();
    }

    public void ejetaMoeda() {
        state.ejectQuarter();
    }

    public void giraAlavanca() {
        state.turnCrank();
        state.dispense();
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    void refill(int count) {
        this.count = count;
        state = noQuarterState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public int getCount() {
        return count;
    }

    public State getWinnerState() {
        return winnerState;
    }

    // método auxiliar da máquina que libera a gumball e decrementa a variável de instância count.
    public void releaseBall() {
        System.out.println("Machine | Release Ball: gumball out");
        if (count != 0) {
            count = count -1;
        }
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMáquina XPTO");
        result.append(" | Estoque atual: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\nA máquina está: " + state);
        return result.toString();
    }

}

