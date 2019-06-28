package Capitulo3;

/**
 * ContarCifras
 */
public class ContarCifras {

    /**
     * 
     * @param n int
     * @return int cifras
     */
    int cifras(int n){
        int cifras = 0;
        if (n == 0) {return 1;}
        // para positivos
        while (n > 0) {
            cifras++;
            n = n / 10;
        }
        // para negativos
        while (n < 0) {
            cifras++;
            n = n / 10;
        }
        return cifras;
    }
}