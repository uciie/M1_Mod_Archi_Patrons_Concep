import java.util.List;

public class Chapitre implements Document {
    private String titre;
    private List<String> pages;

    // Constructeur
    public Chapitre(String titre, List<String> pages) {
        this.titre = titre;
        this.pages = pages;
    }

    @Override
    public String titre() {
        return titre;
    }

    @Override
    public int taille() {
        return pages.size(); // nombre de pages
    }
}
