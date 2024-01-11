package org.example.domain;

public class House {


    Location location;
    ListOfRooms listOfRooms;
    ListOfSensorTypes listOfSensorTypes;

    public House(){
        this.location = new Location();
        this.listOfRooms = new ListOfRooms();
        this.listOfSensorTypes = new ListOfSensorTypes();
    }

    public Location getLocationObj() {
        return location;
    }

    public ListOfRooms getListOfRoomsObj() {
        return listOfRooms;
    }

    public ListOfSensorTypes getListOfSensorsTypes() {
        return listOfSensorTypes;
    }

}
