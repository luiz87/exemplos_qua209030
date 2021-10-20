import javax.swing.JOptionPane;

public class Questao11 {
    // 11. Escreva um programa que verifique a validade de uma senha fornecida pelo
    // usuário. A senha válida é o número 1234.
    // Devem ser impressas as seguintes mensagens:
    // - ACESSO PERMITIDO caso a senha seja válida.
    // - ACESSO NEGADO caso a senha seja inválida.
    public static void main(String[] args) {
        int senha = Integer.parseInt(JOptionPane.showInputDialog("Digite a senha!"));
        
        String msg = "";
        if (senha == 1234) {
            msg = "ACESSO PERMITIDO";
        } else {
            msg = "ACESSO NEGADO";
        }
        JOptionPane.showMessageDialog(null, msg);
    }
}
