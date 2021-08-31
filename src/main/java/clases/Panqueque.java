package clases;

import clases.interfaces.Comida;

public class Panqueque implements Comida {
    @Override
    public String getType() {
        return "se le ha preparado: Panqueque ¡Alguien ordenó postre!";
    }
}
