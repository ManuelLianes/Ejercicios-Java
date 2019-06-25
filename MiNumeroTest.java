package ejercicios;

/**
 * MiNumeroTest
 * tests para todas las funciones
 */
public class MiNumeroTest {

    public static void main(String[] args) {
        // test del constructor MiNumero() 
        // valor esperado 0
        MiNumero nuevoNumero = new MiNumero();
        System.out.println(nuevoNumero.getValor());
        
        // test del metodo constructor MiNumero(int)
        // valor esperado 500
        MiNumero nuevoNumero2 = new MiNumero(500);
        System.out.println(nuevoNumero2.getValor());

        // test del metodo cambiaNumero()
        // valor esperado 100
        nuevoNumero.cambiaNumero(100);
        System.out.println(nuevoNumero.getValor());

        // test del metodo suma()
        // valor esperado 110
        nuevoNumero.suma(10);
        System.out.println(nuevoNumero.getValor());

        // test del metodo resta()
        // valor esperado 105
        nuevoNumero.resta(5);
        System.out.println(nuevoNumero.getValor());

        // el metodo getValor() supera las pruevas

        // test de getDoble()
        // valor esperado 210
        System.out.println(nuevoNumero.getDoble());

        // test de getTriple()
        // valor esperado 315
        System.out.println(nuevoNumero.getTriple());

        // test de getCuadruple()
        // valor esperado 420
        System.out.println(nuevoNumero.getCuadruple());
    }
}