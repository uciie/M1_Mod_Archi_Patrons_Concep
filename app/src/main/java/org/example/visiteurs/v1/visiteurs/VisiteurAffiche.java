package org.example.visiteurs.v1.visiteurs;

import org.example.visiteurs.v1.structure.FichierSimple;
import org.example.visiteurs.v1.structure.Lien;
import org.example.visiteurs.v1.structure.Repertoire;

public class VisiteurAffiche implements VisiteurFichiers<Void> {

    @Override
    public void visit(FichierSimple f) {
        System.out.println(f);
    }

    @Override
    public void visit(Lien l) {
        System.out.println(l);
    }

    @Override
    public void visit(Repertoire r) {
        System.out.println(r);
    }

    @Override
    public Void resultat() {
        return null;
    }
}
