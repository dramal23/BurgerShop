package com.burgershop;

import java.util.ArrayList;
import java.util.List;

public class DestinationObserver {
    private final List<Client> clients;
    private static DestinationObserver instance;

    public DestinationObserver() {
        this.clients = new ArrayList<>();
    }

    public static DestinationObserver getInstance() {
        if (instance == null) {
            instance = new DestinationObserver();
        }
        return instance;
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
