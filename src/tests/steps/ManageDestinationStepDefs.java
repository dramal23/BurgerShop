import com.burgershop.Client;
import com.burgershop.Destination;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ManageDestinationStepDefs {
    private Destination destination;
    private Client client;

    @Given("Une destination avec le nom {string} et le pays {string}")
    public void uneDestinationAvecNomEtPays(String nom, String pays) {
        destination = new Destination(nom, pays);
    }

    @Given("Un client avec le nom {string}")
    public void unClientAvecNom(String nom) {
        client = new Client(nom);
    }

    @When("J'ajoute le client à la destination")
    public void jAjouteLeClientALaDestination() {
        destination.addClient(client);
        client.setDestination(destination);
    }

    @Then("Le client devrait être associé à la destination")
    public void leClientDevraitEtreAssocieALaDestination() {
        assertTrue(destination.getClients().contains(client));
        assertEquals(client.getDestination(),destination);
    }


}
