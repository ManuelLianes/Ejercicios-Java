package Capitulo3;

/**
 * ContarCifrasTest
 */
public class ContarCifrasTest {

    public static void main(String[] args) {
        int n = 123456789;
        ContarCifras cifras = new ContarCifras();
        System.out.println("El número: " + n + " tiene " + cifras.cifras(n) + " cifras.");
    }
}