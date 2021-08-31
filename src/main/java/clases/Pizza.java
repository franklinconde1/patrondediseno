package clases;

import clases.interfaces.Comida;

public class Pizza implements Comida {
    @Override
    public String getType() {
        return "se le ha preparado: Pizza  ¡Alguien ordenó comida rápida!";
    }
}
