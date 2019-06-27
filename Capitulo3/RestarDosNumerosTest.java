package Capitulo3;

/**
 * RestarDosNumeroTest
 */
public class RestarDosNumerosTest {

    public static void main(String[] args) {
        int[] v1 = new int[]{1, 2, 3, 4, 5, 19};
        int[] v2 = new int[]{2, 3, 4, 5, 6, 78};
        int resta;
        RestarDosNumeros n = new RestarDosNumeros();

        // Test isMayor(n1, n2) ok
        for (int i = 0; i < v1.length; i++) {
            if (n.isMayor(v1[i], v2[i])){
                resta = v1[i] - v2[i];
                System.out.println(v1[i] + " - " + v2[i] + " = " + resta);
            } else {
                resta = v2[i] - v1[i];
                System.out.println(v2[i] + " - " + v1[i] + " = " + resta);
            }
        }

        // Test isMenor(n1, n2)
        System.out.println();
        for (int i = 0; i < v1.length; i++) {
            if (n.isMenor(v1[i], v2[i])){
                resta = v2[i] - v1[i];
                System.out.println(v2[i] + " - " + v1[i] + " = " + resta);
            } else {
                resta = v1[i] - v2[i];
                System.out.println(v1[i] + " - " + v2[i] + " = " + resta);
            }
        }

    }
}