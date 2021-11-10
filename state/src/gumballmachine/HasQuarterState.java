package gumballmachine;

public class HasQuarterState implements State {

    GumballMachine machine;

    public HasQuarterState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("HasQuarterState: A coin is already in");
        machine.setState(machine.getNoQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("HasQuarterState: Quarter returned | HAS_QUARTER to NO_QUARTER");
        machine.setState(machine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("HasQuarterState: You turned the crank");
        machine.setState(machine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("HasQuarterState: No gumball dispensed");
    }
}
