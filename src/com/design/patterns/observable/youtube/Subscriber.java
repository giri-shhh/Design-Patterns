package com.design.patterns.observable.youtube;

public interface Subscriber {
    void update();

    void setChannel(Channel channel);
}
