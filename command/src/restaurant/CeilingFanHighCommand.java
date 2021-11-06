package restaurant;

public class CeilingFanHighCommand implements Command {

    CeilingFan ceilingFan;
    int previousSpeed;

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        previousSpeed = ceilingFan.getSpeed(); // antes de "mudarmos a velocidade", registramos o seu estado anterior, para caso precisarmos reverter através do undo().
        ceilingFan.on();
        ceilingFan.high();
    }

    @Override
    public void undo() {
        // p/ reverter a última ação, colocamos a velocidade do ceilingFan na velocidade em que estava anteriormente
        switch (previousSpeed){
            case CeilingFan.HIGH -> ceilingFan.high();
            case CeilingFan.MEDIUM -> ceilingFan.medium();
            case CeilingFan.LOW -> ceilingFan.low();
            default -> ceilingFan.off();
        }
    }
}
