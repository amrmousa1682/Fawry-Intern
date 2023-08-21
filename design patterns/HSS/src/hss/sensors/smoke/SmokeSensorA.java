package hss.sensors.smoke;

import hss.util.Logger;
import hss.sensors.Sensor;
import hss.messages.SmokeMessage;
import hss.messages.SmsSender;
import hss.devices.WaterSprinkler;

public class SmokeSensorA implements Sensor {
    @Override
    public void detect() {
        System.out.println("smoke detected (type A)");
        WaterSprinkler.activate();
        SmsSender.send(new SmokeMessage());
        Logger.getInstance().LogSmoke();
    }
}
