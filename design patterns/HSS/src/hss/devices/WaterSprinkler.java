package hss.devices;

public class WaterSprinkler {
    static boolean turnedOn;

    public static void activate() {
        System.out.println("water sprinkler activate");
        turnedOn = true;
    }

    public static void deactivate() {
        System.out.println("water sprinkler deactivate");
        turnedOn = false;
    }
}
