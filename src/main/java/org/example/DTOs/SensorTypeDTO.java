package org.example.DTOs;

import org.example.domain.SensorType;
import org.example.domain.SensorTypeOptions;

public class SensorTypeDTO {

    private String sensorTypeOption;

    public SensorTypeDTO(String sensorTypeOptions){
        this.sensorTypeOption = sensorTypeOptions;
    };

    public String getSensorTypeOption() {
        return sensorTypeOption;
    }
}
