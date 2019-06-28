package Capitulo3;

import java.util.Scanner;

/**
 * Tresnumeros
 * 
 * @param <Scanner>
 */
public class TresNumeros{
    public int[] numeros = new int[3];

    void setNumeros(){
        Scanner leerConsola = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce posición " + i + " : ");
            numeros[i] = leerConsola.nextInt();
        }
        leerConsola.close();
    }

    boolean ordenados(){
        if((numeros[0] <= numeros[1]) && ( numeros[1] <= numeros[2])){
            return true;
        }
        return false;
    }

    boolean consecutivos(){
        if((numeros[0] == numeros[1]-1) && ( numeros[1] <= numeros[2]-1)){
            return true;
        }
        return false;
    }
}