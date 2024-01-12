package org.example.controllers;

import org.example.DTOs.DTORoom;
import org.example.domain.DTOMapper;
import org.example.domain.House;
import org.example.domain.Room;

import java.util.ArrayList;
import java.util.List;

public class ControllerUS3 {

    DTORoom room;
    DTOMapper dtoMapper = new DTOMapper();


    public List<DTORoom> retrieveListOfRooms(House home) {
        //Quando preciso da lista clonada????
        ArrayList<Room> clonedList = home.getListOfRoomsObj().getClonedRoomList();
        return dtoMapper.listOfDTORoom(clonedList);
    }


    //Aqui estou a receber um input do utilizador... estou a guardar esse DTO

    public void chooseRoom(House home,int index){
        List<DTORoom> dtoRoomList = retrieveListOfRooms(home);
        this.room = dtoRoomList.get(index);
    }

    public void editRoom(House home){

        //Aqui obtém o obj room REAL a partir do DTORoom...
        ArrayList<Room> listOfRooms = home.getListOfRoomsObj().getRoomList();
        Room room = dtoMapper.dtoRoomToRoom(listOfRooms,this.room);
    }


}
