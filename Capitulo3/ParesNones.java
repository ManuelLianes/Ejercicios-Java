package Capitulo3;

import java.util.Scanner;

/**
 * ParesNones
 */
public class ParesNones {

    public static void main(String[] args){
        MiNumero n1 = new MiNumero();
        MiNumero n2 = new MiNumero();
        
        Scanner consola = new Scanner(System.in);

        System.out.print("\nIntroduce el primer numero: ");
        n1.setNumero(consola.nextInt());
        System.out.print("Indroduce el segundo numero: ");
        n2.setNumero(consola.nextInt());
        System.out.println("Desea ver los numeros Pares o Impares? (P/I)");
        String option = consola.next();
        consola.close();

        if (option.equalsIgnoreCase("p")) {
            System.out.println("Pulsó la p");
            if (n1.isMayor(n2.n)) {n2.mostrarPares(n1.n); }
            if (n1.isMenor(n2.n)) {n1.mostrarPares(n2.n); }
        } else {
            if (option.equalsIgnoreCase("i")) {
                System.out.println("Pulsó la i");
                if (n1.isMayor(n2.n)) {n2.mostrarImpares(n1.n); }
                if (n1.isMenor(n2.n)) {n1.mostrarImpares(n2.n); }
            }
        }
    }
}