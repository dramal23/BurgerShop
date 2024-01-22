import com.burgershop.Client;
import com.burgershop.Destination;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


class DestinationTest {

    private Destination destination;
    private Client client1;
    private Client client2;

    @BeforeEach
    void setUp() {
        destination = new Destination("Paris", "France");
        client1 = new Client("Alice");
        client2 = new Client("Bob");
    }

    @Test
    void returnDestination() {
        assertEquals("ParisFrance", destination.returnDestination());
    }

    @Test
    void addClient() {
        destination.addClient(client1);
        assertTrue(destination.getClients().contains(client1));
    }

    @Test
    void removeClient() {
        destination.addClient(client1);
        destination.addClient(client2);

        destination.removeClient(client1);
        assertTrue(!destination.getClients().contains(client1));
        assertTrue(destination.getClients().contains(client2));
    }
}
