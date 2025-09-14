import java.util.List;

public class Memoire implements Document{
    private String titre;
    private List<Chapitre> chapitres;

    public Memoire(String titre, List<Chapitre> chapitres){
        this.titre = titre;
        this.chapitres = chapitres;
    }

    @Override
    public String titre(){
        return this.titre;
    }

    @Override
    public int taille(){
        int nbPages = 0;
        for(Chapitre chapitre : chapitres){
            nbPages += chapitre.taille();
        }
        return nbPages;
    }
}