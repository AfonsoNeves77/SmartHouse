package org.example.controllers;

import org.example.domain.House;
import org.example.domain.SensorType;

public class ControllerUS4 {

    public int defineSensorType(House house, String sensorType){
        SensorType mySensorType = house.getListOfSensorsTypes().createSensorType(sensorType);
        return house.getListOfSensorsTypes().addSensorTypeToList(mySensorType);
    }
}
