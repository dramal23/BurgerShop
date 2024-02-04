package com.burgershop;

public class BurgerCreator {
    private static BurgerCreator instance;

    private BurgerCreator() {
        // Constructeur privé pour empêcher l'instanciation directe
    }

    public static BurgerCreator getInstance() {
        if (instance == null) {
            instance = new BurgerCreator();
        }
        return instance;
    }

    public Burger createNewBurger() {
        // Logique de création d'un nouveau burger
        return new Burger();
    }
}