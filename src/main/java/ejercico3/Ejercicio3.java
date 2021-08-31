package ejercico3;

import java.util.Scanner;

public class Ejercicio3 {
    public boolean encontrarNumero(int []numbers, int numbersToComparate){
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length-1; j++) {
                if (numbers[i]+numbers[j] == numbersToComparate){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero que desee comparar");
        int numbersToComparate = sc.nextInt();
        Ejercicio3 encNum = new Ejercicio3();
        int [] numbers = {2,4,6,8};
        boolean resultado = encNum.encontrarNumero(numbers, numbersToComparate);
        System.out.println(resultado);
    }
}
