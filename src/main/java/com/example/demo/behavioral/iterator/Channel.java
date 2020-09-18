package com.example.demo.behavioral.iterator;

class Channel {
    private double frequency;
    private ChannelTypeEnum channelType;

    public Channel(double frequency, ChannelTypeEnum channelType) {
        this.frequency = frequency;
        this.channelType = channelType;
    }

    public double getFrequency() {
        return frequency;
    }

    public ChannelTypeEnum getChannelType() {
        return channelType;
    }

    @Override
    public String toString() {
        return "Channel{" +
                "frequency=" + frequency +
                ", channelType=" + channelType +
                '}';
    }
}
