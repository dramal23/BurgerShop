import static org.junit.Assert.*;

import com.burgershop.Burger;
import com.burgershop.BurgerCreator;
import org.junit.Test;

public class BurgerCreatorTest {

    @Test
    public void testSingletonInstance() {
        // Obtention de deux instances du BurgerCreator
        BurgerCreator instance1 = BurgerCreator.getInstance();
        BurgerCreator instance2 = BurgerCreator.getInstance();

        // Vérification que les deux instances sont les mêmes
        assertSame(instance1, instance2);
    }

    @Test
    public void testCreateNewBurger() {
        // Création d'une instance du BurgerCreator
        BurgerCreator burgerCreator = BurgerCreator.getInstance();

        // Création d'un nouveau burger
        Burger burger = burgerCreator.createNewBurger();

        // Vérification que le burger a été créé avec succès
        assertNotNull(burger);
    }
}