package Capitulo3;

import java.util.Scanner;

/**
 * ParteDecimal
 */
public class ParteDecimal {
    public float n = 0;

    /**
     * se ha de introducir el numero con ","
     * @return
     */
    float getNumero(){
        Scanner getConsola = new Scanner(System.in);
        n = getConsola.nextFloat();
        getConsola.close();
        return n;
    }

    boolean haveDecimal(){
        if(n != Math.round(n)){ 
            return true;
        }
        return false;
    }
}