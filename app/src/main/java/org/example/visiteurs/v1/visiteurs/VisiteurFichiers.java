package org.example.visiteurs.v1.visiteurs;

import org.example.visiteurs.v1.structure.FichierSimple;
import org.example.visiteurs.v1.structure.Lien;
import org.example.visiteurs.v1.structure.Repertoire;

public interface VisiteurFichiers<T> {
    void visit(FichierSimple f);
    void visit(Lien l);
    void visit(Repertoire r);
    T resultat();
}
