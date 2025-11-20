package org.example.visiteurs.v1.structure;

import org.example.visiteurs.v1.visiteurs.VisiteurFichiers;

public interface Fichier {
    String proprietaire();
    String nom();
    void accept(VisiteurFichiers v);
}
