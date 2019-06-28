package Capitulo3;

/**
 * ComparaTresTest
 */
public class ComparaTresTest {

    public static void main(String[] args) {
        ComparaTres n = new ComparaTres();
        n.comparar(1, 2, 3);
        n.comparar(-1, -2, -3);
        n.comparar(3, 2, 1);
        n.comparar(-3, -2, -1);
        n.comparar(2, 3, 1);
        n.comparar(-2, -3, -1);
    }
}