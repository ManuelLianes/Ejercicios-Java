package Capitulo3;

/**
 * EstadisticaBasica
 * a base de buscar formulas estadisticas que no conocia
 */
public class EstadisticaBasica {
    double[] aNumeros = new double[10];
    double[] aDesviacion = new double[10];
    double[] aVarianza = new double[10];

    double maximo, minimo, media, mediana;


    boolean isMaximo(int n){
        if (n > maximo){
            return true;
        }
        return false;
    }

    boolean isMinimo(int n){
        if (n < minimo){
            return true;
        }
        return false;
    }

    void addNumero(int indice, double valor){
        aNumeros[indice] = valor;
    }

    double getNumero(int indice){
        return aNumeros[indice];
    }

    double getMayor(){
        maximo = aNumeros[0];
        for (int i = 0; i < 10; i++) {
            if (aNumeros[i] > maximo){
                maximo = aNumeros[i];
            }
        }
        return maximo;
    }

    double getMenor(){
        minimo = aNumeros[0];
        for (int i = 0; i < 10; i++) {
            if (aNumeros[i] < minimo){
                minimo = aNumeros[i];
            }
        }
        return minimo;
    }

    double getMedia(){
        double suma = 0;
        for (int i = 0; i < 10; i++) {
            suma = suma + aNumeros[i];
        }
        media = suma /10;
        return media;
    }

    double getMediana(){
        double[] aDesviacion = new double[10];
        int iDesvioMinimo = 0; // indice en la tabla aDesviacion[]

        // asigna las aDesviaciones respecto a la media
        for (int i = 0; i < 10; i++) {
            if (aNumeros[i] > media) {
                aDesviacion[i] = aNumeros[i] - media;
            } else { aDesviacion[i] = media - aNumeros[i]; }
            System.out.println("para " + aNumeros[i] + " la desviación es " + aDesviacion[i]);
        }

        // busca el indice de la menor desviación
        for (int i = 0; i < 10; i++) {
            if (aDesviacion[i] < aDesviacion[iDesvioMinimo]) {
                iDesvioMinimo = i;
            }
        }
        return aNumeros[iDesvioMinimo];
    }

    double getVarianza(){
        double[] aVarianza = new double[10];
        double suma = 0;

        for (int i = 0; i < 10; i++) {
            aVarianza[i] = Math.pow((media - aDesviacion[i]), 2);
            suma = suma + aVarianza[i];
        }
        return (suma / 9);
    }

    double getDesviacionTipica(){
        double desviacionTipica = 0;

        for (int i = 0; i < 10; i++) {
            desviacionTipica = Math.sqrt(Math.pow((aNumeros[i] - media), 2)/10);
        }
        return desviacionTipica;
    }
}