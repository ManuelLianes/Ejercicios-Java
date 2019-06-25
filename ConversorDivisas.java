package ejercicios;

/**
 * ConversorDivisas
 */
public class ConversorDivisas {
    private double tipoCambio;

    public static void main(String[] args) {
        ConversorDivisas moneda = new ConversorDivisas(0.89);
        System.out.println("Tipo de cambio 1 Euro son " + moneda.tipoCambio + " Libras.");
        System.out.println("tus 71.530,28 Euros son " + moneda.eurosToLibras(71530.28) + " Libras.");
        System.out.println("pero si ahorrases en libras tendrias " + moneda.librasToEuros(71530.28) + " Libras");
    }

    // Constructor sin parametros
    public ConversorDivisas(){
        tipoCambio = 0.85;
    }

    // constructor con parametros
    public ConversorDivisas(double parametro){
        tipoCambio = parametro;
    }

    // Convierte euros a libras
    public double eurosToLibras(double euros) {
        return euros * tipoCambio;        
    }

    // Convierte libras a euros
    public double librasToEuros(double libras) {
        return libras / tipoCambio;
    }
}