package hss.sensors.motion;

import hss.sensors.Sensor;
import hss.sensors.SensorsFactory;
import hss.sensors.SensorsCompanyType;

public class MotionSensorFactory implements SensorsFactory {
    @Override
    public Sensor getSensor(SensorsCompanyType sensorsCompanyType) {
        switch (sensorsCompanyType){
            case COMPANY_A:return new MotionSensorA();
            case COMPANY_B:return new MotionSensorB();
        }
        return null;
    }
}
