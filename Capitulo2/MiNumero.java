package Capitulo2;

/**
 * MiNumero
 */
public class MiNumero {
    private int n;
    
	public MiNumero(){
        this.n = 0;
    }

    public MiNumero(int n){
        this.n = n;
    }

    public void cambiaNumero(int n){
        this.n = n;
    }

    public void suma(int n){
        this.n = this.n + n;
    }

    public void resta(int n){
        this.n = this.n - n;
    }

    public int getValor(){
        return this.n;
    }

    public int getDoble(){
        return this.n * 2;
    }

    public int getTriple(){
        return this.n * 3;
    }

    public int getCuadruple(){
        return this.n * 4;
    }
}