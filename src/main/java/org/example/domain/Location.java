package org.example.domain;

import java.util.Objects;

public class Location {
    private String doorReference;
    private String buildingNumber;
    private String streetName;
    private String city;
    private String country;
    private String zipCode;
    private String geoLocation;
    /**
     * Constructor for Location with Null parameters.
     */
    public Location(){
    }

    public void editLocation(String doorReference, String buildingNumber, String streetName, String city, String country, String zipCode, String geoLocation){
        this.doorReference = doorReference;
        this.buildingNumber = buildingNumber;
        this.streetName = streetName;
        this.city = city;
        this.country = country;
        this.zipCode = zipCode;
        this.geoLocation = geoLocation;
    }
}
