package Capitulo3;

/**
 * Loteria
 */
public class Loteria {
    public static void main(String[] args) {
        int[] boleto = new int[6];
        
        System.out.print("Combinación generada: ");
        for (int i = 0; i < 6; i++) {
            boleto[i] = (int) (Math.random() * 100);
            if (boleto[i] > 50) { i--;} // Valida el numero
            else if(i < 5) {System.out.print(boleto[i] + ", "); } // determina y poner o no la ","
            else System.out.println(boleto[i]);
        }
        System.out.println("\n\n");
    }
}