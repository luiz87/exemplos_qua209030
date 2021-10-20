import javax.swing.JOptionPane;

public class Questao15 {
    // 15. Tendo como entrada a altura e o sexo (codificado da seguinte forma:
    // 1:feminino 2:masculino) de uma pessoa, construa
    // um programa que calcule e imprima seu peso ideal, utilizando as seguintes
    // Fórmulas:
    // - para homens: (72.7 * Altura) – 58
    // - para mulheres: (62.1 * Altura) – 44.7

    public static void main(String[] args) {
        int sexo = Integer.parseInt(JOptionPane.showInputDialog("Digite 1:feminino 2:masculino"));
        float altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura:"));
        float pesoIdeal = 0;
        String msg = "O peso ideal é ";
        if(sexo == 1){
            pesoIdeal = (62.1f * altura) - 44.7f;
            msg += String.format("%.2f", pesoIdeal);
        }else if(sexo == 2){
            pesoIdeal = (72.7f * altura) - 58;
            msg += String.format("%.2f", pesoIdeal);
        }else{
            msg = "Sexo não identificado";
        }

        JOptionPane.showMessageDialog(null, msg);
    }
}
