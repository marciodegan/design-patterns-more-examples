package gumballmachine;

public class GumballMachineTests {
    public static void main(String[] args) {

        int count = 0;

        if (args.length < 2) {
            System.out.println("GumballMachine <name> <inventory>");
            System.exit(1);
        }

        try {
            count = Integer.parseInt(args[1]);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
//        GumballMachine gumballMachine = new GumballMachine(args[0], count);
        GumballMachine gumballMachine = new GumballMachine("local 1", 10);
        System.out.println(gumballMachine.getCount());
        MachineMonitor monitor = new MachineMonitor(gumballMachine);
        System.out.println(monitor);

        System.out.println(gumballMachine);

        gumballMachine.insereMoeda();
        gumballMachine.giraAlavanca();
        gumballMachine.insereMoeda();
        gumballMachine.giraAlavanca();

        System.out.println(gumballMachine);
        monitor.report();

    }
}

