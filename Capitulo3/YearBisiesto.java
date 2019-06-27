package Capitulo3;


/**
 * YearBisiesto
 *
 */
public class YearBisiesto {

    /**
     * 
     * @param year
     * @return true si es bisiesto
     */

    boolean isBisiesto(int year){
        boolean flag = false;
        if (year % 4 == 0) { flag = true;}
        if (year % 100 == 0) { flag = false;}
        if ((year % 100 == 0) && (year % 400 == 0)) { flag = true;}
        return flag;
    }
}