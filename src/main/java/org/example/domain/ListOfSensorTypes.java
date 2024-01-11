package org.example.domain;

import java.util.ArrayList;

public class ListOfSensorTypes {
    private ArrayList<SensorType> sensorTypeList;

    public ListOfSensorTypes(){
        sensorTypeList = new ArrayList<>();
    }

    public int addSensorTypeToList(String sensorType) throws InstantiationException {

        SensorType inputSensorType = getSensorTypeFromList(sensorType);
        //Sensor type may already exist in the list or not:
        if (inputSensorType == null){
            SensorType st = new SensorType(sensorType);
            this.sensorTypeList.add(st);
            return 1;
        } else {
           return 99;
        }
    }

    public SensorType getSensorTypeFromList(String inputSensorType){
        SensorType st = null;
        for (SensorType sensorType : sensorTypeList){
            if(sensorType.getTypeOfSensorToString().equals(inputSensorType.toUpperCase())){
                st = sensorType;
                break;
            }
        }
        return st;
    }
    /**
     * @return List of sensor types with SensorType objects
     */
    public ArrayList<SensorType> getClonedSensorTypeList() throws InstantiationException {

        ArrayList<SensorType> sensorTypeList = new ArrayList<>();
        for(SensorType singleSensorType : this.sensorTypeList){
           SensorType sensorTypeCloned = new SensorType(singleSensorType.getTypeOfSensorToString());
            sensorTypeList.add(sensorTypeCloned);
        }
        return sensorTypeList;
    }

}
