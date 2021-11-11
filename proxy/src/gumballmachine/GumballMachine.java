package gumballmachine;

public class GumballMachine {

    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;
    String location;

    State state = soldOutState;
    int count = 0;

    public GumballMachine(String location, int count) {
        soldOutState = new SoldOutState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        noQuarterState = new NoQuarterState(this);
        winnerState = new WinnerState(this);
        this.count = count;
        if (count > 0) {
            state = noQuarterState;
        }
        this.location = location;
    }

    public String getLocation() {
        return location;
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

