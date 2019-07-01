package Capitulo3;

/**
 * Quiniela
 */
public class Quiniela {

    public static void main(String[] args) {
        String valores = "12X";
        char opcion = '0';
        int selector = 0;

        for (int i = 0; i < 14; i++) {
            selector = (int)(Math.random() * 100);
            if (selector > 2){i--; } // descarta los valores mayores que la longitud de la cadena            
            else {
                opcion = valores.charAt(selector);
                if (i < 13) {System.out.print(opcion + " - ");
                } else System.out.print(opcion);
            }
        }
        System.out.println("\n\n");
    }
}