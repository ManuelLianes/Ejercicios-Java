package Capitulo3;

/**
 * MiNumeroTest
 */
public class MiNumeroTest {

    public static void main(String[] args) {
        MiNumero n = new MiNumero();
        int nTest1 = 654;
        int nTest2 = 1000;

        // Test setNumero()
        n.setNumero(nTest1);
        System.out.println(n.getNumero() + " setNumero() y getNumero() ok");

        // Test addNumero()
        System.out.println("Test addNumero");
        System.out.println("Valor inicial: " + n.n);
        n.addNumero(5);
        System.out.println("Valor incrementado: " + n.n);

        // Test isPar(int n) -- ok
        System.out.println("\nTest metodo isPar(int n)");
        System.out.print(nTest1 + " es par -- ");
        System.out.println(n.isPar());

        // Test isImpar(int n) -- ok
        System.out.println("\nTest metodo isImpar(int n)");
        System.out.print(nTest1 + " es impar -- ");
        System.out.println(n.isImpar());

        // Test isMayor(int n1, int n2) -- ok
        System.out.println("\nTest metodo isMayor(int n1, int n2)");
        if(n.isMayor(nTest2)){
            System.out.println(nTest1 + " es mayor que "+ nTest2);
        }

        // Test isMenor(int n1, int n2) -- ok
        System.out.println("\nTest metodo isMenor(int n1, int n2)");
        if(n.isMenor(nTest2)){
            System.out.println(nTest1 + " es Menor que "+ nTest2);
        }
    }
}