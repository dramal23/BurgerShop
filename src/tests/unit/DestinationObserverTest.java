package com.burgershop;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DestinationObserverTest {

    @Test
    public void testNotification() {
        // arrange
        DestinationObserver destinationObserver = new DestinationObserver();
        Client client1 = new Client("Client1");
        Client client2 = new Client("Client2");
        Client client3 = new Client("Client3");
        Burger newBurger = new Burger();
        newBurger.creerChefDoeuvre(3, "Ketchup");

        // act

        destinationObserver.addObserver(client1);
        destinationObserver.addObserver(client2);
        destinationObserver.addObserver(client3);

        List<String> notifications = destinationObserver.notifyClients(newBurger);
        String expectedNotif = "Le client vient d'être notifié de l'arrivée de Burger avec 3 cornichons et sauce Ketchup";

        // assert
        // le burger est le même du coup pas besoin d'itérer, on prend le 1er element
        assertEquals(expectedNotif, notifications.get(0));
        }
}
