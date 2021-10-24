import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class QuestaoPOO01 {
    public static void main(String[] args) {
        Pessoa objPessoa = new Pessoa();
        objPessoa.setNome(JOptionPane.showInputDialog(null, "Digite seu nome:"));

        // definiar a formatação da data
        DateTimeFormatter formatoBr = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        // guarda a data de nascimento digitado pelo usuário
        String dtNacimento = JOptionPane.showInputDialog(null, "Digite sua data de nascimento:");
        // converter de String para LocalData usando uma formatação pré definida
        // popular o objeto com a data informada
        objPessoa.setDtNascimento(LocalDate.parse(dtNacimento, formatoBr));
        objPessoa.setAltura(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite sua Altura:")));

        JOptionPane.showMessageDialog(null, objPessoa.toString());
    }
}
