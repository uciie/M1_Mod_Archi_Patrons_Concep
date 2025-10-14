package org.example.tds.td3;

import static org.example.cards.cours4.metier.api.ICard.Rank.*;
import static org.example.cards.cours4.metier.api.ICard.Suit.*;
import org.example.cards.cours4.metier.impl.Card;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * Tests unitaires pour la classe Hand :
 * - la taille initiale est de 0
 * - on ne peut pas ajouter au-delà de la taille maximale
 * - ajouter une carte change la taille (+1) si on n'a pas atteint le maximum
 */
public class HandTest {

    @Test
    public void mainInitialementVide() {
        IHand emptyHand = new Hand(5);
        assertEquals("Une main vide doit avoir une taille de 0", 0, emptyHand.size());
        assertTrue("Une main vide doit être marquée vide", emptyHand.isEmpty());
    }

    @Test
    public void ajouterUneCarteChangeLaTaille() {
        final int MAX = 5;
        IHand hand = new Hand(MAX);

        for (int i = 0; i < MAX - 2; i++) {
            hand.add(new Card(ACE, HEARTS));
        }

        int tailleAvant = hand.size();
        hand.add(new Card(ACE, HEARTS));

        assertEquals("Ajouter une carte doit augmenter la taille de 1",
                     tailleAvant + 1, hand.size());
    }

    @Test
    public void ajouterMaxCartesAtteintLeMax() {
        final int MAX = 5;
        IHand hand = new Hand(MAX);

        for (int i = 0; i < MAX; i++) {
            hand.add(new Card(ACE, HEARTS));
        }

        assertEquals("La taille doit atteindre le maximum autorisé",
                     MAX, hand.size());
        assertTrue("Une main pleine doit être marquée comme pleine", hand.isFull());
    }

    @Test(expected = AssertionError.class)
    public void impossibleAjouterAuDelaDuMax() {
        final int MAX = 5;
        IHand hand = new Hand(MAX);

        for (int i = 0; i < MAX; i++) {
            hand.add(new Card(ACE, HEARTS));
        }

        // Doit lever une AssertionError
        hand.add(new Card(ACE, HEARTS));
    }
}
