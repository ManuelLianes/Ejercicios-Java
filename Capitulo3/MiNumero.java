package Capitulo3;

/**
 * MiNumero
 * varios metodos para futuros ejercicios
 */
public class MiNumero {

    boolean isPar(int n){
        if(n % 2 == 0){return true;}
        return false;
    }

    boolean isImpar(int n){
        if(n % 2 != 0){return true;}
        return false;
    }

    boolean isMayor(int n1, int n2){
        if(n1 > n2) {return true;}
        return false;
    }

    boolean isMenor(int n1, int n2){
        if(n1 < n2) {return true;}
        return false;
    }

}