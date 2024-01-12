package org.example.controllers;

import org.example.DTOs.DTORoom;
import org.example.DTOs.SensorTypeDTO;
import org.example.domain.*;

import java.util.ArrayList;
import java.util.List;

public class ControllerUS5 {

    private House home;
    private DTORoom room;
    private SensorTypeDTO sensorTypeDTO;
    DTOMapper dtoMapper = new DTOMapper();


    public ControllerUS5(House home){
        this.home = home;
    }



    public List<DTORoom> retrieveListOfRooms(){
        ArrayList<Room> clonedRoomList = home.getListOfRoomsObj().getClonedRoomList();
        return dtoMapper.listOfDTORoom(clonedRoomList);
    }

    public void chooseRoom(int index,House home){
        this.room = retrieveListOfRooms().get(index);
    }

    public List<SensorTypeDTO> retrieveSensorTypeList(House house)  {

            ArrayList<SensorType> clonedSensorTypeList = house.getListOfSensorsTypes().getClonedSensorTypeList();
            return dtoMapper.listOfDTOSensorTypes(clonedSensorTypeList);

    }

    public void chooseSensorType(int index,House home){
        this.sensorTypeDTO = retrieveSensorTypeList(home).get(index);
    }

   /*public int addNewSensorToRoom(House home,String sensorName){
        Room myRoom = dtoMapper.dtoRoomToRoom(home.getListOfRoomsObj().getRoomList(),this.room);
        SensorType mySensorType = dtoMapper.dtoSensorTypeToSensorType(home.getListOfSensorsTypes().getSensorTypeList(),this.sensorTypeDTO);
        return home.getListOfRoomsObj().addSensorToRoom(myRoom,mySensorType,sensorName);
    }*/


    /*public int addNewSensorToRoom(int indexRoom,int indexSensorType, String sensorName){
        Room room1 = this.home.getListOfRoomsObj().getRoomList().get(indexRoom);
        SensorType mySensorType = this.home.getListOfSensorsTypes().getSensorTypeList().get(indexSensorType);
        return this.home.getListOfRoomsObj().addSensorToRoom(room1,mySensorType,sensorName);
    }*/

    public int addNewSensorToRoom(DTORoom room,SensorTypeDTO sensorTypeDTO, String sensorName){
        Room room1 = this.home.getListOfRoomsObj().getRoomList().get(indexRoom);
        SensorType mySensorType = this.home.getListOfSensorsTypes().getSensorTypeList().get(indexSensorType);
        return this.home.getListOfRoomsObj().addSensorToRoom(room1,mySensorType,sensorName);
    }
}
