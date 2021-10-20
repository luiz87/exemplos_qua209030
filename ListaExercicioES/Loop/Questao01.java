public class Questao01 {
    // 1. Escreva um código que imprima na tela apenas os números ímpares entre 1 e
    // 50.
    public static void main(String[] args) {
        // System.out.println();
        // JOptionPane.showMessageDialog(); unico
        // JOptionPane.showMessageDialog(); multiplo

        int i = 1;
        do {
            if (i % 2 == 1) {
                System.out.println(i);
            }
            i++;
        } while (i <= 50);
    }
}
