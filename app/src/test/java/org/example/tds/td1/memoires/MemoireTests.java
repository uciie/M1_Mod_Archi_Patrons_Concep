package org.example.tds.td1.memoires;

import java.util.List;

import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MemoireTests {

    private Document memoireAlice;

    @BeforeEach
    public void setUp() {
        Chapitre c1 = new Chapitre("Introduction", List.of("...", "..."));
        Chapitre c2 = new Chapitre("Patrons", List.of("...", "...", "..."));
        Chapitre c3 = new Chapitre("Anti-Patrons", List.of("...", "..."));
        Chapitre c4 = new Chapitre("Conclusion", List.of("..."));
        List<Chapitre> chapitres = new ArrayList<>();
        chapitres.add(c1);
        chapitres.add(c2);
        chapitres.add(c3);
        chapitres.add(c4);
        memoireAlice = new Memoire("Patrons et Anti-Patrons", chapitres);
    }

    @AfterEach
    public void tearDown() {
        memoireAlice = null;
    }

    @Test
    public void tailleCorrecteErroné() {
        assertEquals(7, memoireAlice.taille());
    }

    @Test
    public void tailleCorrecteCorrigé() {
        assertEquals(8, memoireAlice.taille());
    }
}