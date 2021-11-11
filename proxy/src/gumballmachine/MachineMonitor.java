package gumballmachine;

public class MachineMonitor {

    GumballMachine machine;

    public MachineMonitor(GumballMachine machine) {
        this.machine = machine;
    }

    public void report() {
        System.out.println("MAchine: " + machine.getLocation());
        System.out.println("Estoque: " + machine.getCount());
        System.out.println("Estado: " + machine.getState());
    }
}
