package com.example.demo.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class IteratorPattern {
    public static void main(String[] args) {
        Channel channel1 = new Channel(12.00, ChannelTypeEnum.HINDI);
        Channel channel2 = new Channel(13.00, ChannelTypeEnum.ENGLISH);
        Channel channel3 = new Channel(14.00, ChannelTypeEnum.HINDI);
        Channel channel4 = new Channel(15.00, ChannelTypeEnum.ENGLISH);
        Channel channel5 = new Channel(16.00, ChannelTypeEnum.HINDI);
        Channel channel6 = new Channel(17.00, ChannelTypeEnum.ENGLISH);
        Channel channel7 = new Channel(18.00, ChannelTypeEnum.HINDI);
        Channel channel8 = new Channel(19.00, ChannelTypeEnum.ALL);

        ChannelCollection collection = new ChannelCollectionImpl();
        collection.addChannel(channel1);
        collection.addChannel(channel2);
        collection.addChannel(channel3);
        collection.addChannel(channel4);
        collection.addChannel(channel5);
        collection.addChannel(channel6);
        collection.addChannel(channel7);
        collection.addChannel(channel8);

        Channel channel;

        System.out.println("English Iterator ------>>>>>");
        ChannelIterator englishIterator = collection.iterator(ChannelTypeEnum.ENGLISH);
        while (englishIterator.hasNext())
        {
            channel = englishIterator.next();
            System.out.println(channel.getChannelType() + " : " + channel.getFrequency());
        }

        System.out.println("ALL Iterator ------>>>>>");
        ChannelIterator allIterator = collection.iterator(ChannelTypeEnum.ALL);
        while (allIterator.hasNext())
        {
            channel = allIterator.next();
            System.out.println(channel.getChannelType() + " : " + channel.getFrequency() );
        }

        System.out.println("Hindi Iterator ------>>>>>");
        ChannelIterator hindiIterator = collection.iterator(ChannelTypeEnum.HINDI);
        while (hindiIterator.hasNext()) {
            channel = hindiIterator.next();
            System.out.println(channel.getChannelType() + " : " + channel.getFrequency() );
        }

    }
}

