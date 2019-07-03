package Capitulo3;

import java.util.Scanner;

/**
 * PredictorClimatologicoTest
 */
public class PredictorClimatologicoTest {

    public static void main(String[] args) {
        PredictorClimatologico clima = new PredictorClimatologico();
        Scanner consola = new Scanner(System.in);
        int presion, humedad;

        System.out.print("Introduzca presión (1-3): ");
        presion = consola.nextInt();
        System.out.print("Introduzca humedad (1-3): ");
        humedad = consola.nextInt();

        System.out.println();
        clima.setLluvia(presion, humedad);
        System.out.println("La probabilidad de lluvia es " + clima.getLluvia());

        clima.setSol(presion, humedad);
        System.out.println("La probabilidad de que haga sol es " + clima.getSol());

        clima.setFrio(presion, humedad);
        System.out.println("La probabilidad de que haga frio es " + clima.getFrio());

        consola.close();
    }
}