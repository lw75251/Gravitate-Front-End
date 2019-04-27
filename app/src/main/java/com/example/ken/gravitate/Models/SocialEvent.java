package com.example.ken.gravitate.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true) // Ignore fields that are not needed for now
public class SocialEvent {

    // {'eventCategory': 'airport', 'participants': [], 'pricing': 100, 'locationId': 'testairportlocationid1', 'isClosed': False, 'localDateString': '2018-12-17', 'name': 'name of the event', 'description': 'what the event is', 'parkingInfo': {'parkingPrice': 0, 'parkingAvailable': False, 'parkingLocation': 'none'}, 'latitude': 33.9416, 'longitude': -118.4085, 'address': '3150 Paradise Rd, Las Vegas, NV 89109', 'earliestArrival': '2018-12-17T00:00:00', 'latestArrival': '2018-12-17T23:59:59', 'earliestDeparture': '2018-12-17T00:00:00', 'latestDeparture': '2018-12-17T23:59:59', 'airportCode': 'LAX'}

    private String eventCategory;
    private boolean isClosed;
    private String address;
    private double latitude;
    private double longitude;
    private List<String> participants;
    private Long pricing;


    public String getEventCategory() {
        return eventCategory;
    }

    public void setEventCategory(String eventCategory) {
        this.eventCategory = eventCategory;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed(boolean closed) {
        isClosed = closed;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public List<String> getParticipants() {
        return participants;
    }

    public void setParticipants(List<String> participants) {
        this.participants = participants;
    }

    public Long getPricing() {
        return pricing;
    }

    public void setPricing(Long pricing) {
        this.pricing = pricing;
    }
}
