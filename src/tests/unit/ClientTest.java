import com.burgershop.Client;
import com.burgershop.Destination;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {

    private Client client;
    private Destination destination;

    @BeforeEach
    void setUp() {
        client = new Client("John");
        destination = new Destination("New York", "USA");
    }

    @Test
    void clientHasDestination() {
        Client client = new Client("Alice");
        Destination destination = new Destination("Paris", "France");

        assertFalse(client.hasDestination());

        client.setDestination(destination);

        assertTrue(client.hasDestination());
    }

    @Test
    void getDestinationWhenNotSet() {
        assertNull(client.getDestination());
    }

    @Test
    void setDestination() {
        client.setDestination(destination);
        assertEquals(destination, client.getDestination());
    }

    @Test
    void obtenirInformationsClientEtDestination() {
        client.setDestination(destination);
        assertEquals("Client : John, New YorkUSA", client.informationsClient());
    }
}