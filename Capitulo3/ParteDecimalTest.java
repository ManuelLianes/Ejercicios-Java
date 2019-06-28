package Capitulo3;

/**
 * ParteDecimalTest
 */
public class ParteDecimalTest {

    public static void main(String[] args) {
        ParteDecimal numero = new ParteDecimal();
        System.out.println("Introduce el numero: ");
        try {
            numero.getNumero();
            System.out.print("\nEl numero: " + numero.n);
        } catch (Exception e) {
            System.out.println("Formato de numero erroneo #,##");
        }
        if(numero.haveDecimal()){
            System.out.println(" tiene parte Decimal.");
        } else {
            System.out.println(" no tiene parte Decimal.");
        };
    }
}