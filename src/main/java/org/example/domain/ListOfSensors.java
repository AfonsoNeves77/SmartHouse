package org.example.domain;

import java.util.ArrayList;

public class ListOfSensors {

    private ArrayList<Sensor> sensorList = new ArrayList<>();

    public ListOfSensors(){

    }



    protected boolean addSensorToSensorList(Sensor sensor){
        if(!sensorExistInRoom(sensor)){
            this.sensorList.add(sensor);
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
    private boolean sensorExistInRoom(Sensor sensor){
        return this.sensorList.contains(sensor);
    }




}
