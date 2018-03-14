package com.nukesz.microservices.springboot;

public class Greeting {

    private final String message;
    private final long timeStamp;

    public Greeting(String message, long timeStamp) {
        this.message = message;
        this.timeStamp = timeStamp;
    }

    public String getMessage() {
        return message;
    }

    public long getTimeStamp() {
        return timeStamp;
    }
}
