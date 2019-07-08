package Capitulo3;

/**
 * NumeroALetra
 * @author Manuel Lianes
 */
public class NumeroALetra {
    int[] nList = new int[4];
    String[] sUnidades = {"cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve" };
    String[] sEspeciales = {"diez", "once", "doce", "trece", "catorce", "quince"};
    String[] sDecenas = {" ", "dieci", "veinti", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta", "noventa" };
    String[] sCentenares = {" ", "ciento", "doscientos", "trescientos", "cuatrocientos", "quinientos", "seiscientos", "setecientos", "ochocientos", "novecientos" };
    boolean flagSpecials = false;
    String denominacion = new String();
    
    /***
     * descompone un numero int (4 digitos) en una lista de cadenas
     * @param numero
     */
    void setup(int numero){
        int digit = 0;
        int i = 3; // el contador sera decreciente para almacer el numero en orden, con las unidades al final
        int n = numero;

        while (n > 0){
            digit = n % 10;
            n /= 10;
            nList[i] = digit;
            i--;
        }
    }

    /***
     * determina si el numero necesita un tratamiento especial
     * "diez, once... quince"
     * @param numero
     * @return
     */
    boolean isSpecial(int numero){
        int digit = numero % 100;
        if ((digit > 9) && (digit < 16)) { flagSpecials = true; }
        return flagSpecials;
    }

    /***
     * devuelve el "nombre" del digito seleccionado
     * 0 miles ... 3 unidades
     * @param index
     * @return
     */
    String getDigito(int index){
        int valor = nList[index];
        return sUnidades[valor];
    }

    String getCadena(){
        int aux;
        
        //miles
        if (nList[0] == 1) {denominacion = "mil";}
        if (nList[0] > 1) {denominacion = getDigito(0) + " mil";}
        
        //cientos
        if (nList[1] == 1) {denominacion = denominacion + " ciento";}
        if (nList[1] > 1) {denominacion = denominacion + " " + sCentenares[nList[1]];}
        
        //más de 29
        if (nList[2] > 2) {denominacion = denominacion + " " + sDecenas[nList[2]];}

        //controla los veinti...
        if (nList[2] == 2) {
            if (nList[3] == 0) {
                denominacion = denominacion + " veinte.";
            } else { denominacion = denominacion + " veinti" + getDigito(3); }
        }

        
        //especiales
        if (nList[2] < 2) {
            aux = (nList[2] * 10) + nList[3];
            switch (aux) {
                case 10:
                    denominacion = denominacion + " " + sEspeciales[0];
                    break;
                case 11:
                    denominacion = denominacion + " " + sEspeciales[1];
                    break;
                case 12:
                    denominacion = denominacion + " " + sEspeciales[2];
                    break;
                case 13:
                    denominacion = denominacion + " " + sEspeciales[3];
                    break;
                case 14:
                    denominacion = denominacion + " " + sEspeciales[4];
                    break;
                case 15:
                    denominacion = denominacion + " " + sEspeciales[5];
                    break;
                default:
                    break;
            }
        }
        if ((nList[2] >= 2) && (nList[3] > 0)){denominacion = denominacion + " " + sDecenas[nList[2]];}
        //unidades
        if (nList[3] > 0) {denominacion = denominacion + " y " + getDigito(3); }

        return denominacion;
    }
}