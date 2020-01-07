package com.design.patterns.observer.youtube;

public interface Subscriber {
    void update();

    void setChannel(Channel channel);
}
