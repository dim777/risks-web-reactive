package ru.techlab.risks.web.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.concurrent.atomic.AtomicInteger;

public class Event {
    public enum Type {
        CHAT_MESSAGE, USER_JOINED, USER_STATS, USER_LEFT;
    }

    private static AtomicInteger ID_GENERATOR = new AtomicInteger(0);
    private Type type;
    private final int id;
    private String payload;




    @JsonCreator
    public Event(@JsonProperty("type") Type type,
                 @JsonProperty("payload") String payload) {
        this.type = type;
        this.payload = payload;
        this.id = ID_GENERATOR.addAndGet(1);
    }
}
