package org.example.cours3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.example.cards.cours3.Deck;

public class DeckTests {
 
    private Deck deck;

    @BeforeEach
    void setUp() {
        deck = new Deck();
    }

    @AfterEach
    void tearDown() {
        deck = null;
    }   

    @Test
    void sizeIsCorrect() {
        assertEquals(52,deck.size());
    }

}
