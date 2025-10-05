package net.ccn36.kafkaspringcloudstream.kafka.events;

import java.util.Date;

public record PageEvent(String name, String user, Date date, long duration) {
    public boolean getPayload() {
        return true;
    }
}
