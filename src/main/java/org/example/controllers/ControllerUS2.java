package org.example.controllers;

import org.example.domain.ListOfRooms;

public class ControllerUS2 {

    public int addRoomOutdoorToHouse(ListOfRooms listOfRooms,String roomName, int houseFloor, double roomWidth, double roomLength){
        try {
            return listOfRooms.addOutdoorRoomToList(roomName,houseFloor,roomWidth,roomLength);
        }catch (InstantiationException instantiationException){
            return -2;
        }
    }
}
