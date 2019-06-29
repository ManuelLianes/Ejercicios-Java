package Capitulo3;

import java.util.Scanner;

/**
 * TablaMultiplicar
 */
public class TablaMultiplicar {

    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        int numero;

        System.out.print("Tabla del: ");
        numero = imput.nextInt();
        int i = 1;
        while (i <= 10) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
            i++;
        }
        imput.close();
    }
}