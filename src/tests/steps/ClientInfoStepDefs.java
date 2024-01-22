import com.burgershop.Client;
import com.burgershop.Destination;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static org.junit.Assert.assertEquals;

public class ClientInfoStepDefs {
    private Client client;
    private Destination destination;

    @Given("Un client 2 avec le nom {string}")
    public void unClient2AvecNom(String nom) {
        client = new Client(nom);
    }

    @Given("Une destination 2 avec le nom {string} et le pays {string}")
    public void uneDestination2AvecNomEtPays(String nom, String pays) {
        destination = new Destination(nom, pays);
        client.setDestination(destination);
        destination.addClient(client);
    }

    @When("Je consulte les informations du client")
    public void jeConsulteLesInformationsDuClient() {
        System.out.println(client.informationsClient());
    }

    @Then("Les informations devraient indiquer {string}")
    public void lesInformationsDevraientIndiquer(String expectedOutput) {
        assertEquals(expectedOutput, client.informationsClient());
    }
}
