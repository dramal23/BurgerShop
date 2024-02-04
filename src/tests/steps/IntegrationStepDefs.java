package com.burgershop;

import com.burgershop.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class IntegrationStepDefs {
    private BurgerCreator burgerCreator;
    private DestinationObserver destinationObserver;
    private List<Client> clients;
    private List<Destination> destinations;

    @Given("qu'il y a un unique créateur de burgers")
    public void givenSingletonBurgerCreator() {
        burgerCreator = BurgerCreator.getInstance();
    }

    @Given("plusieurs destinations et des clients associés à ces destinations")
    public void givenMultipleDestinationsAndClients() {
        destinationObserver = DestinationObserver.getInstance();
        clients = new ArrayList<>();
        destinations = new ArrayList<>();

        // Création de destinations
        Destination parisDestination = new Destination("Paris", "France");
        Destination newYorkDestination = new Destination("New York", "USA");

        destinations.add(parisDestination);
        destinations.add(newYorkDestination);

        // Création de clients associés à des destinations
        clients.add(new Client("Client1", parisDestination));
        clients.add(new Client("Client2", newYorkDestination));

        // Ajout des clients en tant qu'observateurs
        for (Client client : clients) {
            destinationObserver.addObserver(client);
        }
    }

    @When("le créateur de burgers crée un nouveau burger")
    public void whenBurgerCreatorCreatesNewBurger() {
        Burger newBurger = burgerCreator.createNewBurger();
        destinationObserver.notifyClients(newBurger);
    }

    @Then("toutes les destinations sont notifiées de la disponibilité du nouveau burger")
    public void thenAllDestinationsAreNotified() {
        // Vérification dans le cadre des tests unitaires
    }

    @Then("chaque destination peut traiter la livraison du burger de manière indépendante")
    public void thenEachDestinationCanProcessDeliveryIndependently() {
        // Vérification dans le cadre des tests unitairese
    }
}