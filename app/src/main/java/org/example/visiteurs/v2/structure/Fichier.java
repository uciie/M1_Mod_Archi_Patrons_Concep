package org.example.visiteurs.v2.structure;

import org.example.visiteurs.v2.visiteurs.VisiteurFichiers;

public interface Fichier {
    String proprietaire();
    String nom();
    void accept(VisiteurFichiers v);
}
