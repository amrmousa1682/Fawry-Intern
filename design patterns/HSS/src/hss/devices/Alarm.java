package hss.devices;

public class Alarm {
    static boolean turnedOn;
    public static void activate(){
        System.out.println("alarm activate");
        turnedOn=true;
    }
    public static void deactivate(){
        System.out.println("alarm deactivate");
        turnedOn=false;
    }
}
