package com.kmourad.hb_exemple;

/**
 * Created by Human Booster on 26/09/2016.
 */

public class Compte {
    private int num;
    private double solde;
    private Client client;

    public String getNum(){
        return this.num+"";
    }

    public double getSolde(){
        return this.solde;
    }

    public Client getClient(){
        return this.client;
    }

    public  Compte(Client client){
        this.client = client;
    }

    public Compte(Client client, double depot){
        this.client = client;
        this.solde = depot;
    }

    public void credite(double montant){
        this.solde = this.solde + montant;
    }

    public void debite(double montant){
        this.solde = this.solde - montant;
    }
}
