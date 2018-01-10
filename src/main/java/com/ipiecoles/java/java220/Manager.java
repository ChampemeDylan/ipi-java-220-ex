package com.ipiecoles.java.java220;

import java.util.HashSet;

public class Manager extends Employe {

    private HashSet<Technicien> equipe = new HashSet();

    // Exercice 5.1
    @Override
    public Double getPrimeAnnuelle() {
        return null;
    }

    // Exercice 5.2
    public HashSet<Technicien> getEquipe() {
        return equipe;
    }

    public void setEquipe(HashSet<Technicien> equipe ) {
        this.equipe = equipe;
    }

    // Exercice 5.3
    public ajoutTechnicienEquipe(Technicien){

    }


}
