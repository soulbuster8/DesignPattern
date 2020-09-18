package com.example.demo.behavioral.state;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


class StatePatternTest {

    @Test
    public void newlyCreatedState() {
        Package pkg = new Package();
        assertEquals(pkg.getState().getClass(), OrderedState.class);
    }

    @Test
    public void deliveredState() {
        Package pkg = new Package();
        PackageState state = new OrderedState();
        state.next(pkg);
        assertEquals(pkg.getState().getClass(), DeliveredState.class);
    }

}