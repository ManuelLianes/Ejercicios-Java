package Capitulo3;

/**
 * PredictorClimatologico
 */
public class PredictorClimatologico {
    int presion, humedad;
    String lluvia, sol, frio;

    void setLluvia(int presion, int humedad){
        if (presion == 1){
            if (humedad == 3){ lluvia = "Muy alta";}
            if (humedad == 2){ lluvia = "Alta";}
            if (humedad == 1){ lluvia = "Media";}
        } else if (presion == 2){
            if (humedad == 2){
                lluvia = "Media";
            } else lluvia = "Baja";
        } else lluvia = "Baja";
    }

    String getLluvia(){
        return lluvia;
    }

    void setSol(int presion, int humedad){
        if (presion == 1){
            if (humedad == 3){ sol = "Baja";}
            if (humedad == 2){ sol = "Media";}
            if (humedad == 1){ sol = "Media";}
        } else if (presion == 2){
            if (humedad == 2){ sol = "Media";
            } else sol = "Alta";
        } else sol = "Alta";
    }

    String getSol(){
        return sol;
    }

    void setFrio(int presion, int humedad){
        if (presion == 1){
            if (humedad == 3){ frio = "Alta";
            } else frio = "Baja";
        } else if (presion == 2){
            if (humedad == 2){ frio = "Media";}
            if (humedad == 3){ frio = "Media";
            } else frio = "Baja";
        } else frio = "Baja";
    }

    String getFrio(){
        return frio;
    }
}