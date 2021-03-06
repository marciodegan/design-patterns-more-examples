import restaurant.*;

public class RemoteLoader {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

    //  Criamos todos os dispositivos nos locais adequados
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Kitchen");
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo("Living Room");

    //  Criamos todos os objetos de comando Light
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

    //  On e Off p/ ventilador de teto
        CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

    //  Open e Close p/ garage door
        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorClose = new GarageDoorCloseCommand(garageDoor);

    //  On and Off do stereo
        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffWithCDCommand stereoOffWithCD = new StereoOffWithCDCommand(stereo);

    //  Agora que temos todos os comandos, podemos carregá-los nos slots do controle remoto
        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
        remoteControl.setCommand(3, stereoOnWithCD, stereoOffWithCD);

        System.out.println("\n==1==\n");
        remoteControl.offButtonWasPushed(0);
        remoteControl.undoButtonWasPushed();

        System.out.println("\n==2==\n");
        remoteControl.onButtonWasPushed(1);
        remoteControl.undoButtonWasPushed();

        System.out.println("\n==3==\n");
        remoteControl.onButtonWasPushed(2);
        remoteControl.undoButtonWasPushed();

        System.out.println("\n==4==\n");
        remoteControl.onButtonWasPushed(3);
        remoteControl.undoButtonWasPushed();

        System.out.println("\n==5==\n");
        CeilingFan ceilingFanLivingRoom = new CeilingFan("Living Room");
        CeilingFanHighCommand ceilingFanHighLivingRoom = new CeilingFanHighCommand(ceilingFanLivingRoom);
        CeilingFanOffCommand ceilingFanOffLivingRoom = new CeilingFanOffCommand(ceilingFanLivingRoom);
        remoteControl.setCommand(4, ceilingFanHighLivingRoom, ceilingFanOffLivingRoom);
        remoteControl.onButtonWasPushed(4);
        remoteControl.offButtonWasPushed(4);
        remoteControl.undoButtonWasPushed();

        System.out.println("\n==6==\n");
        CeilingFan ceilingFanKitchen = new CeilingFan("Kitchen");
        CeilingFanHighCommand ceilingFanHighKitchen = new CeilingFanHighCommand(ceilingFanKitchen);
        CeilingFanOffCommand ceilingFanOffKitchen = new CeilingFanOffCommand(ceilingFanKitchen);
        remoteControl.setCommand(4, ceilingFanHighKitchen, ceilingFanOffKitchen);
        remoteControl.onButtonWasPushed(4);
        remoteControl.offButtonWasPushed(4);
        remoteControl.undoButtonWasPushed();

        System.out.println("\n==7==\n");
        CeilingFanLowCommand ceilingFanMedium = new CeilingFanLowCommand(ceilingFanLivingRoom);
        remoteControl.setCommand(5, ceilingFanHighLivingRoom, ceilingFanOffLivingRoom);
        remoteControl.onButtonWasPushed(5);
        remoteControl.offButtonWasPushed(5);
        remoteControl.undoButtonWasPushed();

        System.out.println(remoteControl);

        System.out.println("\n==MACRO BUTTON==\n");
        // criação dos dispositivos
        Light lightSaloon = new Light("Saloon");
        Stereo stereoSaloon = new Stereo("Saloon");
        CeilingFan ceilingFanSaloon = new CeilingFan("Saloon");
        Light lightKitchen = new Light("Kitchen");

        // criação dos comandos
        LightOnCommand lightOnSaloon = new LightOnCommand(lightSaloon);
        LightOffCommand lightOffSaloon = new LightOffCommand(lightSaloon);
        StereoOnWithCDCommand stereoOnSaloon = new StereoOnWithCDCommand(stereoSaloon);
        StereoOffWithCDCommand stereoOffSaloon = new StereoOffWithCDCommand(stereoSaloon);
        CeilingFanHighCommand ceilingFanHighSaloon = new CeilingFanHighCommand(ceilingFanSaloon);
        CeilingFanOffCommand ceilingFanOffSaloon = new CeilingFanOffCommand(ceilingFanSaloon);
        LightOnCommand lightOnKitchen = new LightOnCommand(lightKitchen);
        LightOffCommand lightOffKitchen = new LightOffCommand(lightKitchen);

        // matrizes para os comandos On e Off
        Command[] partyOn = { lightOnSaloon, stereoOnSaloon, ceilingFanHighSaloon, lightOnKitchen };
        Command[] partyOff = { lightOffSaloon, stereoOffSaloon, ceilingFanOffSaloon, lightOffKitchen};

        // criação dos MacroCommands
        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        // setando no slot
        remoteControl.setCommand(6, partyOnMacro, partyOffMacro);

        System.out.println(remoteControl);

        System.out.println("==> pushing Macro button ON...");
        remoteControl.onButtonWasPushed(6);
        System.out.println("==> pushing Macro button OFF...");
        remoteControl.offButtonWasPushed(6);
        remoteControl.undoButtonWasPushed();
     }
}
