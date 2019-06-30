package Capitulo3;

import java.util.Scanner;

/**
 * Fibonacci
 */
public class Fibonacci {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        long n1, n2, suma;
        System.out.print("Introduce iteraciones de la sucesion: ");
        int iterador = consola.nextInt();

        n1 = 0;
        n2 = 1;
        for (int i = 0; i < iterador; i++) {
            suma = n1 + n2;
            System.out.println(n1 + " + " + n2 + " = " + suma);
            n1 = n2;
            n2 = suma;
        }
        consola.close();
    }
}