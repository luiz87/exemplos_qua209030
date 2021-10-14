import javax.swing.JOptionPane;

public class Questao10 {
    // 10. Escreva um programa para ler o ano de nascimento de uma pessoa e escrever
    // uma mensagem que diga se ela poderá
    // ou não votar este ano (não é necessário considerar o mês em que ela nasceu).
    public static void main(String[] args) {
        Integer anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite seu ano de nascimento!"));
        int idade = 2021 - anoNascimento;
        String msg = "";
        if (idade >= 16) {
            msg = "Legal você pode votar esse ano.";
        } else {
            msg = "Que pena você NÃO pode votar esse ano.";
        }
        JOptionPane.showMessageDialog(null, msg);
    }
}
