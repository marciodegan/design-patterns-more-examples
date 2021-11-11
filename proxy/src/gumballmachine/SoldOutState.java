package gumballmachine;

public class SoldOutState implements State {

    GumballMachine machine;

    public SoldOutState(GumballMachine machine) {this.machine = machine;}

    @Override
    public void insertQuarter() { System.out.println("SoldOut: You can´t insert a quarter | SOLD_OUT to SOLD_OUT");}

    @Override
    public void ejectQuarter() { System.out.println("SoldOut: You can´t eject, you haven´t inserted a quarter yet | SOLD_OUT to SOLD_OUT");}

    @Override
    public void turnCrank() { System.out.println("Soldout: Not accepting quarters. We´re sold out");}

    @Override
    public void dispense() { System.out.println("Soldout: We´re sold out");}
}