package Capitulo3;

/**
 * YearBisiestoTest
 */
public class YearBisiestoTest {

    public static void main(String[] args) {
        int[] list = new int[]{0, 4, 8, 16, 19, 100, 400, 1978, 1980, 2000, 2019};
        YearBisiesto year = new YearBisiesto();

        for (int i = 0; i < list.length; i++) {
            if (year.isBisiesto(list[i])){
                System.out.println("El año " + list[i] + " es bisiesto");
            } else {
                System.out.println("El año " + list[i] + " no es bisiesto");
            }
        }
    }
}