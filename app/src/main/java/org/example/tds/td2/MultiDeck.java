package org.example.tds.td2;

import java.util.List;
import java.util.ArrayList;

//import org.example.cards.cours3.Card;
import org.example.cards.cours3.Deck;

public class MultiDeck {
    private final List<Deck> decks;

    // Constructeur normal
    public MultiDeck(int numberOfDecks) {
        decks = new ArrayList<>();
        for (int i = 0; i < numberOfDecks; i++) {
            decks.add(new Deck()); // un deck standard de 52 cartes
        }
    }

    // Copie superficielle
    public MultiDeck(MultiDeck other) {
        this.decks = new ArrayList<>(other.decks);
    }

    // Copie profonde
    public static MultiDeck deepCopy(MultiDeck other) {
        MultiDeck copy = new MultiDeck(0);
        for (Deck d : other.decks) {
            copy.decks.add(new Deck(d)); // on suppose que Deck a un constructeur par copie
        }
        return copy;
    }

    public List<Deck> getDecks() {
        return decks;
    }

    
}
