package Capitulo3;

import java.util.Scanner;
import Capitulo3.MiNumero;

/**
 * Omirps
 */
public class Omirps {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Introduzca limite superior: ");

        MiNumero Omirps = new MiNumero();
        int limite = consola.nextInt();

        for (Omirps.n = 10; Omirps.n < limite; Omirps.addNumero(1)) {
            if (Omirps.isPrimo()) {
                System.out.print(Omirps.n + " Número primo.");
                if (Omirps.isOmirps()){
                    System.out.print(" y ademas Omirps");
                }
                System.out.println("");
            }
        }
        
        // Tests
        /* Omirps.n = limite;
        System.out.println("primo? " + Omirps.isPrimo());
        System.out.println("Omirps? " + Omirps.isOmirps());
        */
        consola.close();
    }
}