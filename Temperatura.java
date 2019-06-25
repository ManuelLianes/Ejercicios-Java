package ejercicios;

/**
 * Temperatura
 */
public class Temperatura {
    public double celsius;
    public double farenheit;

    public void setCelsius() {
        celsius = 21;
    }

    public void setFarenheit() {
        farenheit = 100;
    }
    
    public double celsiusToFarenheit(double celsius) {
        double farenheit = (celsius * 1.8) + 32;
        return farenheit;
    }

    public double farenheitToCelsius(double farenheit) {
        double celsius  = (farenheit - 32) / 1.8;
        return celsius;
    }
}