package Capitulo2;

/**
 * TemperaturaPrueva
 */
public class TemperaturaPrueva {
    public static void main(String[] args) {
        // Creamos el objeto e iniciamos los valores
        Temperatura badajoz = new Temperatura();
        badajoz.setCelsius();
        badajoz.setFarenheit();
        // Mostramos los mensajes usando los metodos y valores del objeto
        System.out.println(badajoz.celsius + " grados celsius equivalen a " + badajoz.celsiusToFarenheit(badajoz.celsius) + " grados Farenheit.");
        System.out.println("y " + badajoz.farenheit + " grados Farenheit son " + badajoz.farenheitToCelsius(badajoz.farenheit) + " grados Celsius.");
    }
}