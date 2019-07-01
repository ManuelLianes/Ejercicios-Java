package Capitulo3;

/**
 * NominaTrabajadorTest
 */
public class NominaTrabajadorTest {
    public static void main(String[] args) {
        NominaTrabajador paco = new NominaTrabajador();
        paco.calculaNomina(6, 40);
        
        System.out.println("Salario base: " + paco.getSalarioBase() + " euros semanales.");
        System.out.println("Salario extra: " + paco.getSalarioExtra() + " euros semanales.");
        System.out.println("Salario bruto: " + paco.getSalarioBruto() + " euros semanales.");
        System.out.println("Salario neto: " + paco.getSalarioNeto() + " euros semanales.");
        System.out.println("\nHoras extra " + paco.isHorasExtra());
        System.out.println("Muchas horas " + paco.isMuchasHorasExtra());
        System.out.println("Mileurista " + paco.isMilEurista());        
        System.out.println("\nNeto mensual: " + paco.getSalarioMes());
    }
}