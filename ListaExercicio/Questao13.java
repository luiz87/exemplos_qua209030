import javax.swing.JOptionPane;

public class Questao13 {
    // 13. Escreva um programa para ler 3 valores inteiros e escrever o maior deles.

    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número!"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número!"));
        int n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número!"));
        
        int maior = 0;
        
        if(n1 >= n2 && n1 >= n3){
            maior = n1;
        }else if (n2 >= n1 && n2 >= n3){
            maior = n2;
        }else {
            maior = n3;
        }

        JOptionPane.showMessageDialog(null, "O valor maior é " + maior);
    }
}
