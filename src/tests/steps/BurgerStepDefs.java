import com.burgershop.Burger;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BurgerStepDefs {
    private Burger burger;

    @Given("un burger sans garniture")
    public void unBurgerSansGarniture() {
        burger = new Burger();
    }

    @When("j'ajoute {int} cornichons et la sauce {string} au burger")
    public void jAjouteCornichonsEtSauceAuBurger(int nombreCornichons, String nouvelleSauce) {
        burger.creerChefDoeuvre(nombreCornichons, nouvelleSauce);
    }

    @Then("le burger doit contenir {int} cornichons et la sauce {string}")
    public void leBurgerDoitContenirCornichonsEtSauce(int expectedCornichons, String expectedSauce) {
        assertEquals(expectedCornichons, burger.getCornichons());
        assertEquals(expectedSauce, burger.getNomSauce());
    }

    @Then("la description du burger doit être {string}")
    public void laDescriptionDuBurgerDoitEtre(String expectedDescription) {
        String actualDescription = burger.getDescription();
        assertEquals(expectedDescription, actualDescription);
    }
}
