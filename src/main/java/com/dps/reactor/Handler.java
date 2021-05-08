package com.dps.reactor;

public interface Handler {

    void handler(Event event);

    Event getEvent();
}
