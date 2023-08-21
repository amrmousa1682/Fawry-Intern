package hss.sensors.motion;

import hss.devices.Alarm;
import hss.util.Logger;
import hss.sensors.Sensor;
import hss.messages.MotionMessage;
import hss.messages.SmsSender;

public class MotionSensorA implements Sensor {
    @Override
    public void detect() {
        System.out.println("motion detected (type A)");
        Alarm.activate();
        SmsSender.send(new MotionMessage());
        Logger.getInstance().LogMotion();
    }
}
