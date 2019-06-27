package Capitulo3;

import java.math.*;

/**
 * RaizPositivo
 * calcula la raiz cuadrada de un numero si este es positivo
 */

public class RaizPositivo {
    public static void main(String[] args) {
        int[] valores = new int[]{ -5, -1, 0, 1, 5};
        NegativoPositivo n = new NegativoPositivo();
        
        for (int i = 0; i < valores.length; i++) {
            if (n.isPositivo(valores[i])) {
                System.out.println("El numero " + valores[i] + " es positivo, y su raiz cuadra es: " + Math.sqrt(valores[i]));
            } else {
                System.out.println("El numero es negativo, no se puede calcular su raiz");
            }
        }
    }
}