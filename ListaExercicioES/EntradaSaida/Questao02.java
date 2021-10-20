import javax.swing.JOptionPane;

public class Questao02 {
    // 2. Escreva um programa para ler um número e o sistema vai mostra os números
    // vizinhos,
    // o anterior e o próximo número.
    public static void main(String[] args) {
        String aux = JOptionPane.showInputDialog("Digite um número!");
        int n = Integer.parseInt(aux);
        JOptionPane.showMessageDialog(null, (n - 1) + " - " + (n + 1));
    }
}
