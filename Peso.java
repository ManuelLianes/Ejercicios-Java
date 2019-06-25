package ejercicios;

/**
 * Peso
 */
public class Peso {
    double peso = 0; // expresado en gramos "gr"

    // convierte a gramos la masa segun en que unidad se exprese
    Peso(double masa, String unidad){
        if (unidad == "gr") peso = masa;
        if (unidad == "oz") peso = masa * 28.35;
        if (unidad == "kg") peso = masa * 1000;
        if (unidad == "lb") peso = masa * 453.592;
    }

    double getGramos(){
        return peso;
    }

    double getOnzas(){
        return peso / 28.35;
    }

    double getKilos(){
        return peso / 1000;
    }

    double getLibras(){
        return peso / 453.592;
    }
}