package org.example;

package flyweight;

public class Massa implements MassaFlyweight {

    private String tipo;

    public Massa(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String getTipo() {
        return tipo;
    }
}