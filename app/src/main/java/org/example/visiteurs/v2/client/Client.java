package org.example.visiteurs.v2.client;

import org.example.visiteurs.v2.structure.Fichier;
import org.example.visiteurs.v2.structure.FichierSimple;
import org.example.visiteurs.v2.structure.Lien;
import org.example.visiteurs.v2.structure.Repertoire;
import org.example.visiteurs.v2.visiteurs.VisiteurAffiche;
import org.example.visiteurs.v2.visiteurs.VisiteurCompteFeuille;
import org.example.visiteurs.v2.visiteurs.VisiteurCompteType;
import org.example.visiteurs.v2.visiteurs.VisiteurFichiers;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        Fichier f1 = new FichierSimple("A.java", "root");
        Fichier f2 = new FichierSimple("B.java", "root");
        Fichier r1 = new Repertoire("code", "root", List.of(f1));
        Fichier r2 = new Repertoire("src", "root", List.of(f2));
        Lien l1 = new Lien("lien", "root", f2);
        Fichier r0 = new Repertoire("racine", "root", List.of(r1,r2,l1));
        VisiteurFichiers<Void> v1 = new VisiteurAffiche();
        r0.accept(v1);
        VisiteurFichiers<Integer> v2 = new VisiteurCompteFeuille();
        r0.accept(v2);
        System.out.println(v2.resultat());
        VisiteurFichiers<List<String>> v3 = new VisiteurCompteType(".java");
        r0.accept(v3);
        // noter multiple occurences
        System.out.println(v3.resultat());

    }
}
