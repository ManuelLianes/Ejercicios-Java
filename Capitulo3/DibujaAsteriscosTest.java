package Capitulo3;

/**
 * DibujaAsteriscosTest
 */
public class DibujaAsteriscosTest {

    public static void main(String[] args) {
        DibujaAsteriscos pantalla = new DibujaAsteriscos();
        // Piramide
        int ancho = 7;
        int largo = 4;
        int asteriscos = 1;
        
        for (int i = 0; i < largo; i++) {
            pantalla.draw(ancho, asteriscos);
            asteriscos = asteriscos + 2;
        }
        System.out.println("\n\n");
        
        // Rombo
        ancho = 7;
        largo = 7;
        asteriscos = 1;

        for (int i = 0; i <= largo / 2; i++) {
            pantalla.draw(ancho, asteriscos);
            asteriscos = asteriscos + 2;
        }
        asteriscos = asteriscos - 2;
        for (int i = 0; i < largo / 2; i++) {
            asteriscos = asteriscos - 2;
            pantalla.draw(ancho, asteriscos);
        }
        
        System.out.println("\n\n");

        // Rombo vacio
        ancho = 7;
        largo = 7;
        asteriscos = 1;

        for (int i = 0; i <= largo / 2; i++) {
            pantalla.drawVacio(ancho, asteriscos);
            asteriscos = asteriscos + 2;
        }
        asteriscos = asteriscos - 2;
        for (int i = 0; i < largo / 2; i++) {
            asteriscos = asteriscos - 2;
            pantalla.drawVacio(ancho, asteriscos);
        }

        System.out.println("\n\n");
        
        // Arbol
        ancho = 13;
        largo = 2;
        asteriscos = 1;
        
        for (int i = 0; i < largo; i++) {
            pantalla.draw(ancho, asteriscos);
            asteriscos = asteriscos + 2;
        }

        ancho = 13;
        largo = 4;
        asteriscos = 1;
        
        for (int i = 0; i < largo; i++) {
            pantalla.draw(ancho, asteriscos);
            asteriscos = asteriscos + 2;
        }

        ancho = 13;
        largo = 7;
        asteriscos = 1;
        
        for (int i = 0; i < largo; i++) {
            pantalla.draw(ancho, asteriscos);
            asteriscos = asteriscos + 2;
        }
        pantalla.draw(ancho, 3);
        pantalla.draw(ancho, 3);
        pantalla.draw(ancho, 3);
        pantalla.draw(ancho, 3);
    }
}