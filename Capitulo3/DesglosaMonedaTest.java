package Capitulo3;

import java.util.Scanner;

/**
 * DesglosaMonedaTest
 */
public class DesglosaMonedaTest {

    public static void main(String[] args) {
        DesglosaMoneda euros = new DesglosaMoneda();
        String[] mensaje = new String[15];

        mensaje[0] = "Billetes de quinientos euros.";
        mensaje[1] = "Billetes de doscientos euros.";
        mensaje[2] = "Billetes de cien euros.";
        mensaje[3] = "Billetes de cincuenta euros.";
        mensaje[4] = "Billetes de veinte euros.";
        mensaje[5] = "Billetes de diez euros.";
        mensaje[6] = "Billetes de cinco euros.";
        mensaje[7] = "Monedas de dos euros.";
        mensaje[8] = "Monedas de un euro.";
        mensaje[9] = "Monedas de cincuenta centimos.";
        mensaje[10] = "Monedas de veinte centimos.";
        mensaje[11] = "Monedas de diez centimos.";
        mensaje[12] = "Monedas de cinco centimos.";
        mensaje[13] = "Monedas de dos centimos.";
        mensaje[14] = "Monedas de un centimo.";

        Scanner consola = new Scanner(System.in);
        System.out.print("Introduce cantidad ###,##: ");
        String cantidad = consola.next();
        euros.setDesglose(cantidad);
        for (int i = 0; i < 15; i++) {
            if (euros.getMoneda(i) != 0) {
                System.out.println(euros.getMoneda(i) + " " + mensaje[i]);
            }
        }
        consola.close();
    }
}