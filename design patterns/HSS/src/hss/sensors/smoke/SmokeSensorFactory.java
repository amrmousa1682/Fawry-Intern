package hss.sensors.smoke;

import hss.sensors.Sensor;
import hss.sensors.SensorsFactory;
import hss.sensors.SensorsCompanyType;

public class SmokeSensorFactory implements SensorsFactory {
    @Override
    public Sensor getSensor(SensorsCompanyType sensorsCompanyType) {
        switch (sensorsCompanyType){
            case COMPANY_A:return new SmokeSensorA();
            case COMPANY_B:return new SmokeSensorB();
        }
        return null;
    }
}
