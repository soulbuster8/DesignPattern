package com.example.demo.behavioral.iterator;

interface ChannelCollection {

    public void addChannel(Channel channel);

    public void removeChannel(Channel channel);

    public ChannelIterator iterator(ChannelTypeEnum type);
}
