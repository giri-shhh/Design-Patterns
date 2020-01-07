package com.design.patterns.observable;

public interface Subject {

    void register(Observer observer);

    void unregister(Observer observer);

    void notifyObservers();

    Object update(Observer observer);
}
