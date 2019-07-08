package Capitulo3;

import java.util.Scanner;

/**
 * CalculaDescuentos
 */
public class CalculaDescuentos {

    public static void main(String[] args) {
        CalculaEdad fecha = new CalculaEdad();
        Scanner consola = new Scanner(System.in);
        double precioProducto = 0;

        while (precioProducto >= 0) {
            System.out.print("\nIntroduzca fecha de nacimiento xx/xx/xxxx: ");
            String nacimientoCliente = consola.next();
            fecha.calculaEdad(nacimientoCliente);
            System.out.print("introzca precio del producto: ");
            precioProducto = consola.nextDouble();
            if (fecha.isMayor65()) {
                precioProducto = precioProducto - (precioProducto * 0.15);
            } else {
                if (fecha.isMenor25()) {
                    precioProducto = precioProducto - (precioProducto * 0.10);
                }
            }
            System.out.println("El precio final es : " + precioProducto);
        }
        consola.close();
    }
}