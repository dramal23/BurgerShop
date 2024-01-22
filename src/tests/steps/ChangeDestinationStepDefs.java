
import com.burgershop.Destination;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static org.junit.Assert.assertEquals;

public class ChangeDestinationStepDefs {
    private Destination destination;

    @Given("Une destination 3 avec le nom {string} et le pays {string}")
    public void uneDestinationAvecNomEtPays(String nom, String pays) {
        destination = new Destination(nom, pays);
    }

    @When("Je change le nom de la destination en {string}")
    public void jeChangeLeNomDeLaDestinationEn(String nouveauNom) {
        destination.setNom(nouveauNom);
    }

    @Then("Le nouveau nom de la destination devrait être {string}")
    public void leNouveauNomDeLaDestinationDevraitEtre(String expectedNom) {
        assertEquals(expectedNom, destination.getNom());
    }

}
