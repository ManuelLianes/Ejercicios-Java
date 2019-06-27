package Capitulo3;

/**
 * NegativoPositivoTest
 * {@value}
 */
public class NegativoPositivoTest {

    public static void main(String[] args) {
        NegativoPositivo n = new NegativoPositivo();
        int[] valores = new int[]{ -5, -1, 0, 1, 5};

        System.out.println("\nTest method isPositivo()\n");
        for (int i = 0; i < valores.length; i++) {
            if (n.isPositivo(valores[i])) {
                System.out.println("El numero " + valores[i] + " es POSITIVO");
            } else {
                System.out.println("El numero " + valores[i] + " es NEGATIVO");
            }
        }

        System.out.println("\nTest method isNegativo()\n");
        for (int i = 0; i < valores.length; i++) {
            if (n.isNegativo(valores[i])) {
                System.out.println("El numero " + valores[i] + " es NEGATIVO");
            } else {
                System.out.println("El numero " + valores[i] + " es POSITIVO");
            }
        }
    }
}