package com.design.patterns.observable.youtube;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Channel {

    List<Subscriber> subscribers = new ArrayList<>();
    private String message;

    @Override
    public void register(Subscriber subscriber) {
        if (subscriber == null) throw new NullPointerException("Subscriber null");
        if (!subscribers.contains(subscriber)) subscribers.add(subscriber);
    }

    @Override
    public void unregister(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        subscribers.forEach(Subscriber::update);
    }

    @Override
    public Object update(Subscriber subscriber) {
        return this.message;
    }

    public void postMessage(String msg) {
        this.message = msg;
        notifySubscribers();
    }
}
