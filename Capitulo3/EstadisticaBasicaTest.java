package Capitulo3;

import java.util.Scanner;

/**
 * EstadisticaBasicaTest valores a provar 
 * máximo ok
 * mínimo ok
 * media ok
 * mediana ok
 * desviación típico ok
 */
public class EstadisticaBasicaTest {

    public static void main(String[] args) {
        EstadisticaBasica n = new EstadisticaBasica();
        Scanner consola = new Scanner(System.in);
        
        // imput
        for (int i = 0; i < 10; i++) {
            System.out.print("indice de tabla = " + i + ". Introduzca un numero: ");
            n.addNumero(i, consola.nextInt());
        }

        System.out.println("\n El mayor es: " + n.getMayor());
        System.out.println("\n El menor es: " + n.getMenor());
        System.out.println("\n La media es: " + n.getMedia());
        System.out.println("\n El mediano es: " + n.getMediana());
        System.out.println("\n La varianza es: " + n.getVarianza());
        System.out.println("\n La desviación típica es: " + n.getDesviacionTipica());
        consola.close();
    }
}