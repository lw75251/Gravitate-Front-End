package com.example.ken.gravitate.Models;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

import static org.junit.Assert.assertEquals;

public class SocialEventTest {

    private InputStream is;
    private String in;

    @Before
    public void setUp() throws Exception {
        // Note that the json string mixes SocialEventLocation with AirportEvent
//        is = Test.class.getResourceAsStream("ride.json");
        in = "{\"eventCategory\": \"airport\", \"participants\": [], \"pricing\": 100, \"locationId\": \"testairportlocationid1\", \"isClosed\": false, \"localDateString\": \"2018-12-17\", \"name\": \"name of the event\", \"description\": \"what the event is\", \"parkingInfo\": {\"parkingPrice\": 0, \"parkingAvailable\": false, \"parkingLocation\": \"none\"}, \"latitude\": 33.9416, \"longitude\": -118.4085, \"address\": \"3150 Paradise Rd, Las Vegas, NV 89109\", \"earliestArrival\": \"2018-12-17T00:00:00\", \"latestArrival\": \"2018-12-17T23:59:59\", \"earliestDeparture\": \"2018-12-17T00:00:00\", \"latestDeparture\": \"2018-12-17T23:59:59\", \"airportCode\": \"LAX\"}";
    }

    @Test
    public void getAddress() throws Exception {

        ObjectMapper mapper = new ObjectMapper();
        SocialEvent testObj = mapper.readValue(in, SocialEvent.class);
        assertEquals("pickup address should equal",
                "3150 Paradise Rd, Las Vegas, NV 89109",
                testObj.getAddress());
    }

    @Test
    public void getLatitude() throws Exception {

        ObjectMapper mapper = new ObjectMapper();
        SocialEvent testObj = mapper.readValue(in, SocialEvent.class);
        assertEquals("latitude should equal",
                33.9416,
                testObj.getLatitude(), 0.001);
    }

}