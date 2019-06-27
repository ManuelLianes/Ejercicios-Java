package Capitulo2;

/**
 * Restaurante
 */
public class Restaurante {
    private int huevos, docenasHuevos;
    private double kilosChorizo;

	public Restaurante(int docenasHuevos, double kilosChorizo){
        this.docenasHuevos = docenasHuevos;
        this.kilosChorizo = kilosChorizo;
    }

    public void addHuevos(int docenasHuevos) {
        this.docenasHuevos = this.docenasHuevos + docenasHuevos;
    }

    void addChorizos(double kilosChorizo){
        this.kilosChorizo = this.kilosChorizo + kilosChorizo;
    }

    void sirvePlato(){
        huevos = huevos - 2;
        kilosChorizo = kilosChorizo - 0.2;
    }

    int getHuevos(){
        return docenasHuevos*12 + huevos;
    }

    double getChorizos(){
        return kilosChorizo;
    }

    int getNumeroPlatos(){
        double platosConHuevos = getHuevos()/2;
        double platosConChorizo = getChorizos()/0.2;
        if (platosConHuevos > platosConChorizo){
            System.out.println("\nFalta chorizo");
            return (int)platosConChorizo;
        } else 
        System.out.println("\nFaltan huevos");
        return (int)platosConHuevos;
    }
}