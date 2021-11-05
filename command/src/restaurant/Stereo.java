package restaurant;

public class Stereo {

    String location = "";

    public Stereo(String location) {
        this.location = location;
    }

    public void on(){
        System.out.println("The stereo is on");
    }

    public void setCD(){
        System.out.println("The CD is playing");

    }

    public void setVolume(int i) {
        System.out.println("The volume is set to: "+ i);
    }

    public void off() {
        System.out.println("The stereo is now off");
    }
}
