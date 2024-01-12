package org.example;

import org.example.DTOs.DTORoom;
import org.example.controllers.ControllerUS2;
import org.example.controllers.ControllerUS3;
import org.example.controllers.ControllerUS4;
import org.example.controllers.ControllerUS5;
import org.example.domain.House;
import org.example.domain.ListOfRooms;
import org.example.domain.Room;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InstantiationException {

        House myHouse = new House();


        ControllerUS2 us2 = new ControllerUS2();

        DTORoom dto = new DTORoom("Bedroom",80,90,9);
        us2.addRoomOutdoorToHouse(myHouse,dto);

        ControllerUS3 us3 = new ControllerUS3();
        System.out.println(us3.retrieveListOfRooms(myHouse));

        ControllerUS4 us4 = new ControllerUS4();
        System.out.println(us4.defineSensorType(myHouse,"temperature"));
        System.out.println(us4.defineSensorType(myHouse,"tempenmbmnrature"));
        System.out.println(us4.defineSensorType(myHouse,"temperature"));


        ControllerUS5 us5 = new ControllerUS5(myHouse);
        System.out.println(us5.retrieveListOfRooms());
        us5.chooseRoom(0,myHouse);
        System.out.println(us5.retrieveSensorTypeList(myHouse));
        us5.chooseSensorType(0,myHouse);
        //System.out.println(us5.addNewSensorToRoom(0,0,"MysENSOR"));




    }
}