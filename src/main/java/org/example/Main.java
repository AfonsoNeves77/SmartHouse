package org.example;

import org.example.DTOs.DTORoom;
import org.example.controllers.ControllerUS2;
import org.example.controllers.ControllerUS3;
import org.example.controllers.ControllerUS5;
import org.example.domain.House;
import org.example.domain.ListOfRooms;
import org.example.domain.Room;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InstantiationException {

        House myHouse = new House();

        ArrayList<Room> LIS = myHouse.getListOfRoomsObj().getRoomList();

        ListOfRooms a = myHouse.getListOfRoomsObj();

        System.out.println(LIS);
        System.out.println(a);


        /*ControllerUS3 cus3 = new ControllerUS3();
        ControllerUS5 cus5 = new ControllerUS5();
        myHouse.getListOfSensorsTypes().addSensorTypeToList("Temperature");
        myHouse.getListOfRoomsObj().addOutdoorRoomToList("Name",10,10,10);
        System.out.println(cus3.retrieveListOfRooms(myHouse));

        System.out.println(cus5.retrieveListOfRooms(myHouse));
        cus5.chooseRoom(0,myHouse);
        System.out.println(cus5.retrieveSensorTypeList(myHouse));*/



    }
}