import javax.swing.JOptionPane;

public class Questao18 {
    // 18. Escreva um programa que leia o valor de 3 ângulos de um triângulo e
    // escreva se o triângulo é Acutângulo, Retângulo
    // ou Obtusângulo. Sendo que:
    // − Triângulo Retângulo: possui um ângulo reto. (igual a 90o)
    // − Triângulo Obtusângulo: possui um ângulo obtuso. (maior que90o)
    // − Triângulo Acutângulo: possui três ângulos agudos. (menor que 90o)

    public static void main(String[] args) {
        int angulo1 = Integer.parseInt(JOptionPane.showInputDialog("Digite ângulo 01!"));
        int angulo2 = Integer.parseInt(JOptionPane.showInputDialog("Digite ângulo 02!"));
        int angulo3 = Integer.parseInt(JOptionPane.showInputDialog("Digite ângulo 03!"));

        String tipoTriangulo = "não identificado";

        if (angulo1 + angulo2 + angulo3 == 180 && angulo1 > 0 && angulo2 > 0 && angulo3 > 0) {
            if (angulo1 == 90 || angulo2 == 90 || angulo3 == 90) {
                tipoTriangulo = "Triângulo Retângulo";
            } else if (angulo1 > 90 || angulo2 > 90 || angulo3 > 90) {
                tipoTriangulo = "Triângulo Obtusângulo";
            } else if (angulo1 < 90 && angulo2 < 90 && angulo3 < 90) {
                tipoTriangulo = "Triângulo Acutângulo";
            }
        }

        JOptionPane.showMessageDialog(null, "O tipo do triângulo é " + tipoTriangulo);
    }
}
