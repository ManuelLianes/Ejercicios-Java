package ejercicios;

/**
 * PesoTest
 */
public class PesoTest {
    public static void main(String[] args) {
        // Test constructor Peso(valor, unidad)
        Peso miPeso = new Peso(100, "oz");
        System.out.println(miPeso.getGramos() + " Gramos.");
        System.out.println(miPeso.getKilos() + " Kilos.");
        System.out.println(miPeso.getLibras() + " Libras.");
        System.out.println(miPeso.getOnzas() + " Onzas.");
    }
}