import java.util.List;

public class Main {
    public static void main(String[] args) {
        Chapitre chap1 = new Chapitre("Introduction", List.of("...", "..."));
        Chapitre chap2 = new Chapitre("Patron", List.of("...", "..."));
        Chapitre chap3 = new Chapitre("Anti-Patron", List.of("...", "..."));
        Chapitre chap4 = new Chapitre("Conclusion", List.of("...", "..."));
        Memoire memoireAlice = new Memoire("Patrons et Anti-Patrons", List.of(chap1, chap2, chap3, chap4));

        System.out.println("Titre du mémoire : " + memoireAlice.titre());
        System.out.println("Nombre de pages : " + memoireAlice.taille());
    
    }
    
}

