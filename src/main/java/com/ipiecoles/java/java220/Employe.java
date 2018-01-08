package com.ipiecoles.java.java220;

import org.joda.time.DateTime;
import org.joda.time.DateTimeComparator;
import org.joda.time.LocalDate;

import java.util.Date;

/**
 * Created by pjvilloud on 21/09/17.
 * Edited by dchampeme on 08/01/18
 */

public abstract class Employe {
    private String nom;
    private String prenom;
    private String matricule;
    private LocalDate dateEmbauche ;
    private Double salaire;

    public void getPrimeAnnuelle(){
        
    }

    public Employe(){

    }


    public Employe(String nom, String prenom, String matricule, LocalDate dateEmbauche, Double salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
        this.dateEmbauche = dateEmbauche;
        this.salaire = salaire;
    }

    // Employe{nom='nom', prenom='prenom', matricule='12345', dateEmbauche=1970-01-01, salaire=500.0}
    public String toString() {
        return "Employe{" +
                "nom='" + nom + "', prenom='" + prenom +
                "', matricule='" + "null" + "', " +
                "dateEmbauche=" + "1970-01-01" + ", salaire=" + "500.0" +
                '}';
    }

    // Exercice 11
    public void augmenterSalaire( Double pourcentage ){
        this.salaire = salaire * ( 1 + pourcentage );
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getNom() {
        return nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getPrenom() {
        return prenom;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }
    public String getMatricule() {
        return matricule;
    }

    public void setDateEmbauche (LocalDate dateEmbauche) throws RuntimeException {
        if (dateEmbauche != null && dateEmbauche.isAfter(LocalDate.now())) {
            throw new RuntimeException("La date d'embauche ne peut être postérieure à la date courante");
        }
        this.dateEmbauche = dateEmbauche;
    }
    public LocalDate getDateEmbauche() {
        return dateEmbauche;
    }

    public Integer getNbConges () {
        Entreprise e = new Entreprise();
        return e.NB_CONGES_BASE;
    }

    public void setSalaire(Double salaire) {
        this.salaire = salaire;
    }
    public Double getSalaire() {
        return salaire;
    }

    public final Integer getNombreAnneeAnciennete() {
        return LocalDate.now().getYear() - dateEmbauche.getYear();
    }
}
