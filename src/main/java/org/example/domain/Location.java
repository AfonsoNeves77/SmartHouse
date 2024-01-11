package org.example.domain;

public class Location {
    private String doorReference;
    private String buildingNumber;
    private String streetName;
    private String city;
    private String country;
    private String zipCode;
    private String geoLocation;

    /* We could eventually try to get the geoLocation using the address only
    https://developers.google.com/maps/documentation/geocoding/start
     */

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
