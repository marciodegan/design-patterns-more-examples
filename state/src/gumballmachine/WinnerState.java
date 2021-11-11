package gumballmachine;

public class WinnerState implements State {

    GumballMachine machine;

    public WinnerState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() { System.out.println("Please wait, "); }

    @Override
    public void ejectQuarter() { System.out.println("Please wait, "); }

    @Override
    public void turnCrank() { System.out.println("turn"); }

    @Override
    public void dispense() {
        System.out.println("**** You´re winner! Get two gumballs ****");
        machine.releaseBall();
        if (machine.getCount() == 0) {
            machine.setState(machine.getSoldOutState());
        } else {
            machine.releaseBall();
            if(machine.getCount() > 0) {
                machine.setState(machine.getNoQuarterState());
            } else {
                System.out.println("oops");
            }
        }
    }
}
