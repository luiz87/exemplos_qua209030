import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contato> lsContato;

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
        String texto = "";
        int i = 0;
        for (Contato c : lsContato) {
            texto += "[" + i + "] Nome:" + c.getNome() + " Fone:" + c.getTelefone() + "\n";
            i++;
        }
        return texto;
    }

}
