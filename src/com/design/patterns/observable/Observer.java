package com.design.patterns.observable;

public interface Observer {

    void update();

    void setSubject(Subject subject);
}
