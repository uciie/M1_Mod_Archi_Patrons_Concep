package org.example.tds.td3;

import static org.example.cards.cours4.metier.api.ICard.Rank.*;
import static org.example.cards.cours4.metier.api.ICard.Suit.*;
import org.example.cards.cours4.metier.impl.Card;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests unitaires pour la classe Hand :
 * - la taille initiale est de 0
 * - on ne peut pas ajouter au-delà de la taille maximale
 * - ajouter une carte change la taille (+1) si on n'a pas atteint le maximum
 */
public class HandTest {

    @Test
    void mainInitialementVide() {
        IHand emptyHand = new Hand(5);
        assertEquals(0, emptyHand.size(), "Une main vide doit avoir une taille de 0");
        assertTrue(emptyHand.isEmpty(), "Une main vide doit être marquée vide");
    }

    @Test
    void ajouterUneCarteChangeLaTaille() {
        final int MAX = 5;
        IHand hand = new Hand(MAX);

        for (int i = 0; i < MAX - 2; i++) {
            hand.add(new Card(ACE, HEARTS));
        }

        int tailleAvant = hand.size();
        hand.add(new Card(ACE, HEARTS));

        assertEquals(tailleAvant + 1, hand.size(), "Ajouter une carte doit augmenter la taille de 1");
    }

    @Test
    void ajouterMaxCartesAtteintLeMax() {
        final int MAX = 5;
        IHand hand = new Hand(MAX);

        for (int i = 0; i < MAX; i++) {
            hand.add(new Card(ACE, HEARTS));
        }

        assertEquals(MAX, hand.size(), "La taille doit atteindre le maximum autorisé");
        assertTrue(hand.isFull(), "Une main pleine doit être marquée comme pleine");
    }

    @Test
    void impossibleAjouterAuDelaDuMax() {
        final int MAX = 5;
        IHand hand = new Hand(MAX);

        for (int i = 0; i < MAX; i++) {
            hand.add(new Card(ACE, HEARTS));
        }

        // Doit lever une AssertionError
        assertThrows(AssertionError.class, () -> hand.add(new Card(ACE, HEARTS)));
    }
}
