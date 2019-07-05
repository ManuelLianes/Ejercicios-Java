package Capitulo3;

import java.time.*;
import java.util.Calendar;
import java.util.GregorianCalendar;


/**
 * CalculaEdadTest
 */
public class CalculaEdadTest {

    public static void main(String[] args) {
        CalculaEdad nacimiento = new CalculaEdad();
        
        nacimiento.setBirthYear(1978);
        nacimiento.setBirthMonth(12);
        nacimiento.setBirthDay(20);
        nacimiento.setAgeYears();
        nacimiento.setAgeMonths();
        nacimiento.setAgeDays();

        System.out.print("tienes: " + nacimiento.getAgeYears() + " años, ");
        System.out.print(nacimiento.getAgeMonths() + " meses ");
        System.out.println("y " + nacimiento.getAgeDays() + " dias.");

        System.out.println();
    }
}