package org.example.tds.td2;

import static org.example.tds.td2.Card.Colour.*;
import static org.example.tds.td2.Card.Suit.*;
import static org.example.tds.td2.Card.Rank.*;
import static org.example.tds.td2.Card.CardEnum.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CardTests {

    private Card twoOfHearts;
    private Card kingOfSpades;

    @BeforeEach
    void setUp() {
        twoOfHearts = new Card(TWO_OF_HEARTS);
        kingOfSpades = new Card(KING_OF_SPADES);
    }

    @AfterEach
    void tearDown() {
        twoOfHearts = null;
        kingOfSpades = null;
    }

    @Test
    void rankIsCorrect() {
        assertEquals(TWO, twoOfHearts.rank());
        assertEquals(KING, kingOfSpades.rank());
    }

    @Test
    void suitIsCorrect() {
        assertEquals(HEARTS, twoOfHearts.suit());
        assertEquals(SPADES, kingOfSpades.suit());
    }

    @Test
    void colourIsCorrect() {
        assertEquals(RED, twoOfHearts.colour());
        assertEquals(BLACK, kingOfSpades.colour());
    }
    
}
