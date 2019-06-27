package Capitulo3;


/**
 * RestarDosNumero
 * dados dos numeros resta al mayor de ellos el menor
 */
public class RestarDosNumeros {
    /**
     * 
     * @param n1
     * @param n2
     * @return true si n1 > n2
     */
    boolean isMayor(int n1, int n2){
        if (n1 > n2){
            return true;
        }
        return false;
    }

    /**
     * 
     * @param n1
     * @param n2
     * @return true si n1 < n2
     */
    boolean isMenor(int n1, int n2){
        if (n1 < n2){
            return true;
        }
        return false;
    }
}