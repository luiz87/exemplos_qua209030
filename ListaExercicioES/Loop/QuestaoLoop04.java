import javax.swing.JOptionPane;

public class QuestaoLoop04 {
    // 4. Escreva um código que receba dois números inteiros e gere os números
    // inteiros que estão no intervalo compreendido por eles.

    public static void main(String[] args) {
        int inicio = Integer.parseInt(JOptionPane.showInputDialog("Digite o número inicial!"));
        int fim = Integer.parseInt(JOptionPane.showInputDialog("Digite o número final!"));

        // correto quando
        if (inicio < fim) {
            JOptionPane.showMessageDialog(null, contagem(inicio, fim));
        } else {
            JOptionPane.showMessageDialog(null, "O início não pode ser maior que o fim.", "Erro", JOptionPane.ERROR_MESSAGE);
            System.out.println(JOptionPane.ERROR_MESSAGE);
        }

    }

    public static String contagem(int inicio, int fim) {
        String texto = "";
        for (int i = inicio; i <= fim; i++) {
            texto += i + ", ";
        }
        return texto;
    }
}
