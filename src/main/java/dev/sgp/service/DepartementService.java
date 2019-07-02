package dev.sgp.service;

import dev.sgp.entite.Departement;

import java.util.ArrayList;
import java.util.List;

public class DepartementService {
    List<Departement> listeDepartements = new ArrayList<>();

    public DepartementService() {
        List<Departement> listeDepartements = new ArrayList<>();
        listeDepartements.add(new Departement(1,"Comptabilité"));
        listeDepartements.add(new Departement(2,"Ressources Humaines"));
        listeDepartements.add(new Departement(3,"Informatique"));
        listeDepartements.add(new Departement(4,"Administratif"));
        this.listeDepartements = listeDepartements;
    }

    public List<Departement> listerDepartements(){ return this.listeDepartements ;}

}
