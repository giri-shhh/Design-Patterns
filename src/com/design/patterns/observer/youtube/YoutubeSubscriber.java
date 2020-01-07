package com.design.patterns.observer.youtube;

public class YoutubeSubscriber implements Subscriber {
    private Channel channel;

    @Override
    public void update() {
        String update = (String) channel.update(this);
        if (update == null) System.out.println("No new message");
        else System.out.println("Retrieving message = " + update);
    }

    @Override
    public void setChannel(Channel channel) {
        this.channel = channel;
    }
}
