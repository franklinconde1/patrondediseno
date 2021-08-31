package clases.factory;

import clases.NoExisteComida;
import clases.Panqueque;
import clases.Pizza;
import clases.interfaces.Comida;

public class Factory {
    public Comida getComida(String comida) {
        if (comida.equalsIgnoreCase("pizza")) {
            return new Pizza();
        }else if (comida.equalsIgnoreCase("panqueque")) {
            return new Panqueque();
        }
        return new NoExisteComida();
    }
}
