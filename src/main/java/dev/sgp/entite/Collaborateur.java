package dev.sgp.entite;

import java.time.LocalDate;
import java.time.ZonedDateTime;

public class Collaborateur {
    public static int nbCollab = 0;
    private String matricule;
    private String nom;
    private String prenom;
    private LocalDate dateNaissance;
    private String adresse;
    private String numSecuSociale;
    private String emailPro;
    private String photo;
    private ZonedDateTime dateHeureCreation;
    private boolean actif;

    //Constructeurs
    public Collaborateur() {
    }

    public Collaborateur(String matricule, String nom, String prenom, LocalDate dateNaissance,
                         String adresse, String numSecuSociale, String emailPro, String photo,
                         ZonedDateTime dateHeureCreation, boolean actif) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.adresse = adresse;
        this.numSecuSociale = numSecuSociale;
        this.emailPro = emailPro;
        this.photo = photo;
        this.dateHeureCreation = dateHeureCreation;
        this.actif = actif;
        nbCollab++;
    }
    //Getter & Setter

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getNumSecuSociale() {
        return numSecuSociale;
    }

    public void setNumSecuSociale(String numSecuSociale) {
        this.numSecuSociale = numSecuSociale;
    }

    public String getEmailPro() {
        return emailPro;
    }

    public void setEmailPro(String emailPro) {
        this.emailPro = emailPro;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public ZonedDateTime getDateHeureCreation() {
        return dateHeureCreation;
    }

    public void setDateHeureCreation(ZonedDateTime dateHeureCreation) {
        this.dateHeureCreation = dateHeureCreation;
    }

    public boolean isActif() {
        return actif;
    }

    public void setActif(boolean actif) {
        this.actif = actif;
    }
}
