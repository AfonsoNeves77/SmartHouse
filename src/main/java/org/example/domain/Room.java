package org.example.domain;

import java.util.ArrayList;

public class Room {
    private String roomName;
    private int houseFloor;
    private double roomWidth;
    private double roomLength;

    private ListOfSensors sensorList;
    public Room(String roomName, int houseFloor, double roomWidth, double roomLength) throws InstantiationException {
        if(isRoomDataValid(roomName, roomWidth, roomLength)){
            throw new InstantiationException("Please insert valid room data.");
        }
        this.roomName = roomName;
        this.houseFloor = houseFloor;
        this.roomWidth = roomWidth;
        this.roomLength = roomLength;
        this.sensorList = new ListOfSensors();
    }

    private boolean isRoomDataValid(String roomName, double roomWidth, double roomLength) {
        return roomWidth <= 0 || roomLength <= 0 || roomName == null || roomName.trim().isEmpty();
    }

    /**
     * @return Room name
     */
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

    public ListOfSensors getSensorList() {
        return sensorList;
    }

    /**
     * Add sensor to room sensor list;
     * @param sensorName Sensor name;
     * @param sensorType Sensor type (functionality);
     */

    protected boolean addSensorToSensorList(String sensorName, SensorType sensorType){
        return sensorList.addSensorToSensorList(sensorName,sensorType);
    }

    /**
     * Verifies whether sensor exists in the room;
     * @param sensor Sensor name
     * @return True or false
     */



}
