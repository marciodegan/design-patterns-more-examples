package restaurant;

public class CeilingFanMediumCommand implements Command {

    CeilingFan ceilingFan;
    int previousSpeed;

    public CeilingFanMediumCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        previousSpeed = ceilingFan.getSpeed();
        ceilingFan.on();
        ceilingFan.medium();
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
