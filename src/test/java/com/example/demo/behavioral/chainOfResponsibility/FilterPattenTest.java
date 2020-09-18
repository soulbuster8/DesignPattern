package com.example.demo.behavioral.chainOfResponsibility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilterPattenTest {

    @Test
    public void processAllFilter() {

        Filter filter = new PosotiveFilter(new NegativeFilter(new ZeroFilter(null)));

        assertEquals(filter.process(-7), -1);
        assertEquals(filter.process(0), 0);
        assertEquals(filter.process(10), 1);
    }

}