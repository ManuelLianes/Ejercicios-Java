package Capitulo2;

/**
 * RestauranteTest
 */
public class RestauranteTest {
    public static void main(String[] args) {
        // Constructor parametrizado
        Restaurante morgado = new Restaurante(10, 1);
        morgado.addChorizos(100);
        morgado.addHuevos(1);
        morgado.sirvePlato();
        System.out.println("Huevos disponibles: " + morgado.getHuevos() + " unidades.");
        System.out.println("Chorizo dispoble: " + morgado.getChorizos() + " kg.");
        System.out.println("Platos posibles: " + morgado.getNumeroPlatos());
    }
}