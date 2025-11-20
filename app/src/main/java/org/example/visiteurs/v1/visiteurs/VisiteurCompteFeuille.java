package org.example.visiteurs.v1.visiteurs;

import org.example.visiteurs.v1.structure.FichierSimple;
import org.example.visiteurs.v1.structure.Lien;
import org.example.visiteurs.v1.structure.Repertoire;

public class VisiteurCompteFeuille implements VisiteurFichiers<Integer> {

    int n = 0;

    @Override
    public void visit(FichierSimple f) {
        n++;
    }

    @Override
    public void visit(Lien l) {
        n++;
    }

    @Override
    public void visit(Repertoire r) {
        n++;
    }

    @Override
    public Integer resultat() {
        return n;
    }
}
