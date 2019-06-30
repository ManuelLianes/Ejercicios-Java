package Capitulo3;

/**
 * CribaErastoteles
 */
public class CribaErastoteles {

    public static void main(String[] args) {
        int contador = 0;
        BuscaPrimos numero = new BuscaPrimos();

        for (int i = 3; i < 1001; i++) {
            if (numero.isPrimo(i)) {
                contador++;
                System.out.println(i + " ¡Eureca! ¡Primo encontrado! ");
            }
        }
        System.out.println("\n\nHay " + contador + " numero primos entre 2 y 1000");
    }
}