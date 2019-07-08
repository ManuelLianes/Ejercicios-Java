package Capitulo3;

/**
 * NumeroALetraTest
 */
public class NumeroALetraTest {

    public static void main(String[] args) {
        NumeroALetra n = new NumeroALetra();
        for (int i = 1820; i < 1930; i++) {
            n.setup(i);
            n.getCadena();
            System.out.println("La denominación de " + i + " es: " + n.denominacion);
        }
    }
}