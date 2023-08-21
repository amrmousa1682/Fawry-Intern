package hss;

import hss.commands.AlarmDeactivateCommand;
import hss.commands.RemoteControl;
import hss.commands.WaterSprinklerDeactivateCommand;
import hss.sensors.Sensor;
import hss.sensors.motion.MotionSensorFactory;
import hss.sensors.SensorsFactory;
import hss.sensors.smoke.SmokeSensorFactory;
import hss.sensors.SensorsCompanyType;

public class Main {
    public static void main(String[] args) {
        RemoteControl remoteControl=new RemoteControl();

        SensorsFactory smokeSensorFactory = new SmokeSensorFactory();
        SensorsFactory motionSensorFactory = new MotionSensorFactory();

        Sensor smokeSensor = smokeSensorFactory.getSensor(SensorsCompanyType.COMPANY_A);
        smokeSensor.detect();

        remoteControl.setCommand(new AlarmDeactivateCommand());
        remoteControl.press();

        Sensor motionSensor = motionSensorFactory.getSensor(SensorsCompanyType.COMPANY_B);
        motionSensor.detect();

        remoteControl.setCommand(new WaterSprinklerDeactivateCommand());
        remoteControl.press();

    }
}