package com.example.demo.behavioral.template;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    public void testCricketGame() {
        Game game = new Cricket();
        assertEquals(game.initialize(), "Initializing the cricket game.");
        assertEquals(game.start(), "Starting the cricket game.");
        assertEquals(game.end(), "Ending the cricket game.");
    }

}