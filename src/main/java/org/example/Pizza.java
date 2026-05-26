package org.example;

package flyweight;

public class Pizza {

    private String sabor;
    private MassaFlyweight massa;

    public Pizza(String sabor, String tipoMassa) {
        this.sabor = sabor;
        this.massa = FabricaMassa.getMassa(tipoMassa);
    }

    public String getSabor() {
        return sabor;
    }

    public MassaFlyweight getMassa() {
        return massa;
    }
}