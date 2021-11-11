package gumballmachine;

import java.util.Random;

public class HasQuarterState implements State {

    Random randomWinner = new Random(System.currentTimeMillis());
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
        int winner = randomWinner.nextInt(10);
        if ((winner == 0) && (machine.getCount() > 1)) {
            machine.setState(machine.getWinnerState());
        } else {
            machine.setState(machine.getSoldState());
        }

    }

    @Override
    public void dispense() {
        System.out.println("HasQuarterState: No gumball dispensed");
    }


}
