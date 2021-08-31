package clases;

import clases.interfaces.Comida;

public class NoExisteComida implements Comida {

    @Override
    public String getType() {
        return "No existe la comida ingresada";
    }
}
