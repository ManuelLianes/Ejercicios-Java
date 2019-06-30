package Capitulo3;

import java.util.Scanner;

/**
 * LuckyNumber
 */
public class LuckyNumber {

    public static void main(String[] args) {
        String date;
        int luckyNumber, day, month, year;
        Scanner consola = new Scanner(System.in);

        System.out.println("Introduce fecha 'dd/mm/aaaa': ");
        date = consola.next();
        String[] fecha = date.split("/");
        
        day = sumaFecha(fecha[0]);
        month = sumaFecha(fecha[1]);
        year = sumaFecha(fecha[2]);
        luckyNumber = day + month + year;
        while (luckyNumber > 9) {
            date = Integer.toString(luckyNumber);
            luckyNumber = sumaFecha(date);
        }
        System.out.println("Tu numero de la suerte es el " + luckyNumber);
        consola.close();
    }

    static int sumaFecha(String cadena){
        int suma = 0;
        for (int i = 0; i < cadena.length(); i++) {
            suma = suma + Character.getNumericValue(cadena.charAt(i));
        }
        return suma;
    }
}