package Capitulo3;

/**
 * Poligos
 */
public class Poligonos {

    int nLados;
    double longitud, apotema;
    double perimetro, area;
    String denominacion;

    void setPerimetro(){
        this.perimetro = nLados * longitud;
    }
    double getPerimetro(){
        return perimetro;
    }

    void setArea(){
        this.area = (perimetro * apotema) / 2;
    }
    double getArea(){
        return area;
    }

    void setDenominacion(){
        switch (nLados) {
            case 3:
                denominacion = "Triángulo equilátero";
                break;
            case 4:
                denominacion = "Cuadrlátero";
                break;
            case 5:
                denominacion = "Pentágono";
                break;
            case 6:
                denominacion = "Hexágono";
                break;
            case 7:
                denominacion = "Heptágono";
                break;
            case 8:
                denominacion = "Octágono";
                break;
            case 9:
                denominacion = "Eneágono";
                break;
            case 10:
                denominacion = "Decágono";
                break;
            case 11:
                denominacion = "Undecágono";
                break;
            case 12:
                denominacion = "Doceágono";
                break;
            default:
                denominacion = "Número de lados incorrecto.";
                break;
        }
    }
    String getDenominacion(){
        return denominacion;
    }
}