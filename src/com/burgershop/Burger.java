package com.burgershop;

public class Burger {
    // attributs
    private Menu menu;
    private int cornichons;
    private String nomSauce;

    // accesseurs
    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public Menu getMenu() {
        return menu;
    }

    public int getCornichons() {
        return this.cornichons;
    }

    public void setCornichons(int cornichons) {
        this.cornichons = cornichons;
    }

    public void setNomSauce(String nomSauce) {
        this.nomSauce = nomSauce;
    }


    public String getNomSauce() {
        return this.nomSauce;
    }

    // méthode qui les manipule
    public void creerChefDoeuvre(int nombreCornichons, String nouvelleSauce) {
        this.cornichons = nombreCornichons;
        ajouterSauceBurger(nouvelleSauce);
    }

    private void ajouterSauceBurger(String nouvelleSauce) {
        this.nomSauce = nouvelleSauce;
    }

    public String getDescription() {
        return "Burger avec " + cornichons + " cornichons et sauce " + nomSauce;
    }
}