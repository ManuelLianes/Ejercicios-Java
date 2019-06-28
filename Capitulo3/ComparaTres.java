package Capitulo3;

/**
 * ComparaTres
 * la evaluación de mediano es más compleja que las otras
 */
public class ComparaTres {
    void comparar(int a, int b, int c){
        System.out.println("\npara A = " + a + "; B = " + b + "; C = " + c);
        // evalua posición de a
        if((a > b) && (a > c)) {System.out.println("A es el mayor");}
        if(((a > b) && (a < c)) || ((a < b) && (a > c))) {System.out.println("A es el mediano");}
        if((a < b) && (a < c)) {System.out.println("A es el menor");}

        // evalua posición de b
        if((b > a) && (b > c)) {System.out.println("B es el mayor");}
        if(((b > a) && (b < c)) || ((b < a) && (b > c))) {System.out.println("B es el mediano");}
        if((b < a) && (b < c)) {System.out.println("B es el menor");}

        // evalua posición de c
        if((c > a) && (c > b)) {System.out.println("C es el mayor");}
        if(((c > a) && (c < b)) || ((c < a) && (c > b))) {System.out.println("C es el mediano");}
        if((c < a) && (c < b)) {System.out.println("C es el menor");}
    }
}