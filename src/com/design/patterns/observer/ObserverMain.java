package com.design.patterns.observer;

public class ObserverMain {

    public static void main(String[] args) {

        EmailTopic topic = new EmailTopic();

        Observer first_observer = new EmailTopicSubscriber("First Observer");
        Observer second_observer = new EmailTopicSubscriber("Second Observer");
        Observer third_observer = new EmailTopicSubscriber("Third Observer");

        topic.register(first_observer);
        topic.register(second_observer);
        topic.register(third_observer);

        first_observer.setSubject(topic);
        second_observer.setSubject(topic);
        third_observer.setSubject(topic);

        first_observer.update();

        topic.postMessage("Hello There");

    }
}
