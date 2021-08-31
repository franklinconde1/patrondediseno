import clases.factory.Factory;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Que desea ordenar");
        String comida = sc.nextLine();
        Factory factory = new Factory();
        System.out.println(factory.getComida(comida).getType());
    }
}
