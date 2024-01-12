package org.example.domain;

import java.util.ArrayList;

public class ListOfSensorTypes {
    private ArrayList<SensorType> sensorTypeList;

    public ListOfSensorTypes(){
        sensorTypeList = new ArrayList<>();
    }

    public SensorType createSensorType(String functionality) {
        try{
            return new SensorType(functionality);
        }
        catch (InstantiationException e){
            return null;
        }
    }

    public int addSensorTypeToList(SensorType sensorType) {
        if(sensorType != null){
            SensorType inputSensorType = getSensorTypeFromList(sensorType.getTypeOfSensorToString());
            //Sensor type may already exist in the list or not:
            if (inputSensorType == null){
                this.sensorTypeList.add(sensorType);
                return 1;
            } else {
                return 99;
            }
        }
        return -999;

    }

    private SensorType getSensorTypeFromList(String inputSensorType){
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
    public ArrayList<SensorType> getClonedSensorTypeList() {

        ArrayList<SensorType> sensorTypeList = new ArrayList<>();

        try {
            for(SensorType singleSensorType : this.sensorTypeList){
                SensorType sensorTypeCloned = new SensorType(singleSensorType.getTypeOfSensorToString());
                sensorTypeList.add(sensorTypeCloned);
            }

            return sensorTypeList;
        }catch (InstantiationException e){
            return null;
        }

    }

    public ArrayList<SensorType> getSensorTypeList() {
        return sensorTypeList;
    }
}
