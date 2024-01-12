package org.example.controllers;
import org.example.DTOs.DTORoom;
import org.example.domain.House;
import org.example.domain.Room;

public class ControllerUS2 {

    public int addRoomOutdoorToHouse(House house, DTORoom dtoRoom){
        try {

            //Cria um quarto e insere na lista :)
            Room r = house.getListOfRoomsObj().createRoom(dtoRoom.getRoomName(), dtoRoom.getHouseFloor(), dtoRoom.getRoomWidth(),dtoRoom.getRoomLength());
            return house.getListOfRoomsObj().addOutdoorRoomToList(r);


        }catch (InstantiationException instantiationException){
            return -2;
        }
    }
}
