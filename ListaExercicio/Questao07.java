import javax.swing.JOptionPane;

public class Questao07 {
    // 7. Escreva um programa para ler o valor de uma conta e quantos pessoas vão
    // pagar a conta, o sistema vai apresentar
    // quanto cada pessoa vai pagar.
    public static void main(String[] args) {
        float valorConta = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da conta!"));
        int qtPessoas = Integer.parseInt(JOptionPane.showInputDialog("Quantas pessoas vão pagar?"));
        JOptionPane.showMessageDialog(null, "Cada pessoa vai pagar = " + String.format("%.2f", valorConta / qtPessoas));
    }
}
