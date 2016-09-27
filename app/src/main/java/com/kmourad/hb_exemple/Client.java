package com.kmourad.hb_exemple;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Created by Human Booster on 26/09/2016.
 */

public class Client {
    private int idx;
    private String nom;
    private String prenom;
    private Map<String, Compte> comptes = new HashMap<>();

    public String getNom(){
        return this.nom;
    }

    public String getPrenom(){
        return this.prenom;
    }
    public String getNomComplet(){
        return nom+prenom;
    }

    public Map<String, Compte> getComptes(){
        return this.comptes;
    }

    public Client(String nom, String prenom){
        this.nom = nom;
        this.prenom = prenom;
        idx = 1;
        comptes.put(this.toString()+idx, new Compte(this));
    }

    public String toString(){
        return this.getNomComplet();
    }
}
