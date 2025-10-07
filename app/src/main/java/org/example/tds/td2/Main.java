package org.example.tds.td2;

import java.util.List;
import java.util.ArrayList;
import org.example.cards.cours3.Deck;

public class Main {
    public static void main(String[] args) {
        MultiDeck multiDeck1 = new MultiDeck(3); // Crée un MultiDeck avec 3 Decks
        MultiDeck multiDeck2 = new MultiDeck(multiDeck1); // Copie superficielle
        MultiDeck multiDeck3 = MultiDeck.deepCopy(multiDeck1); // Copie profonde

        System.out.println("MultiDeck1 Decks: " + multiDeck1.size());
        System.out.println("MultiDeck2 Decks: " + multiDeck2.size());
        System.out.println("MultiDeck3 Decks: " + multiDeck3.size());

        List<Deck> multiRemove = new ArrayList<>();
        multiRemove.add(multiDeck1.getDecks().remove(1));
        System.out.println("Removed a deck from MultiDeck1");
        System.out.println("Removed Deck size: " + multiRemove.size());
        System.out.println("After modifying MultiDeck1:");
        System.out.println("MultiDeck1 Decks: " + multiDeck1.size());
        System.out.println("MultiDeck2 Decks: " + multiDeck2.size());
        System.out.println("MultiDeck3 Decks: " + multiDeck3.size());

    }
}
