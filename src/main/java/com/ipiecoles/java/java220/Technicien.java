package com.ipiecoles.java.java220;

import org.joda.time.LocalDate;

// Exercice 4.1
public class Technicien extends Employe {

    @Override
    public Double getPrimeAnnuelle() {
        return null;
    }

    public Technicien(){

    }

    // Exercice 4.2
    private Integer grade;

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) throws TechnicienException {
        if (grade < 1 || grade > 5){
            throw new TechnicienException("Le grade doit être compris entre 1 et 5 : " + grade + ", technicien : " + this.toString());
        }
        this.grade = grade;
    }

    // Exercice 4.3
    public Technicien(String nom, String prenom, String matricule, LocalDate dateEmbauche, Double salaire, Integer grade) {
        super(nom, prenom, matricule, dateEmbauche, salaire);
        this.grade = grade;
    }

    // Exercice 4.4
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Technicien{");
        sb.append("grade=").append(grade);
        sb.append("} ");
        sb.append(super.toString()); //info de l'employé
        return sb.toString();
    }

    // Exercice 4.5
    public void setSalaire(Double salaire) {
        super.setSalaire(salaire * (1 + grade / 10.0));
    }

    // Exercice 4.6
}