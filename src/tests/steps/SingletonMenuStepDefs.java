package com.burgershop.stepdefs;

import com.burgershop.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static org.junit.Assert.*;

public class SingletonMenuStepDefs {
    private MenuManager menuManager;
    private Menu createdMenu;

    @Given("qu'il y a un unique gestionnaire de menus")
    public void givenSingletonMenuManager() {
        menuManager = MenuManager.getInstance();
    }

    @When("le gestionnaire de menus crée un nouveau menu")
    public void whenMenuManagerCreatesNewMenu() {
        createdMenu = menuManager.createNewMenu();
    }

    @Then("tous les utilisateurs ont accès au même menu")
    public void thenAllUsersHaveAccessToSameMenu() {
        MenuManager anotherMenuManager = MenuManager.getInstance();
        assertSame(menuManager, anotherMenuManager);

        // Vérifiez que le menu créé est accessible depuis n'importe quelle instance de MenuManager
        assertTrue(anotherMenuManager.getMenus().contains(createdMenu));
    }
}
