package Capitulo3;

import java.util.Scanner;

/**
 * Calculadora
 */
public class Calculadora {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int n1 = 0;
        int n2 = 0;
        String opc = "";

        System.out.println("Introduzca 'q' para salir");
        while (!opc.equals("q")) {
            System.out.print("\nIntroduzca primer numero: ");
            n1 = consola.nextInt();

            System.out.print("Introduzca operador: ");
            opc = consola.next().toLowerCase();

            System.out.print("Introduzca segundo numero: ");
            n2 = consola.nextInt();

            if (opc.equals("+")) {
                System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
            }
            if (opc.equals("-")) {
                System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
            }
            if (opc.equals("*")) {
                System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
            }
            if (opc.equals("/")) {
                System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
            }
            if (opc.equals("%")) {
                System.out.println(n1 + " % " + n2 + " = " + (n1 % n2));
            }
        }
        consola.close();
    }
}