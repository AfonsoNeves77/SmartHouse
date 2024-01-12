package org.example.domain;

import java.util.ArrayList;

public class ListOfRooms {

    private ArrayList<Room> roomList;

    public ListOfRooms(){
        roomList = new ArrayList<>();

    }

    public Room createRoom(String roomName, int houseFloor, double roomWidth, double roomLength) throws InstantiationException {
        return new Room(roomName,houseFloor,roomWidth,roomLength);
    }

    public int addOutdoorRoomToList(Room room) throws InstantiationException {
        Room inputRoom = getRoomFromList(room.getRoomName());
        if (inputRoom == null) {
            roomList.add(inputRoom);
            return 1;
        } else {
            return -99;
        }
    }


    /**
     * Receives a string name
     * @param roomName Room
     * @return Object Room;
     */
    private Room getRoomFromList(String roomName){
        Room r = null;
        for (Room singleRoom : roomList){
            if(singleRoom.getRoomName().equals(roomName)){
                r = singleRoom;
                break;
            }
        }
        return r;
    }

    public ArrayList<Room> getClonedRoomList() throws InstantiationException {

        ArrayList<Room> roomNameList = new ArrayList<>();
        for(Room singleRoom : this.roomList){
           Room room = new Room(singleRoom.getRoomName(),singleRoom.getHouseFloor(),singleRoom.getRoomWidth(),singleRoom.getRoomLength());
           roomNameList.add(room);
        }
        return roomNameList;
    }

    public ArrayList<Room> getRoomList()  {
        return roomList;
    }

    public int addSensorToRoom(String roomName,String sensorName,SensorType sensorType){
        Room room = getRoomFromList(roomName);
        if(room == null){
            return -99;
        }
        if(room.addSensorToSensorList(sensorName,sensorType)){
                return 1;
        }
        return -2;

    }


}
