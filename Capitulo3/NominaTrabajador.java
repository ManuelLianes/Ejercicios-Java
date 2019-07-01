package Capitulo3;

/**
 * NominaTrabajador
 * calculos semanales
 */
public class NominaTrabajador {
    public double salarioBase, salarioNeto, salarioBruto, salarioExtra, salarioMes;
    private double eurosHora, horasSemanales;
    private double jornada = 40;

    void calculaNomina(double precioHora, double horasSemana){
        eurosHora = precioHora;
        horasSemanales = horasSemana;
        setSalarioBase();
        setSalarioExtra();
        setSalarioBruto();
        setSalarioNeto();
        setSalarioMes();
    }

    
    boolean isHorasExtra(){
        if (horasSemanales > jornada) {return  true;}
        else return false;
    }

    boolean isMuchasHorasExtra(){
        if (horasSemanales > 45) { return true;}
        else return false;
    }

    boolean isMilEurista(){
        // Calculo mensual (30 dias)
        if ((salarioBruto / 7) * 30 > 1000) {return true;}
        else return false;
    }

    void setSalarioBase(){
        salarioBase = horasSemanales * eurosHora;
    }

    double getSalarioBase(){return salarioBase;}

    void setSalarioExtra(){
        salarioExtra = 0;
        if (isHorasExtra()){
            if (isMuchasHorasExtra()){
                // de 40 a 45 horas
                salarioExtra = 5 * (eurosHora * 1.5);

                // + de 45 horas
                salarioExtra = salarioExtra + ((horasSemanales - (jornada + 5)) * (eurosHora * 2));
            }
            else salarioExtra = (horasSemanales - jornada) * (eurosHora * 1.5);
        }
    }

    double getSalarioExtra(){return salarioExtra;}

    void setSalarioBruto(){salarioBruto = salarioBase + salarioExtra;}

    double getSalarioBruto(){return salarioBruto;}

    void setSalarioNeto(){
        if (isMilEurista()) {salarioNeto = salarioBruto - (salarioBruto * 0.15);}
        else salarioNeto = salarioBruto - (salarioBruto * 1.10);
    }

    double getSalarioNeto(){return salarioNeto;}

    void setSalarioMes(){
        salarioMes = Math.round((salarioNeto / 7) * 30);
    }

    double getSalarioMes(){ return salarioMes;}
}