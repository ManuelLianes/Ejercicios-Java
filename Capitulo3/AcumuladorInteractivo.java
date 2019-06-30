package Capitulo3;

import java.util.Scanner;

/**
 * AcumuladorInteractivo
 */
public class AcumuladorInteractivo {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int numero = 0;
        int contador = 0;
        int suma = 0;

        while (numero >= 0) {
            System.out.println("\nIntroduce numero (negativo para salir)");
            numero = consola.nextInt();
            if (numero >= 0) {
                suma = suma + numero;
                contador++;
            }
        }

        System.out.println("\nNumeros introducidos: " + contador);
        System.out.println("Suma de todos los numeros: " + suma);
        System.out.println("Media de numero: " + (suma / contador));
        consola.close();
    }
}