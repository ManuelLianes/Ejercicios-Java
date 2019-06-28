package Capitulo3;

/**
 * MiNumeroTest
 */
public class MiNumeroTest {

    public static void main(String[] args) {
        MiNumero n = new MiNumero();
        int nTest1 = 654;
        int nTest2 = 10000;

        // Test isPar(int n) -- ok
        System.out.println("\nTest metodo isPar(int n)");
        System.out.print(nTest1 + " es par -- ");
        System.out.println(n.isPar(nTest1));

        // Test isImpar(int n) -- ok
        System.out.println("\nTest metodo isImpar(int n)");
        System.out.print(nTest1 + " es impar -- ");
        System.out.println(n.isImpar(nTest1));

        // Test isMayor(int n1, int n2) -- ok
        System.out.println("\nTest metodo isMayor(int n1, int n2)");
        if(n.isMayor(nTest1, nTest2)){
            System.out.println(nTest1 + " es mayor que "+ nTest2);
        }

        // Test isMenor(int n1, int n2) -- ok
        System.out.println("\nTest metodo isMenor(int n1, int n2)");
        if(n.isMenor(nTest1, nTest2)){
            System.out.println(nTest1 + " es Menor que "+ nTest2);
        }
    }
}