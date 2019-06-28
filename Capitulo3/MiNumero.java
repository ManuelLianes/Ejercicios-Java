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
}