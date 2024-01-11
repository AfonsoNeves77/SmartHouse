package org.example.DTOs;
import org.example.domain.Room;

public class DTORoom {

    private String roomName;
    private int houseFloor;
    private double roomWidth;
    private double roomLength;

    public DTORoom(String roomName, int houseFloor, double roomWidth, double roomLength){
        this.roomName = roomName;
        this.houseFloor = houseFloor;
        this.roomWidth = roomWidth;
        this.roomLength = roomLength;
    }

    public String getRoomName() {
        return roomName;
    }

    public int getHouseFloor() {
        return houseFloor;
    }

    public double getRoomWidth() {
        return roomWidth;
    }

    public double getRoomLength() {
        return roomLength;
    }

}
