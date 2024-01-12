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
        if(!roomList.contains(room)){
            roomList.add(room);
                return 1;
        }
        return -99;
    }


    public ArrayList<Room> getClonedRoomList()  {
        try {
            ArrayList<Room> roomNameList = new ArrayList<>();
            for(Room singleRoom : this.roomList){
                Room room = new Room(singleRoom.getRoomName(),singleRoom.getHouseFloor(),singleRoom.getRoomWidth(),singleRoom.getRoomLength());
                roomNameList.add(room);
            }
            return roomNameList;
        }catch (InstantiationException e){
            return null;
        }

    }

    public ArrayList<Room> getRoomList()  {
        return roomList;
    }

    public int addSensorToRoom(Room room,SensorType sensorType,String sensorName){
        if(room == null){
            return -99;
        }
        Sensor newSensor = room.createSensor(sensorName,sensorType);
        if(room.addSensorToSensorList(newSensor)){
                return 1;
        }
        return -2;

    }


}
