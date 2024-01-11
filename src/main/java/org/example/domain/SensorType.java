package org.example.domain;

public class SensorType {
    private final SensorTypeOptions sensorType;

    /**
     * Constructor for Sensor Type.
     * @param functionality Sensor Type option
     * @throws InstantiationException if Sensor Type's functionality is not available in Sensor Type Options
     */
    public SensorType(String functionality) throws InstantiationException{
        SensorTypeOptions tmpSensorType = sensorTypeChecker(functionality);
        if(tmpSensorType == null){
           throw new InstantiationException("Please choose valid sensor type");
        }
        this.sensorType = tmpSensorType;
    }

    /**
     * Checks if a specific Sensor Type is present in the pool of Sensor Type Options
     * @param sensorType Sensor Type
     * @return Correspondent Sensor Type Option.
     */
    private SensorTypeOptions sensorTypeChecker(String sensorType) {
        for (SensorTypeOptions option : SensorTypeOptions.values()) {

            if (option.name().equals(sensorType.toUpperCase())) {
                return option;
            }
        }
        return null;
    }

    /**
     * @return Sensor Type functionality attribute
     */

    public String getTypeOfSensorToString() {
        return this.sensorType.toString();
    }
}
