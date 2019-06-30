package Capitulo3;

import java.util.Scanner;

/**
 * Factorial
 */
public class Factorial {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        long n;
        long suma = 0;
        long factor = 0;

        System.out.print("Número a factorizar: ");
        n = consola.nextInt();
        long aux = n;

        while (n > 0) {
            factor = n * (n - 1);
            System.out.print("Calculando... " + " (" + n + " * " + (n - 1) + ") ");
            n--;
            suma = suma + factor;
            System.out.println("+ " + factor + " = " + suma);
        }
        
        System.out.println("\n\nEl factorial de " + aux + " es " + suma);
        consola.close();
    }    
}