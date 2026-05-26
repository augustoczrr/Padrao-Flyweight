package org.example;


package flyweight;

import java.util.HashMap;
import java.util.Map;

public class FabricaMassa {

    private static Map<String, MassaFlyweight> massas = new HashMap<>();

    public static MassaFlyweight getMassa(String tipo) {

        MassaFlyweight massa = massas.get(tipo);

        if (massa == null) {
            massa = new Massa(tipo);
            massas.put(tipo, massa);
        }

        return massa;
    }

    public static int getTotalMassas() {
        return massas.size();
    }
}