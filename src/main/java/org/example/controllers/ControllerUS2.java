package org.example.controllers;

import org.example.domain.House;
import org.example.domain.ListOfRooms;
import org.example.domain.Room;

public class ControllerUS2 {

    public int addRoomOutdoorToHouse(House house, String roomName, int houseFloor, double roomWidth, double roomLength){
        try {
            Room r = house.getListOfRoomsObj().createRoom(roomName, houseFloor, roomWidth,roomLength);
            house.getListOfRoomsObj().addOutdoorRoomToList(r);
            return 1;
        }catch (InstantiationException instantiationException){
            return -2;
        }
    }
}
