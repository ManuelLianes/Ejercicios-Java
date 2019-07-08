package Capitulo3;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * CalculaEdad
 */
public class CalculaEdad {
    private Calendar fecha = new GregorianCalendar();
    private int birthYear, birthMonth, birthDay;
    private int ageYears, ageMonths, ageDays;

    // Constructor
    void calculaEdad(String cadena){
        String[] sNacimiento = new String[3];
        sNacimiento = cadena.split("/");
        setBirthDay(Integer.valueOf(sNacimiento[0]));
        setAgeDays();
        setBirthMonth(Integer.valueOf(sNacimiento[1]));
        setAgeMonths();
        setBirthYear(Integer.valueOf(sNacimiento[2]));
        setAgeYears();
    }
    
    boolean isMayor65(){
        boolean flag = false;
        if(getAgeYears() >= 65) {
            flag = true;
        }
        return flag;
    }

    boolean isMenor25(){
        boolean flag = false;
        if(getAgeYears() <= 25) {
            flag = true;
        }
        return flag;
    }

    // Seters y Geters
    void setBirthYear(int intYear){
        birthYear = intYear;
    }

    int getBirthYear(){
        return birthYear;
    }

    void setBirthMonth(int intmonth){
        birthMonth = intmonth;
    }

    int getBirthMonth(){
        return birthMonth;
    }

    void setBirthDay(int intDay){
        birthDay = intDay;
    }

    int getBirthDay(){
        return birthDay;
    }

    void setAgeYears(){
        int actualYear = fecha.get(GregorianCalendar.YEAR);
        if (birthYear >= actualYear) {
            ageYears = actualYear - birthYear;
        } else ageYears = actualYear - birthYear - 1;
    }

    int getAgeYears(){
        return ageYears;
    }

    void setAgeMonths(){
        int actualMonth = fecha.get(GregorianCalendar.MONTH);
        //int monthsUntilNextYear = 12 - actualMonth;

        if (birthMonth >= actualMonth) {
            ageMonths = birthMonth - actualMonth;
        } else ageMonths = actualMonth - birthMonth;
    }

    int getAgeMonths(){
        return ageMonths;
    }

    void setAgeDays(){
        int actualDay = fecha.get(GregorianCalendar.DAY_OF_MONTH);
        int daysInBirthMonth = 30;
        int daysUntilNextMotn = (daysInBirthMonth - birthDay);

        if (birthDay >= actualDay) {
            ageDays = daysUntilNextMotn + actualDay;
        } else ageDays = birthDay - actualDay;
    }

    int getAgeDays(){
        return ageDays;
    }

}