import static org.junit.Assert.*;

import com.burgershop.Menu;
import com.burgershop.MenuManager;
import org.junit.Test;

import java.util.List;

public class MenuManagerTest {

    @Test
    public void testSingletonInstance() {
        // Crée une instance du MenuManager
        MenuManager menuManager1 = MenuManager.getInstance();

        // Obtient une autre instance du MenuManager
        MenuManager menuManager2 = MenuManager.getInstance();

        // Vérifie que les deux instances sont les mêmes
        assertSame(menuManager1, menuManager2);
    }

    @Test
    public void testCreateNewMenu() {
        // Crée une instance du MenuManager
        MenuManager menuManager = MenuManager.getInstance();

        // Crée un nouveau menu
        Menu menu = menuManager.createNewMenu();

        // Obtient la liste des menus du MenuManager
        List<Menu> menus = menuManager.getMenus();

        // Vérifie que le nouveau menu est présent dans la liste des menus
        assertTrue(menus.contains(menu));
    }
}
