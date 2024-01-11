package org.example.domain;

public class Sensor {
    private String sensorName;
    private SensorType sensorType;

    /**
     * Constructor for Sensor with all parameters.
     * @param sensorName Sensor name
     * @param sensorType Sensor type
     */
    public Sensor (String sensorName, SensorType sensorType){
        this.sensorName = sensorName;
        this.sensorType = sensorType;
    }

    /**
     * @return String of Sensor's name
     */
    public String getSensorName() {
        return sensorName;
    }
}