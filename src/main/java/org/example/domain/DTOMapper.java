package org.example.domain;

import org.example.DTOs.DTORoom;
import org.example.DTOs.SensorTypeDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DTOMapper {

    public DTORoom roomToDTORoom(Room room){
        return new DTORoom(room.getRoomName(),room.getHouseFloor(),room.getRoomWidth(), room.getRoomLength());
    }

    public Room dtoRoomToRoom(ArrayList<Room> listOfRooms, DTORoom room){
        for(Room singleRoom : listOfRooms){
            if(Objects.equals(room.getRoomName(), singleRoom.getRoomName())){
                return singleRoom;
            }
        }
        return null;
    }


    public SensorTypeDTO sensorTypeToDTOSensorType(SensorType sensorType){
        return new SensorTypeDTO(sensorType.getTypeOfSensorToString());
    }


    public SensorType dtoSensorTypeToSensorType(ArrayList<SensorType> listOfSensorTypes, SensorTypeDTO sensorTypeDTO){
        for(SensorType sensorType : listOfSensorTypes){
            if(Objects.equals(sensorType.getTypeOfSensorToString(), sensorTypeDTO.getSensorTypeOption())){
                return sensorType;
            }
        }
        return null;
    }

    public List<DTORoom> listOfDTORoom(ArrayList<Room> listOfRooms){
        ArrayList<DTORoom> dtoRoomsList = new ArrayList<>();
        for(Room singleRoom : listOfRooms){
            dtoRoomsList.add(roomToDTORoom(singleRoom));
        }
        return dtoRoomsList;
    }

    public List<SensorTypeDTO> listOfDTOSensorTypes(ArrayList<SensorType> sensorTypeList){
        ArrayList<SensorTypeDTO> dtoSensorTypeList = new ArrayList<>();
        for(SensorType singleSensorType : sensorTypeList){
           dtoSensorTypeList.add(sensorTypeToDTOSensorType(singleSensorType));
        }
        return dtoSensorTypeList;
    }
}
