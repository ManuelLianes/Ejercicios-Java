package Capitulo3;

/**
 * DibujaAsteriscos
 */
public class DibujaAsteriscos {
    void pintaAsterisco(){System.out.print("*"); }
    void pintaEspacio(){System.out.print(" "); }
    /**
     * 
     * @param longitud
     * @param asteriscos
     */
    void draw(int longitud, int asteriscos){
        int espacios = longitud - asteriscos;
        int margen = espacios / 2;
        int column;

        for (column = 1; column <= longitud; column++) {
            if ((column > margen) && (column <= margen + asteriscos)){
                pintaAsterisco();
            } else { pintaEspacio();}
        }
        System.out.println();
    }
    
    void drawVacio(int longitud, int asteriscos){
        int espacios = longitud - asteriscos;
        int margen = espacios / 2;
        int column;

        for (column = 1; column <= longitud; column++) {
            if ((column == margen+1) || (column == margen + asteriscos)){
                pintaAsterisco();
            } else { pintaEspacio();}
        }
        System.out.println();
    }
}