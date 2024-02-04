package com.burgershop;

import java.util.ArrayList;
import java.util.List;

public class DestinationObserver {
    private final List<Client> clients;

    public DestinationObserver() {
        this.clients = new ArrayList<>();
    }

    public void addObserver(Client client) {
        clients.add(client);
    }

    public void removeObserver(Client client) {
        clients.remove(client);
    }

    public void notifyClients(Burger burger) {
        for (Client client : clients) {
            // pas une bonne pratique de system out, mais pas envie de modifier les classes fétiches
            System.out.println("Le client vient d'être notifié de l'arrivée de " + burger.getDescription());
        }
    }
}
