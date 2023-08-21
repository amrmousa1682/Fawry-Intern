package hss.sensors.smoke;

import hss.util.Logger;
import hss.sensors.Sensor;
import hss.messages.SmokeMessage;
import hss.messages.SmsSender;
import hss.devices.WaterSprinkler;

public class SmokeSensorB implements Sensor {
    @Override
    public void detect() {
        System.out.println("smoke detected (type B)");
        WaterSprinkler.activate();
        SmsSender.send(new SmokeMessage());
        Logger.getInstance().LogSmoke();
    }
}
