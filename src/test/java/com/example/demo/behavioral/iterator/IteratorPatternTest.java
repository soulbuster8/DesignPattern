package com.example.demo.behavioral.iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IteratorPatternTest {

    @Test
    public void testIteratorPattern()
    {
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

        ChannelIterator hindiIterator = collection.iterator(ChannelTypeEnum.HINDI);
        ChannelIterator englishIterator = collection.iterator(ChannelTypeEnum.ENGLISH);
        ChannelIterator allIterator = collection.iterator(ChannelTypeEnum.ALL);


        assertEquals(hindiIterator.hasNext(), true);
        assertEquals(hindiIterator.next().getFrequency(), 12.00);

        assertEquals(englishIterator.hasNext(), true);
        assertEquals(englishIterator.next().getFrequency(), 13.00);

        assertEquals(allIterator.hasNext(), true);
        assertEquals(allIterator.next().getFrequency(), 12.00);

    }

}