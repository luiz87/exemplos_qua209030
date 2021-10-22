import javax.swing.JOptionPane;

public class QuestaoLoop03 {
    // 3. Escreva um código que pergunte um número ao usuário, e mostre sua tabuada (de 1 até 10).

    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número!"));
        JOptionPane.showMessageDialog(null, calTabuada(n));

    }

    public static String calTabuada(int numero){
        String texto= "";
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            // Opção do resultado de janela em janela
            //JOptionPane.showMessageDialog(null, numero + " x " + i + " = " + resultado);
            // opção pra concatenar todos os resultado em uma string pra mostrar tudo em uma janela posteriormente
            texto += numero + " x " + i + " = " + resultado + "\n";
        }
        return texto;
    }
}
