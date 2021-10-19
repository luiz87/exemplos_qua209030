import javax.swing.JOptionPane;

public class Questao16 {
    // 16. Escreva um programa para ler o número de lados de um polígono regular e a
    // medida do lado (em cm). Calcular e
    // imprimir o seguinte:
    // − Se o número de lados for igual a 3 escrever TRIÂNGULO e o valor da área
    // − Se o número de lados for igual a 4 escrever QUADRADO e o valor da sua área.
    // − Se o número de lados for igual a 5 escrever PENTÁGONO.
    // − Se o número de lados seja inferior a 3 escrever NÃO É UM POLÍGONO.
    // − Se o número de lados seja superior a 5 escrever POLÍGONO NÃO IDENTIFICADO.

    public static void main(String[] args) {
        int qtLados = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantide de lados!"));
        int cm = Integer.parseInt(JOptionPane.showInputDialog("Digite a medida em CM!"));
        String tpPoligono = "";
        float area = 0;
        if(qtLados == 3){
            tpPoligono = "TRIÂNGULO";
            float metade = cm/2f;
            double calc = Math.sqrt(cm * cm) - Math.sqrt(metade * metade);
            tpPoligono += " "+calc;
        }else if(qtLados == 4){
            tpPoligono = "QUADRADO";
            area = cm * cm;
            tpPoligono += " "+area;
        }else if(qtLados == 5){
            tpPoligono = "PENTÁGONO";
        }else if(qtLados < 3){
            tpPoligono = "NÃO É UM POLÍGONO";
        }else {
            tpPoligono = "POLÍGONO NÃO IDENTIFICADO";
        }

        JOptionPane.showMessageDialog(null, tpPoligono);
    }
}
