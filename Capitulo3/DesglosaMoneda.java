package Capitulo3;

/**
 * DesglosaMoneda
 * @author Manuel Lianes
 */
public class DesglosaMoneda {
    // registra el numero de conedas de cada tipo
    // tabla de monedas 500, 200, 100, 50, 20, 10, 5,
    // 2, 1, 50, 20, 10, 05, 02, 01
    int[] monedas = new int[15];

    void setDesglose(String cantidad){
        String[] partes = cantidad.split(",");
        int euros = Integer.valueOf(partes[0]);
        int centimos = Integer.valueOf(partes[1]);

        // Descomponemos la parte entera
        while (euros > 0) {
            if (euros >= 500) {
                monedas[0]++;
                euros -= 500;
            } else if (euros >= 200) {
                monedas[1]++;
                euros -= 200;
            } else if (euros >= 100) {
                monedas[2]++;
                euros -= 100;
            } else if (euros >= 50) {
                monedas[3]++;
                euros -= 50;
            } else if (euros >= 20) {
                monedas[4]++;
                euros -= 20;
            } else if (euros >= 10) {
                monedas[5]++;
                euros -= 10;
            } else if (euros >= 5) {
                monedas[6]++;
                euros -= 5;
            } else if (euros >= 2) {
                monedas[7]++;
                euros -= 2;
            } else if (euros >= 1) {
                monedas[8]++;
                euros -= 1;
            } 
        }

        // pasamos a trabajar con los centimos
        while (centimos > 0) {
            if (centimos >= 50) {
                monedas[9]++;
                centimos -= 50;
            } else if (centimos >= 20) {
                monedas[10]++;
                centimos -= 20;
            } else if (centimos >= 10) {
                monedas[11]++;
                centimos -= 10;
            } else if (centimos >= 5) {
                monedas[12]++;
                centimos -= 5;
            } else if (centimos >= 2) {
                monedas[13]++;
                centimos -= 2;
            } else if (centimos >= 1) {
                monedas[14]++;
                centimos -= 1;
            }
        }
    }

    int getMoneda(int i){
        return monedas[i];
    }
}
