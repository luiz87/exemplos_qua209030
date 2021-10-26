import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        // Momento da criação do Objeto agenda
        Agenda agenda = new Agenda();
        // Lista dos botões que podem ser escolhidos
        Object[] opcoes = { "Incluir", "Ver Lista", "Excluir", "Alterar", "Sair" };
        // variavel que que guardar qual foi o botão clicado
        int escolha = 0;
        // variavel que guardo o id do contato escolhido
        int id = 0;
        // laço de repetição que tem a sua condição no final do bloco
        do {
            // mostra a janela com as opções e grava na varival escolha o indice do botão
            // escolhido
            escolha = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Sistema", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.WARNING_MESSAGE, null, opcoes, opcoes[1]);
            // switch + case
            // uma estrtura de condição
            // no switch é colocado a variável analisada
            switch (escolha) {
            // no case são colocado as opções que podem ser escolhidas
            // executado um determinado código
            case 0:
                // opção Incluir
                // Necessário criar um novo objeto do tipo Contato toda vez que um novo contato
                // é incluido.
                Contato contato = new Contato();
                contato.setNome(JOptionPane.showInputDialog(null, "Digite o nome do contato:"));
                contato.setTelefone(JOptionPane.showInputDialog(null, "Digite o telefone do contato:"));
                // o objeto agenda esta acessando o método incluir e passando como parametro o
                // objeto contato recem criado a alimentado com os JOPane.
                agenda.incluir(contato);
                break;
            case 1:
                // opção ver lista
                // internamente no método showMessageDialog esta sendo usado o objeto agenda
                // para acessar o método verLista que retorna uma String de todos os contatos
                // gravados até o momento.
                JOptionPane.showMessageDialog(null, agenda.verLista());
                break;
            case 2:
                // opção excluir
                // O id digitado é gravado na variável id
                id = Integer.parseInt(JOptionPane.showInputDialog(null,
                        agenda.verLista() + "Digite o id de quem você deseja excluir."));
                // o objeto agenda acessar o método excluir passando como parâmetro o id
                agenda.excluir(id);
                break;
            case 3:
                // opção alterar
                // O id digitado é gravado na variável id
                id = Integer.parseInt(JOptionPane.showInputDialog(null,
                        agenda.verLista() + "Digite o id de quem você deseja alterar."));
                // necessário criar novo objeto para substituir o objeto anterior
                Contato contatoAlterar = new Contato();
                contatoAlterar.setNome(JOptionPane.showInputDialog(null, "Digite o nome do contato:"));
                contatoAlterar.setTelefone(JOptionPane.showInputDialog(null, "Digite o telefone do contato:"));
                // o objeto agenda acessar o método atualizar passando os parâmetro id e
                // contatoAlterar.
                agenda.atualizar(id, contatoAlterar);
                break;
            default:
                break;
            }
            // só vai sair do laço de repetição se a pessoa escolher a opção Sair = 4
        } while (escolha != 4);

    }
}
