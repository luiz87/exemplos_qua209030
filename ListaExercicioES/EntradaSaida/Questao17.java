import javax.swing.JOptionPane;

public class Questao17 {
    // 17. Escreva um programa que leia as medidas dos lados de um triângulo e
    // escreva se ele é Equilátero, Isósceles ou
    // Escaleno. Sendo que:
    // − Triângulo Equilátero: possui os 3 lados iguais.
    // − Triângulo Isóscele: possui 2 lados iguais.
    // − Triângulo Escaleno: possui 3 lados diferentes.
    public static void main(String[] args) {
        int lado1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o lado 1"));
        int lado2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o lado 2"));
        int lado3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o lado 3"));
        String tipoTriangulo = "";

        if(lado1 == 0 || lado2 == 0 || lado3 == 0){
            tipoTriangulo = " não identificado";
        } else if (lado1 == lado2 && lado1 == lado3) {
            tipoTriangulo = " Equilátero";
        } else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
            tipoTriangulo = " Escaleno";
        } else {
            tipoTriangulo = " Isóscele";
        }

        JOptionPane.showMessageDialog(null, "O tipo do triangulo é:"+tipoTriangulo);

    }
}
