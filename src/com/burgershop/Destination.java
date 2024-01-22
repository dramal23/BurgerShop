package com.burgershop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Destination {
    private String nom;
    private String pays;
    private List<Client> clients;

    public Destination(String nom, String pays) {
        this.nom = nom;
        this.pays = pays;
        this.clients = new ArrayList<>();
    }

    // Méthodes pour gérer la relation bidirectionnelle

    public void addClient(Client client) {
        clients.add(client);
    }

    public void removeClient(Client client) {
        clients.remove(client);
    }

    public List<Client> getClients() {
        return Collections.unmodifiableList(clients);
    }

    // Autres méthodes de la classe

    public String getNom() {
        return nom;
    }

    public String getPays() {
        return pays;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public Destination() {
        this.clients = new ArrayList<>();
    }

    public String returnDestination() {
        return this.nom + this.pays;
    }
}