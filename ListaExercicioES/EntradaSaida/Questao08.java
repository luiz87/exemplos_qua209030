import javax.swing.JOptionPane;

public class Questao08 {
    // 8. Escreva um programa para ler o valor de um produto, o sistema vai
    // apresentar 2 opções para pagamento, o valor à
    // vista com 10% de desconto, ou o valor em 3x sem juros.
    public static void main(String[] args) {
        float valorProduto = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do produto!"));
        float valorDesconto = valorProduto * 0.9f;
        float valarParcela = valorProduto / 3;
        JOptionPane.showMessageDialog(null, "Opções de pagamento:"+
                                            "\nCom desconto = "+String.format("%.2f", valorDesconto)+
                                            "\nParcelado 3x = "+String.format("%.2f", valarParcela));
    }
}
