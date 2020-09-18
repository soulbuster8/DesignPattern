package com.example.demo.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

class ChannelCollectionImpl implements ChannelCollection {

    private List<Channel> collection = new ArrayList<>();

    @Override
    public void addChannel(Channel channel) {
        collection.add(channel);
    }

    @Override
    public void removeChannel(Channel channel) {
        collection.remove(channel);
    }

    @Override
    public ChannelIterator iterator(ChannelTypeEnum type) {
        return new ChannelIteratorImpl(type);
    }

    private class ChannelIteratorImpl implements ChannelIterator {

        private int position;
        private ChannelTypeEnum channelType;

        public ChannelIteratorImpl(ChannelTypeEnum channelType) {
            this.position = 0;
            this.channelType = channelType;
        }

        @Override
        public boolean hasNext() {
            while (position < collection.size()) {
                if (collection.get(position).getChannelType().equals(channelType) ||
                        channelType.equals(ChannelTypeEnum.ALL)) {
                    return true;
                }
                position++;
            }
            return false;
        }

        @Override
        public Channel next() {
            Channel channel = collection.get(position);
            position++;
            return channel;
        }
    }
}
