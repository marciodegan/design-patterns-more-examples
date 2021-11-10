package gumballmachine;

public class GumballMachineTests {
    public static void main(String[] args) {

        GumballMachine machine = new GumballMachine(5);

        System.out.println(machine);
        System.out.println("Estoque: " + machine.count);

        System.out.println("\n== 1 ==");
        machine.insereMoeda();
        machine.giraAlavanca();
        System.out.println(machine.state.getClass());

        System.out.println("\n== 2 ==");
        machine.insereMoeda();
        machine.ejetaMoeda();
        machine.giraAlavanca();
        System.out.println(machine.state.getClass());

        System.out.println("\n== 3 ==");
        machine.insereMoeda();
        machine.giraAlavanca();
        machine.insereMoeda();
        machine.giraAlavanca();
        machine.ejetaMoeda();
        System.out.println(machine.state.getClass());

        System.out.println("\n== 4 ==");
        machine.insereMoeda();
        System.out.println(machine.state.getClass());

        machine.insereMoeda();
        machine.giraAlavanca();
        machine.insereMoeda();
        machine.giraAlavanca();
        System.out.println(machine.state.getClass());
        machine.insereMoeda();
        machine.giraAlavanca();
        System.out.println(machine.state.getClass());
    }
}

