import javax.swing.JOptionPane;

public class QuestaoLoop06 {
    // 6. Escreva um código que leia da entrada de um número inteiro e retorne na
    // saída uma mensagem indicando se o número lido é ou não um número primo.

    public static void main(String[] args) {

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número!"));
        String texto = "É um numero primo";
        for (int i = 2; i < numero; i++) {
            int resultado = numero % i;
            if (resultado == 0) {
                texto = "Não é um numero primo";
                break;
            }
            System.out.println(i);
        }
        JOptionPane.showMessageDialog(null, texto);

    }
}
