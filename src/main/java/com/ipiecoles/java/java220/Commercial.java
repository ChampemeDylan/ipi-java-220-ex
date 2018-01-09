package com.ipiecoles.java.java220;

import org.joda.time.LocalDate;

import java.util.Objects;

//Exercice 3.1 add " extends Employe "
public class Commercial extends Employe {

    public static final double PRIME_DEFAUT = 500d;
    public static final double COEFF_PRIME = 0.05;

    // Exercice 3.2
    private Double caAnnuel;
    public Double getCaAnnuel() {
        return caAnnuel;
    }

    public void setCaAnnuel(Double caAnnuel) {
        this.caAnnuel = caAnnuel;
    }

    // Exercice 3.3
    @Override
    public Double getPrimeAnnuelle() {
        if(caAnnuel == null) {
            return PRIME_DEFAUT;
        }
        return Math.max(Math.ceil(caAnnuel * COEFF_PRIME), PRIME_DEFAUT);
    }

    // Exercice 3.4
    public Commercial() {
    }

    public Commercial(String nom, String prenom, String matricule, LocalDate dateEmbauche, Double salaire, Double caAnnuel) {
        super(nom, prenom, matricule, dateEmbauche, salaire);
        this.caAnnuel = caAnnuel;
    }

    // Exercice 3.5
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Commercial)) return false;
        if (!super.equals(o)) return false;
        Commercial that = (Commercial) o;
        return o.hashCode() == this.hashCode();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), caAnnuel, performance);
    }

    // Exercice 3.6
    public Integer performance;

    public Boolean performanceEgale(Integer performance){
        return Objects.equals(this.performance, performance);
    }

    // Exercice 3.7
    public Note equivalenceNote(){
        switch (this.performance){
            case 0:
            case 50:
                return Note.INSUFFISNAT;
            case 100:
                return Note.PASSABLE;
            case 150:
                return Note.BIEN;
            case 200:
                return Note.TRES_BIEN;
            default:
                return null;
        }
    }
}

