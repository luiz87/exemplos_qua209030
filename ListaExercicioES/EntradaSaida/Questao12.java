import javax.swing.JOptionPane;

public class Questao12 {
    // 12. Escreva um programa que leia o número de maçãs compradas, calcule e
    // escreva o valor total da compra.(As maçãs
    // custam R$ 0,30 cada se forem compradas menos do que uma dúzia, e R$ 0,25 se
    // forem compradas pelo menos doze.)

    public static void main(String[] args) {
        int qtMacas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de maçãs!"));
        float vlTotal = 0.0f;
        if (qtMacas < 12) {
            // 0.30
            vlTotal = qtMacas * 0.30f;
        } else {
            // 0.25
            vlTotal = qtMacas * 0.25f;

        }
        JOptionPane.showMessageDialog(null, "O valor total é " + vlTotal);
    }
}
