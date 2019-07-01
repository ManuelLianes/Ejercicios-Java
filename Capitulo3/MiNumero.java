package Capitulo3;

/**
 * MiNumero
 * varios metodos para futuros ejercicios
 */
public class MiNumero {
    public int n;

    public void setNumero(int n){
        this.n = n;
    }

    public int getNumero(){
        return this.n;
    }

    void addNumero(int n) {
        this.n = this.n + n;
    }

    boolean isPar(){
        if(n % 2 == 0){return true;}
        return false;
    }

    boolean isImpar(){
        if(n % 2 != 0){return true;}
        return false;
    }

    boolean isMayor(int limite){
        if(this.n > limite) {return true;}
        return false;
    }

    boolean isMenor(int limite){
        if(this.n < limite) {return true;}
        return false;
    }

    void mostrarPares(int limite){
        if(this.n < limite){
            while (this.n < limite) {
                System.out.print(this.n + ", ");
                this.addNumero(2);
            }
        }
        System.out.println("");
    }

    void mostrarImpares(int limite){
        this.addNumero(1);
        if(this.n < limite){
            while (this.n < limite) {
                System.out.print(this.n + ", ");
                this.addNumero(2);
            }
        }
        System.out.println("");
    }

    boolean isPrimo(){
        boolean primo = true;
        int divisor = 2;

        while ((primo) && (n > divisor)){
            if (n % divisor == 0) {
                primo = false;
            }
            divisor++;
        }
        return primo;
    }
    
    boolean isOmirps(){
        boolean flag = false;
        int resto;
        int invertido = 0;
        int aux = n;

        while (n > 0) {
            resto = n % 10;
            invertido = invertido * 10 + resto;
            n = n / 10;
        }
        
        n = invertido;
        if (this.isPrimo()) {flag = true; }
        n = aux;
        return flag;
    }
}