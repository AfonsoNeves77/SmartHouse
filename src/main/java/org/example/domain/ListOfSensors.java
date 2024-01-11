package org.example.domain;

import java.util.ArrayList;

public class ListOfSensors {

    private ArrayList<Sensor> sensorList = new ArrayList<>();

    public ListOfSensors(){

    }

    protected boolean addSensorToSensorList(String sensorName, SensorType sensorType){
        Sensor addedSensor = new Sensor(sensorName, sensorType);
        if(!doesSensorExistInRoom(addedSensor)){
            this.sensorList.add(addedSensor);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Verifies whether sensor exists in the room;
     * @param sensor Sensor name
     * @return True or false
     */
    private boolean doesSensorExistInRoom(Sensor sensor){
        String sensorName = sensor.getSensorName();
        for(Sensor singleSensor : sensorList){
            if(singleSensor.getSensorName().equals(sensorName)){
                return true;
            }
        }
        return false;
    }




}
