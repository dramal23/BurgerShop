package com.burgershop;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    // Attribut burgers comme liste de Burgers
    private List<Burger> burgers;

    // Constructeur de Menu
    public Menu() {
        this.burgers = new ArrayList<>();
    }

    // Méthode pour ajouter un Burger au menu
    public void setBurgerInMenu(Burger burger) {
        burgers.add(burger);
        burger.setMenu(this); // Le Burger connaît également le Menu associé
    }

    // Ajoutez une méthode pour obtenir la liste de Burgers
    public List<Burger> getBurgers() {
        return burgers;
    }
}
