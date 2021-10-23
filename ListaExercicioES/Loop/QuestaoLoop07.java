import javax.swing.JOptionPane;

public class QuestaoLoop07 {
    // 7. Escreva um código para permitir o acesso com uma Palavra de acesso:
    // Entrada > "Digite a palavra de acesso"
    // Saída > "Permissão: ??"
    // // condições
    // // se palavra digitada igual a Java-2021 Permissão: aprovada
    // // se palavra digitada diferente de Java-2021 Permissão: Tente novamente N
    // tentativas
    // // limitar em 5 tentativas
    // >> use o método equals

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            String senha = JOptionPane.showInputDialog("Digite a palavra de acesso!");
            if (senha.equals("Java-2021")) {
                JOptionPane.showMessageDialog(null, "Permissão: aprovada");
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Tente novamente " + i + " tentativas");
            }
        }

    }
}
