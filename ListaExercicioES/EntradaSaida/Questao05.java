import javax.swing.JOptionPane;

public class Questao05 {
    // 5. Escreva um programa para ler o nome, valor da hora, quantas horas
    // trabalhadas, o sistema vai apresentar o salário.
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome!");
        String aux = JOptionPane.showInputDialog("Digite o valor da hora!");
        float valorHora = Float.parseFloat(aux);
        aux = JOptionPane.showInputDialog("Digite o quantas horas trabalhadas!");
        int quatidadeHoras = Integer.parseInt(aux);
        float resultado = valorHora * quatidadeHoras;
        JOptionPane.showMessageDialog(null, nome + " vair receber = " + resultado);
    }

}
