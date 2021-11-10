package gumballmachine;

public class SoldState implements State {

    GumballMachine machine;

    public SoldState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("SoldState: Please wait, we´re already giving you a gumball | SOLD to SOLD");

    }

    @Override
    public void ejectQuarter() {
        System.out.println("SoldState: Sorry, you already turned the crank | SOLD to SOLD");

    }

    @Override
    public void turnCrank() {
        System.out.println("SoldState: Turning twice doesn´t get you another gumball | SOLD to SOLD");

    }

    // Estamos no estado SoldState, o que significa que o cliente já pagou
    // Portanto pedimos que a máquina liberar gumball com o releaseBall()
    // Em seguida, perguntamos à máquina quantas restam com base no resultado, passamos para o estado NoQuarterState ou SoldOutState
    @Override
    public void dispense() {
        System.out.println("SoldState: A gumball is coming out");
        machine.releaseBall();
        if (machine.getCount() > 0) {
            machine.setState(machine.getNoQuarterState());
        } else {
            System.out.println("SoldState: Oops, out of gumballs");
            machine.setState(machine.getSoldOutState());
        }
    }
}