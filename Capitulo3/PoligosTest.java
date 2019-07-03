package Capitulo3;

import java.util.Scanner;

/**
 * PoligosTest
 */
public class PoligosTest {

    public static void main(String[] args) {
        Poligonos p = new Poligonos();
        Scanner consola = new Scanner(System.in);
        
        System.out.print("Introduzca numero de lados: ");
        p.nLados = consola.nextInt();
        System.out.print("Introduzca longitud del lado: ");
        p.longitud = consola.nextDouble();
        System.out.print("Introduzca apotema: ");
        p.apotema = consola.nextDouble();

        p.setPerimetro();
        System.out.println("\nEl perímetro es: " + p.getPerimetro());
        p.setArea();
        System.out.println("El área es: " + p.getArea());
        p.setDenominacion();
        System.out.println("Se trata de un " + p.getDenominacion());
        System.out.println("\n\n");

        consola.close();
    }
}