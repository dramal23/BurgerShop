package com.burgershop;

import java.util.ArrayList;
import java.util.List;

public class MenuManager {
    private static MenuManager instance;
    private List<Menu> menus;

    private MenuManager() {
        //privé pour empêcher l'instanciation directe
        this.menus = new ArrayList<>();
    }

    public static MenuManager getInstance() {
        if (instance == null) {
            instance = new MenuManager();
        }
        return instance;
    }

    public Menu createNewMenu() {
        Menu newMenu = new Menu();
        menus.add(newMenu);
        return newMenu;
    }

    public List<Menu> getMenus() {
        return menus;
    }
}
