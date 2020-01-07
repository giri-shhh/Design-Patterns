package com.design.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class EmailTopic implements Subject {
    final List<Observer> observerList = new ArrayList<>();
    private String message;

    @Override
    public void register(Observer observer) {
        if (observer == null) throw new NullPointerException("Null observer");
        if (!observerList.contains(observer)) observerList.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observerList.forEach(Observer::update);
    }

    @Override
    public Object update(Observer observer) {
        return this.message;
    }

    public void postMessage(String msg) {
        this.message = msg;
        System.out.println("Message posted.  " + msg);
        notifyObservers();
    }
}
