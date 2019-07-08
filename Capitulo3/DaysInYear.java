package Capitulo3;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * DaysInYear
 */
public class DaysInYear {

    public static void main(String[] args) {
        YearBisiesto y = new YearBisiesto();
        Calendar year = new GregorianCalendar();
        int dayOfYear = GregorianCalendar.DAY_OF_YEAR;

        System.out.println("Año actual: " + year.get(GregorianCalendar.YEAR));
        System.out.println( year.get(dayOfYear) + " Dias desde Añonuevo.");
        if (y.isBisiesto(GregorianCalendar.YEAR)) {
            System.out.println((366 - year.get(dayOfYear) + " Dias hasta Nochevieja."));
        }
        else System.out.println((365 - year.get(dayOfYear) + " Dias hasta Nochevieja."));
    }
}