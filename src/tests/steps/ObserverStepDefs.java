package com.burgershop.stepdefs;

import com.burgershop.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class ObserverStepDefs {
    private List<Client> clients;
    private Burger burger;

    @Given("qu'il y a plusieurs clients associés à des destinations et agissant en tant qu'observateurs de livraison")
    public void givenMultipleClientsAsObservers() {
        // initialiser les clients et les associer à des destinations
        clients = new ArrayList<>();
        clients.add(new Client("Client1"));
        clients.add(new Client("Client2"));
        clients.add(new Client("Client3"));
    }

    @When("le chef cuisinier finalise un nouveau burger")
    public void whenChefFinalizesNewBurger() {
        // Créer un nouveau burger et finaliser
        burger = new Burger();
        DestinationObserver destinationObserver = new DestinationObserver();

        // add clients as observers
        for (Client client : clients) {
            destinationObserver.addObserver(client);
        }

        destinationObserver.notifyClients(burger);
    }

    @Then("tous les clients sont notifiés de la disponibilité du nouveau burger")
    public void thenAllClientsAreNotified() {
        // vide pour l'instant idk
    }
}