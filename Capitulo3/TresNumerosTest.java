package Capitulo3;

/**
 * TresNumerosTest
 */
public class TresNumerosTest {

    public static void main(String[] args) {
        TresNumeros n = new TresNumeros();
        n.setNumeros();
        System.out.println("\nlos numeros son: \n");
        System.out.println("en la primera posición: " + n.numeros[0]);
        System.out.println("en la segunda posición: " + n.numeros[1]);
        System.out.println("en la tercera posición: " + n.numeros[2]);
        if (n.ordenados()){
            System.out.println("\nEstan ordenados de menor a mayor.");
            if(n.consecutivos()){System.out.println("Son consecutivos.");}
        } else { 
            System.out.println("\npero estan desordenados");
        }
    }
}
