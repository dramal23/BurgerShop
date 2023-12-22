package tests;

import com.burgershop.Burger;
import com.burgershop.Menu;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BurgerTest {

    private Menu menuBigMac;
    private Burger bigMac;

    public BurgerTest() {
    }

    @BeforeEach
    public void setUp() {
        // Arrange
        menuBigMac = new Menu();
        bigMac = new Burger();

        // Act
        bigMac.creerChefDoeuvre(3, "secrete");
        menuBigMac.setBurgerInMenu(bigMac);
    }

    @Test
    public void testPreparerBurger() {
        // Assert
        assertEquals(3, bigMac.getCornichons());
        assertEquals("secrete", bigMac.getNomSauce());
    }

    @Test
    public void testAssociation() {
        // Assert
        assertTrue(menuBigMac.getBurgers().contains(bigMac));
        assertEquals(menuBigMac, bigMac.getMenu());
    }
}