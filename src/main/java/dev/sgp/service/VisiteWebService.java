package dev.sgp.service;

import dev.sgp.entite.VisiteWeb;

import java.util.ArrayList;
import java.util.List;

public class VisiteWebService {
    List<VisiteWeb> visiteWebList = new ArrayList<>();

    public List<VisiteWeb> listerVisiteWeb(){ return this.visiteWebList ;}

    public void sauvegarderVisiteWeb(VisiteWeb visiteWeb) {
        visiteWebList.add(visiteWeb);
    }
}
