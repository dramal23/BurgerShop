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

    public List<String> notifyClients(Burger burger) {
        List<String> notifications = new ArrayList<>();
        for (Client client : clients) {
            String notification = "Le client vient d'être notifié de l'arrivée de " + burger.getDescription();
            notifications.add(notification);
        }
        return notifications;
    }
}
