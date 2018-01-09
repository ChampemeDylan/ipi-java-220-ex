package com.ipiecoles.java.java220;

import org.joda.time.LocalDate;

import java.util.Objects;

/**
 * Created by pjvilloud on 21/09/17.
 * Edited by dchampeme on 08/01/18
 */

public abstract class Employe {


    //public void getPrimeAnnuelle(){
        
    //}

    public abstract Double getPrimeAnnuelle();

    private String nom;
    private String prenom;
    private String matricule;
    private LocalDate dateEmbauche ;
    private Double salaire;

    public Employe(){

    }


    public Employe(String nom, String prenom, String matricule, LocalDate dateEmbauche, Double salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
        this.dateEmbauche = dateEmbauche;
        this.salaire = salaire;
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

    @Override
    public String toString () {
        return "Employe{nom='"+nom+"', prenom='"+prenom+"', matricule='"+matricule+"', dateEmbauche="+dateEmbauche+", salaire="+salaire+"}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employe employe = (Employe) o;
        return Objects.equals(nom, employe.nom) &&
                Objects.equals(prenom, employe.prenom) &&
                Objects.equals(matricule, employe.matricule) &&
                Objects.equals(dateEmbauche, employe.dateEmbauche) &&
                Objects.equals(salaire, employe.salaire);
    }

    @Override
    public int hashCode() {

        return Objects.hash(nom, prenom, matricule, dateEmbauche, salaire);
    }
}
