package org.example.controllers;

import org.example.DTOs.DTORoom;
import org.example.DTOs.SensorTypeDTO;
import org.example.domain.*;

import java.util.ArrayList;
import java.util.List;

public class ControllerUS5 {

    private DTORoom room;
    private SensorTypeDTO sensorTypeDTO;


    DTOMapper dtoMapper = new DTOMapper();

    public List<DTORoom> retrieveListOfRooms(House home){
        ArrayList<Room> clonedList = home.getListOfRoomsObj().getRoomList();
        return dtoMapper.listOfDTORoom(clonedList);
    }

    public void chooseRoom(int index,House home){
        this.room = retrieveListOfRooms(home).get(index);
    }

    public List<SensorTypeDTO> retrieveSensorTypeList(House house)  {
        try {
            return dtoMapper.listOfDTOSensorTypes(house.getListOfSensorsTypes().getClonedSensorTypeList());
        }catch (InstantiationException e){
            return new ArrayList<>();
        }
    }

    public void chooseSensorType(int index,House home){
        this.room = retrieveListOfRooms(home).get(index);
    }



    public int addNewSensorToRoom(House home, String sensorName, SensorType sensorType){
        Room myRoom = dtoMapper.dtoRoomToRoom(home.getListOfRoomsObj().getRoomList(),this.room);
        SensorType mySensorType = dtoMapper.dtoSensorTypeToSensorType()
    }
}
