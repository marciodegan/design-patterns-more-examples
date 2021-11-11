package gumballmachine;

public class NoQuarterState implements State {

    GumballMachine machine;

    // uma referencia à máquina é passada através do construtor. Vamos apenas armazenar numa variável de instância.
    public NoQuarterState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("NoQuarterState: You inserted a quarter | NO_QUARTER to HAS_QUARTER");
        machine.setState(machine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {System.out.println("NoQuarterState: no quarter to eject");}

    @Override
    public void turnCrank() {System.out.println("NoQuarterState: You turned but there´s no quarter | NO_QUARTER to NO_QUARTER");}

    @Override
    public void dispense() {System.out.println("NoQuarterState: You need to insert a quarter first");}


}
