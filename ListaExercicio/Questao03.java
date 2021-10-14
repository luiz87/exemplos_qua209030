import javax.swing.JOptionPane;

public class Questao03 {
    // 3. Escreva um programa para ler um nome digitado e mostrar a mensagem "Olá
    // <nome-digitado>".

    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite o seu nome!");
        JOptionPane.showMessageDialog(null, "Olá - " + nome);
    }

}
