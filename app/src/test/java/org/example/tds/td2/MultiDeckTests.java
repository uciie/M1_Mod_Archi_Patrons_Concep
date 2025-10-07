package org.example.tds.td2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MultiDeckTests {

    private static final int NB = 2;
    private MultiDeck multiDeck;

    @BeforeEach
    public void setUp() {
        multiDeck = new MultiDeck(NB);
    }

    @Test
    public void tailleMultiDeck() {
        // initialement on a 52 * le nombre de decks
        assertEquals(52 * NB, multiDeck.size());
        // si on tire n cartes on a 52*le nombre de decks - le nombre de cartes tirées
        int n = 3;
        for (int i = 0; i < n; i++) {
            multiDeck.draw();
        }
        assertEquals(52 * NB - n, multiDeck.size());
    }

    @AfterEach
    public void tearDown() {
        multiDeck = null;
    }

}
