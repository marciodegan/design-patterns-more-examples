package restaurant;

public class Stereo {

    String location = "";

    public Stereo(String location) {
        this.location = location;
    }

    public void on(){
        System.out.println(location + ": The stereo is on");
    }

    public void setCD(){
        System.out.println(location + ": The CD is playing");

    }

    public void setVolume(int i) {
        System.out.println(location + ": The volume is set to: "+ i);
    }

    public void off() {
        System.out.println(location + ": The stereo is now off");
    }
}
