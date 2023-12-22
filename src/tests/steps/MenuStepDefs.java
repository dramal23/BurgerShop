package steps;
import com.burgershop.Burger;
import com.burgershop.Menu;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.jupiter.api.Assertions.assertEquals;


import java.util.List;

public class MenuStepDefs {

    private Burger burger;
    private Menu menu;

    @Given("un burger avec {int} cornichons et la sauce {string} pour un test de menu")
    public void unBurgerAvecCornichonsEtLaSaucePourUnTestDeMenu(int nombreCornichons, String nouvelleSauce) {
        burger = new Burger();
        burger.creerChefDoeuvre(nombreCornichons, nouvelleSauce);
    }

    @Given("un menu existant")
    public void unMenuExistant() {
        menu = new Menu();
    }

    @When("j'ajoute le burger au menu")
    public void jAjouteLeBurgerAuMenu() {
        menu.setBurgerInMenu(burger);
    }

    @Then("le menu doit contenir le burger avec {int} cornichons et la sauce {string}")
    public void leMenuDoitContenirLeBurgerAvecCornichonsEtLaSauce(int expectedCornichons, String expectedSauce) {
        List<Burger> burgers = menu.getBurgers();
        Burger addedBurger = burgers.get(0);
        // on imagine que le burger a été ajouté à la 1ere position
        assertEquals(expectedCornichons, addedBurger.getCornichons());
        assertEquals(expectedSauce, addedBurger.getNomSauce());
    }
}
