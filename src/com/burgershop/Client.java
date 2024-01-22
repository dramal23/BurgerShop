package com.burgershop;

public class Client {
    private String nom;
    private Destination destination;

    public Client(String nom) {
        this.nom = nom;
        this.destination = null;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        destinationType(destination);
    }

    public boolean hasDestination() {
        return destination != null;
    }

    private void destinationType(Destination destination) {
        if (this.destination != null) {
            this.destination.removeClient(this);
        }
        this.destination = destination;
        if (destination != null) {
            destination.addClient(this);
        }
    }

    public String informationsClient() {
        if (destination != null) {
            return "Client : " + nom + ", " + destination.returnDestination();
        } else {
            return "Client : " + nom + ", Destination inconnue";
        }
    }
}
