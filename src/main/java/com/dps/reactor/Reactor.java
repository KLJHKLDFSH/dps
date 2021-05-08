package com.dps.reactor;

import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

public class Reactor {

    private static Reactor instance;

    private static ConcurrentHashMap<EventKey,Event> container = new ConcurrentHashMap();


    private Reactor() {

    }

    public static Reactor getInstance(){
        if(instance == null){
            synchronized (Reactor.class){
                if (instance == null) {
                    instance = new Reactor();
                }
            }
            return instance;
        }

        return new Reactor();
    }

    public void handleEvents(){

    }

    public boolean register(EventKey... eventKey){
        return true;
    }

    public boolean removeHandle(EventKey... eventKey){
        return true;
    }

}
