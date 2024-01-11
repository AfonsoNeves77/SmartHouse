package org.example.controllers;

import org.example.domain.House;
import org.example.domain.Location;

public class ControllerUS1 {

    public int configureLocation(House house, String doorReference, String buildingNumber, String streetName, String city, String country, String zipCode, String geoLocation){
        house.getLocationObj().editLocation(doorReference,buildingNumber,streetName,city,country,zipCode,geoLocation);
        return 1;
    }
}
