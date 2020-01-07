package com.design.patterns.observer;

public class EmailTopicSubscriber implements Observer {
    private Subject subject;
    private String name;

    public EmailTopicSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        String update = (String) subject.update(this);
        if (update == null) System.out.println(name + " No new message on this topic");
        else System.out.println(name + " Retrieving message " + update);
    }

    @Override
    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
