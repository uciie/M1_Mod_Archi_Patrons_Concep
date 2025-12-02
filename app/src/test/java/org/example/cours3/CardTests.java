package org.example.cours3;

import org.example.cards.cours3.Card;
import static org.example.cards.cours3.Card.Suit.*;
import static org.example.cards.cours3.Card.Rank.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CardTests {

    private Card aceOfHearts;

    // inutile pour un cas si simple mais permet d'illustrer un peu les tests
    @BeforeEach
    void setUp() {
        aceOfHearts = new Card(ACE, HEARTS);
    }

    @AfterEach
    void tearDown() {
        aceOfHearts = null;
    }

    @Test
    void rankIsCorrect() {
        assertEquals(ACE, aceOfHearts.rank());
    }

    @Test
    void suitIsCorrect() {
        assertEquals(HEARTS, aceOfHearts.suit());
    }
    
}
