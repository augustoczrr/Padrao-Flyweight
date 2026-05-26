package flyweight;

public class PizzaTest {
}

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PizzaTest {

    @Test
    void deveCompartilharMassas() {

        Pizza pizza1 = new Pizza("Calabresa", "Tradicional");
        Pizza pizza2 = new Pizza("Frango", "Tradicional");

        assertEquals(1, FabricaMassa.getTotalMassas());
    }

    @Test
    void deveCriarMassasDiferentes() {

        Pizza pizza1 = new Pizza("Calabresa", "Tradicional");
        Pizza pizza2 = new Pizza("Frango", "Fina");

        assertEquals(2, FabricaMassa.getTotalMassas());
    }
}