package org.example.tds.td2;

public class Main {
    public static void main(String[] args) {
        MultiDeck multiDeck1 = new MultiDeck(3); // Crée un MultiDeck avec 3 Decks
        MultiDeck multiDeck2 = new MultiDeck(multiDeck1); // Copie superficielle
        MultiDeck multiDeck3 = MultiDeck.deepCopy(multiDeck1); // Copie profonde

        System.out.println("MultiDeck1 Decks: " + multiDeck1.getDecks().size());
        System.out.println("MultiDeck2 Decks: " + multiDeck2.getDecks().size());
        System.out.println("MultiDeck3 Decks: " + multiDeck3.getDecks().size());
    }
}
