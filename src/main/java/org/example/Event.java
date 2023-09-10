package org.example;

import java.util.ArrayList;
import java.util.List;

public class Event {
    private String eventName;
    private int minBid;
    public static List<String> eventList;

    private String prize;
    private String eventId;

    public Event(String eventName, String prize, String eventId) {
        eventList.add(eventId);
        this.eventName = eventName;
        this.prize = prize;
        this.eventId = eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public int getMinBid() {
        return minBid;
    }

    public void setMinBid(int minBid) {
        this.minBid = minBid;
    }


    public static List<String> getEventList() {
        return eventList;
    }



    public String getPrize() {
        return prize;
    }

    public void setPrize(String prize) {
        this.prize = prize;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }
}



