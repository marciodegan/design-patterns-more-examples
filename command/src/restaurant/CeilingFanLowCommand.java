package restaurant;

public class CeilingFanLowCommand implements Command {

    CeilingFan ceilingFan;
    int previousSpeed;

    public CeilingFanLowCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        previousSpeed = ceilingFan.getSpeed();
        ceilingFan.on();
        ceilingFan.low();
    }

    @Override
    public void undo() {
        switch (previousSpeed){
            case CeilingFan.HIGH -> ceilingFan.high();
            case CeilingFan.MEDIUM -> ceilingFan.medium();
            case CeilingFan.LOW -> ceilingFan.low();
            default -> ceilingFan.off();
        }
    }
}
