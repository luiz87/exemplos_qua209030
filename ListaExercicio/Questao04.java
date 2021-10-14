import javax.swing.JOptionPane;

public class Questao04 {
    // 4. Escreva um programa para ler 2 números e apresentar o resultado nas 4
    // operações matemáticas.
    public static void main(String[] args) {
        String aux = JOptionPane.showInputDialog("Digite um número!");
        int n1 = Integer.parseInt(aux);
        aux = JOptionPane.showInputDialog("Digite outro número!");
        int n2 = Integer.parseInt(aux);
        JOptionPane.showMessageDialog(null,
                n1 + " + " + n2 + " = " + (n1 + n2) + "\n" + 
                n1 + " - " + n2 + " = " + (n1 - n2) + "\n" + 
                n1 + " * " + n2 + " = " + (n1 * n2) + "\n" + 
                n1 + " / " + n2 + " = " + (n1 / n2));
    }

}
