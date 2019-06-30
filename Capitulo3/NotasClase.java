package Capitulo3;

import java.util.Scanner;

/**
 * NotasClase
 */
public class NotasClase {

    public static void main(String[] args) {
        int nota;
        int alumnosAprobados = 0;
        int alumnosSuspensos = 0;
        Scanner consola = new Scanner(System.in);

        for (int i = 0; i < 30; i++) {
            System.out.print("Nota del alumno: ");
            nota = consola.nextInt();
            if ((nota > 0) && (nota < 10)){
                if (nota < 5){ alumnosSuspensos++;} 
                else alumnosAprobados++;
            } else {
                i--;
                System.out.println(" -- Nota incorrecta, pruebe otra vez. --");
            }
        }
        System.out.println("Alumnos aprobados: " + alumnosAprobados);
        System.out.println("Alumnos suspensos: " + alumnosSuspensos);
    }
}