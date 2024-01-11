package org.example.controllers;

import org.example.domain.ListOfSensorTypes;

public class ControllerUS4 {

    public int defineSensorType(ListOfSensorTypes listOfSensorTypes,String sensorType){
        try {
            return listOfSensorTypes.addSensorTypeToList(sensorType);
        }catch (InstantiationException e){
            return -2;
        }


    }
}
