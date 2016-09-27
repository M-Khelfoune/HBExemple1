package com.kmourad.hb_exemple;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Human Booster on 26/09/2016.
 */

public class Banque {
    // attributes
    private Map<String, Client> clients = new HashMap<>();
    private Map<String, Compte> comptes = new HashMap<>();

    // Operations
    public Banque(){
        // attribut deja initialisé / clients et comptes
    }

    public Map<String, Client> getClients(){
        return clients;
    }

    public Map<String, Compte> getComptes(){
        return comptes;
    }

    public Client getClients(String nom, String prenom){
        return clients.get(nom+prenom);
    }

    public Compte getCompte(String num){
        return comptes.get(num);
    }

    public Client ajouteClient(Client client){
        clients.put(client.getNomComplet(), client);
        return client;
    }

    public Client ajouteClient(String nom, String prenom){
        Client client = new Client(nom, prenom);
        ajouteClient(client);
        return client;
    }

    public boolean supprimeClient(Client client){
        if (clients.containsKey(client.getNomComplet())){
            clients.remove(client.getNomComplet());
            return true;
        } return false;
    }

    public boolean supprimeClient(String nom, String prenom){
        Client client;
        if (clients.containsKey(nom+prenom)){
            client = clients.get(nom+prenom);
            supprimeClient(client);
        } return false;
    }

    public Compte ouvreCompte(Client client){
        Compte compte = new Compte(client);
        return compte;
    }

    public Compte ouvreCompte(Client client, double depot){
        Compte compte = new Compte(client);

        // a terminer

        return null;
    }







}
