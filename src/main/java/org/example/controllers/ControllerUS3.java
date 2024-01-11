package org.example.controllers;

import org.example.DTOs.DTORoom;
import org.example.domain.DTOMapper;
import org.example.domain.House;
import org.example.domain.Room;

import java.util.ArrayList;
import java.util.List;

public class ControllerUS3 {


    DTOMapper dtoMapper = new DTOMapper();
    public List<DTORoom> retrieveListOfRooms(House home){
            ArrayList<Room> clonedList = home.getListOfRoomsObj().getRoomList();
            return dtoMapper.listOfDTORoom(clonedList);
    }


}
