import javax.swing.JOptionPane;

public class Questao06 {
    // 6. Escreva um programa para ler o valor de um jantar, o sistema vai
    // apresentar a taxa do garçom 10% e também o valor
    // final total = (valor refeição) + 10%.
    public static void main(String[] args) {
        String aux = JOptionPane.showInputDialog("Digite o valor do jantar!");
        double valorJantar = Double.parseDouble(aux);
        float valorGorjeta = (float) (valorJantar * 0.1d);
        double resultado = valorJantar + valorGorjeta;
        JOptionPane.showMessageDialog(null,
                "Taxa do garçom = " + valorGorjeta + "\n Valor final = " + String.format("%.2f", resultado));
    }
}

// 8. Escreva um programa para ler o valor de um produto, o sistema vai
// apresentar 2 opções para pagamento, o valor à
// vista com 10% de desconto, ou o valor em 3x sem juros.
// 9. Escreva um programa para ler 2 notas, o sistema vai apresentar a média
// final.

// 11. Escreva um programa que verifique a validade de uma senha fornecida pelo
// usuário. A senha válida é o número 1234.
// Devem ser impressas as seguintes mensagens:
// - ACESSO PERMITIDO caso a senha seja válida.
// - ACESSO NEGADO caso a senha seja inválida.