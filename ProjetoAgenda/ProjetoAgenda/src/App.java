import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        // JOptionPane.showMessageDialog(null, "Bem vindo a sua agenda");

        Agenda agenda = new Agenda();
        Object[] opcoes = { "Incluir", "Ver Lista", "Excluir", "Alterar", "Sair" };
        int escolha = 0;
        int id = 0;
        do {
            escolha = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Aviso", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.WARNING_MESSAGE, null, opcoes, opcoes[0]);

            switch (escolha) {
            case 0:
                // opção Incluir
                Contato contato = new Contato();
                contato.setNome(JOptionPane.showInputDialog(null, "Digite o nome do contato:"));
                contato.setTelefone(JOptionPane.showInputDialog(null, "Digite o telefone do contato:"));
                agenda.incluir(contato);
                break;
            case 1:
                // opção ver lista
                JOptionPane.showMessageDialog(null, agenda.verLista());
                break;
            case 2:
                // opção excluir
                id = Integer.parseInt(JOptionPane.showInputDialog(null,
                        agenda.verLista() + "Digite o id de quem você deseja excluir."));
                agenda.excluir(id);
                break;
            case 3:
                // opção excluir
                id = Integer.parseInt(JOptionPane.showInputDialog(null,
                        agenda.verLista() + "Digite o id de quem você deseja alterar."));
                Contato contatoAlterar = new Contato();
                contatoAlterar.setNome(JOptionPane.showInputDialog(null, "Digite o nome do contato:"));
                contatoAlterar.setTelefone(JOptionPane.showInputDialog(null, "Digite o telefone do contato:"));
                agenda.atualizar(id, contatoAlterar);
                break;
            default:
                break;
            }
        } while (escolha != 4);

    }
}
