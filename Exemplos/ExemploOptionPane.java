import javax.swing.JOptionPane;

public class ExemploOptionPane {
    public static void main(String[] args) {
        int opcao = JOptionPane.showConfirmDialog(null, "Você deseja continuar?", "Confirme",
                JOptionPane.YES_NO_OPTION);

        if (opcao == 0) {
            JOptionPane.showMessageDialog(null, "Bem vindo", "Alerta", JOptionPane.INFORMATION_MESSAGE);
            escolherLinguagem();
            escolherBebida();
        } else {
            JOptionPane.showMessageDialog(null, "Até Logo", "Alerta", JOptionPane.ERROR_MESSAGE);
        }

    }

    public static void escolherLinguagem() {
        Object[] lsLinguagens = { "Java", "PHP", "Pascal", "Cobol", "Fortan" };
        int linguagem = JOptionPane.showOptionDialog(null, "Qual dessa linguagens de programação você prefere?",
                "Escolha uma linguagem", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, lsLinguagens,
                lsLinguagens[2]);

        String mensagem = "Opção escolhida \"" + lsLinguagens[linguagem] + "\" ";
        switch (linguagem) {
            case 0:
                mensagem += "boa escolha.";
                break;
            default:
                mensagem += "tente outra.";
                break;
        }

        JOptionPane.showMessageDialog(null, mensagem);

    }

    public static void escolherBebida() {
        Object[] lsBebedidas = { "Água", "Cerveja", "Refrigerante", "Suco" };
        Object bebida = JOptionPane.showInputDialog(null, "Qual dessas bebidas é a sua predileta?",
                "Escolha uma bebida", JOptionPane.INFORMATION_MESSAGE, null, lsBebedidas, lsBebedidas[0]);
        JOptionPane.showMessageDialog(null, "A bebida escolhida foi: " + bebida);
    }
}
