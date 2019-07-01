package Capitulo3;

import java.util.Scanner;

/**
 * NumeroSecreto
 */
public class NumeroSecreto {

    public static void main(String[] args) {
        MiNumero n = new MiNumero();
        n.setNumero(n.getNRandom());
        int opc = 101;
        int intentos = 0;
        Scanner consola = new Scanner(System.in);

        while (opc != n.n){
            System.out.print("Adivina numero: ");
            opc = consola.nextInt();
            if (opc < n.n) {
                System.out.println("Te quedas corto, prueba otra vez\n");
            } else if (opc > n.n) {
                System.out.println("Te has pasado, prueba otra vez\n");
            }
            intentos++;
        }
        System.out.println("Acertastes... tras " + intentos + " intentos...");
        consola.close();
    }
}