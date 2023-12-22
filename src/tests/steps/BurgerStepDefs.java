package steps;
import com.burgershop.Burger;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class BurgerStepDefs {

    private Burger burger;


    @Given("un burger avec {int} cornichons et la sauce {string} pour un test de burger")
    public void unBurgerAvecCornichonsEtLaSaucePourUnTestDeBurger(int nombreCornichons, String sauce) {
        burger = new Burger();
        burger.creerChefDoeuvre(nombreCornichons, sauce);
    }

    @When("je rajoute {int} cornichon")
    public void jeRajouteCornichon(int nombreCornichons) {
        int nouveauxCornichons = burger.getCornichons() + nombreCornichons;
        burger.setCornichons(nouveauxCornichons);
    }

    @When("je change la sauce en {string}")
    public void jeChangeLaSauceEn(String nouvelleSauce) {
        burger.setNomSauce(nouvelleSauce);
    }

    @When("je réinitialise le burger")
    public void jeReinitialiseLeBurger() {
        burger.setCornichons(0);
        burger.setNomSauce("");
    }

    @Then("le burger doit contenir {int} cornichons et la sauce {string}")
    public void leBurgerDoitContenirCornichonsEtLaSauce(int expectedCornichons, String expectedSauce) {
        assertEquals(expectedCornichons, burger.getCornichons());
        assertEquals(expectedSauce, burger.getNomSauce());
    }

    @Then("le burger doit être sans garniture")
    public void leBurgerDoitEtreSansGarniture() {
        assertEquals(0, burger.getCornichons());
        assertEquals("", burger.getNomSauce());
    }
}
