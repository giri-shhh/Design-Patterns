package com.design.patterns.observable.youtube;

public interface Channel {
    void register(Subscriber subscriber);

    void unregister(Subscriber subscriber);

    void notifySubscribers();

    Object update(Subscriber subscriber);
}
