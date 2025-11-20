package org.example.visiteurs.v2.visiteurs;

import org.example.visiteurs.v2.structure.FichierSimple;
import org.example.visiteurs.v2.structure.Lien;
import org.example.visiteurs.v2.structure.Repertoire;

public interface VisiteurFichiers<T> {
    void visit(FichierSimple f);
    void visit(Lien l);
    void visit(Repertoire r);
    T resultat();
}
