package Capitulo3;

/**
 * BuscaPrimos
 */
public class BuscaPrimos {

    boolean isPrimo(int dividendo){
        boolean primo = true;
        int divisor = 2;

        while ((primo) && (dividendo > divisor)){
            if (dividendo % divisor == 0) {
                primo = false;
                System.out.println(dividendo + " es divisible entre " + divisor);
            }
            divisor++;
        }
        return primo;
    }
}