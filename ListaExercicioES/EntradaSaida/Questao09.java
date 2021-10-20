import javax.swing.JOptionPane;

public class Questao09 {
    // 9. Escreva um programa para ler 2 notas, o sistema vai apresentar a média
    // final.
    public static void main(String[] args) {
        float n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota!"));
        float n2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota!"));
        float media = (n1 + n2) / 2;
        JOptionPane.showMessageDialog(null, "Média final = " + String.format("%.2f", media));
    }
}
