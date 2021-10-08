import javax.swing.JOptionPane;

public class ExemploRepetica {
    public static void main(String[] args) {
        // jogoPim();
        // contarNumeros();
        // repetirSenai(Integer.parseInt(JOptionPane.showInputDialog("Digite quantas
        // vezes SENAI se repetira")));
        // String mensagem = JOptionPane.showInputDialog("Digite uma mensagem para ser
        // repetida");
        // int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite quantas
        // a mensagem vai se repetir"));
        // repetirMensagem(quantidade, mensagem);

        // String texto = olaMetodo();
        // System.out.println(texto);
        // System.out.println(olaMetodo());

        System.out.println(parImpar(7));
        System.out.println(parImpar(8));
    }

    // fazer um método que recebe um número e diz se ele é par ou impar
    public static String parImpar(int n) {
        if ((n % 2) == 0) {
            return "Par";
        }
        return "Impar";
    }

    public static String olaMetodo() {
        return "Oi, eu sou um metodo que não recebe nada, mas te dou essa mensagem como retorno.";
    }

    // criamos os metodos
    private static void jogoPim() {
        int n = 1;
        // desafio..// 1,2,3,pim,// 5,6,7,pim,// 9,10,11,pim
        n = 1;
        while (n <= 50) {
            if ((n % 4) != 0) {
                System.out.println(n);
            } else {
                System.out.println("pim");
            }
            n++;
        }
    }

    // criamos os metodos
    public static void contarNumeros() {
        // meta, escrever algoritmo que vai mostrar os números de 1 até 50
        int n = 1;
        while (n <= 50) {
            // n++ -> n = n + 1
            System.out.println(n++);
        }
    }

    // modificar o Método repetirSenai para repetir uma quantidade flexivel
    // criamos os metodos
    public static void repetirSenai(int quantidade) {
        // meta, escrever a palavra SENAI 20x
        String texto = "";
        int n = 1;
        while (n <= quantidade) {
            // dessa forma a janela vai aparecer quantidadeX
            // JOptionPane.showMessageDialog(null,"SENAI");
            texto = texto + "SENAI\n";
            n++;
        }
        JOptionPane.showMessageDialog(null, texto);
    }

    // modificar o Método repetirMensagem para repetir uma quantidade flexivel e uma
    // mensagem flexivel
    public static void repetirMensagem(int quantidade, String mensagem) {
        // meta, escrever a palavra SENAI 20x
        String texto = "";
        int n = 1;
        while (n <= quantidade) {
            // dessa forma a janela vai aparecer quantidadeX
            texto = texto + mensagem + "\n";
            n++;
        }
        JOptionPane.showMessageDialog(null, texto);
    }
}