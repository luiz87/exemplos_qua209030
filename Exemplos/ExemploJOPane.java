import javax.swing.JOptionPane;

public class ExemploJOPane {
    
    public static void main(String[] args) {
        // JOptionPane.showMessageDialog(null, "Olá Mundo Java.");
        // Integer.parseInt("2");
        // Float.parseFloat("3");

        String nome = JOptionPane.showInputDialog("Digite seu nome");
        String temp = JOptionPane.showInputDialog("Digite sua idade");  
        int idade = Integer.parseInt(temp);
        String msg = "";

        if (idade >= 75) {
            msg = " você é muito velho.";
        } else {
            msg = " você não tão velho.";
        }
        msg = "Bem vindo, " + nome + msg;
        JOptionPane.showMessageDialog(null, msg, "Boas Vindas", JOptionPane.INFORMATION_MESSAGE);

    }

}
