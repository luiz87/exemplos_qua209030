import javax.swing.JOptionPane;

public class Questao14 {
    // 14. Escreva um programa para ler 3 valores inteiros (considere que não serão
    // lidos valores iguais) e escrevê-los em ordem
    // crescente.

    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número!"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número!"));
        int n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número!"));

        int aux = 0;
        if(n1 > n2){
            // sequencia para trocar os valores entre 2 variáveis
            aux = n1;
            n1 = n2;
            n2 = aux;
        }

        if(n1 > n3){
            // sequencia para trocar os valores entre 2 variáveis
            aux = n1;
            n1 = n3;
            n3 = aux;
        }

        if(n2 > n3){
            // sequencia para trocar os valores entre 2 variáveis
            aux = n2;
            n2 = n3;
            n3 = aux;
        }

        JOptionPane.showMessageDialog(null, "Ordenado :" + n1 + " - " + n2 + " - " + n3);
    }
}
