package Capitulo3;

/**
 * AcumulaSuma
 */
public class AcumulaSuma {

    public static void main(String[] args) {
        int suma = 1;

        for (int i = 1; i < 1000; i++) {
            if (i % 2 == 0) {
                System.out.print(suma + " + " + i);
                suma = suma + i;
                System.out.println(" = " + suma);
            }
        }
    }
}