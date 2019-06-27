package Capitulo3;

/**
 * NegativoPositivo
 * Comprueba si un numero es positivo o negativo
 * @author Manuel Lianes
 * @version 0.1
 */

public class NegativoPositivo {
    /**
     * @param numero
     * @return true cuando es 0 o positivo, false para negativo
     */
    boolean isPositivo(int numero){
        if (numero >= 0) {return true;}
        return false;
    }

    /**
     * 
     * @param numero
     * @return true cuando es negativo, false para 0 o positivo
     */
    boolean isNegativo(int numero){
        if (numero < 0) {return true;}
        return false;
    }
}