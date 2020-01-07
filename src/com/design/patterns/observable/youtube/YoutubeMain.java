package com.design.patterns.observable.youtube;

public class YoutubeMain {

    public static void main(String[] args) {
        YoutubeChannel ghostChannel = new YoutubeChannel();

        YoutubeSubscriber subscriber1  = new YoutubeSubscriber();
        YoutubeSubscriber subscriber2  = new YoutubeSubscriber();
        YoutubeSubscriber subscriber3  = new YoutubeSubscriber();

        ghostChannel.register(subscriber1);
        ghostChannel.register(subscriber2);
        ghostChannel.register(subscriber3);

        subscriber1.setChannel(ghostChannel);
        subscriber2.setChannel(ghostChannel);
        subscriber3.setChannel(ghostChannel);

        subscriber1.update();

        ghostChannel.postMessage("Hello ........");
    }
}
