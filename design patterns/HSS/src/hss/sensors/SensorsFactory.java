package hss.sensors;

public interface SensorsFactory {
    Sensor getSensor(SensorsCompanyType sensorsCompanyType);
}
