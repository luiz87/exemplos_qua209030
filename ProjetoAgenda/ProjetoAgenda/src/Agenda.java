import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contato> lsContato;

    // Método contrutor da classe, ele vai ser usado no momento que o objeto da classe Agenda for criado.
    public Agenda() {
        lsContato = new ArrayList<>();
    }

    // ações da agenda
    // incluir um novo contato
    public void incluir(Contato c) {
        lsContato.add(c);
    }

    // atualizar um contato
    public void atualizar(int id, Contato c) {
        lsContato.set(id, c);
    }

    // excluir um contato
    public void excluir(int id) {
        lsContato.remove(id);
    }

    // ver lista de contato
    public String verLista() {
        // variavel feita para concater todo o resultado e ser retornada no final
        String texto = "";
        // variavel feita para contar os elemtos do ArrayList e servir como indice dos itens da lista
        int i = 0;
        // laço de repetição feito para mostrar tooodos os itens do ArrayList
        for (Contato c : lsContato) {
            texto += "[" + i + "] Nome:" + c.getNome() + " Fone:" + c.getTelefone() + "\n";
            i++;
        }
        return texto;
    }

}
