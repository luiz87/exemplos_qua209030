
// Classe Contato serve como uma estrutura para os objetos serem criados. 
public class Contato {

    // Os atributos foram definidos como privado por causa do encapsulamento pra ter mais controle sobre o acesso desses valores
    private String nome;
    private String telefone;

    // Método get é responsável em retornar o valor do atributo 
    // sempre: tem o mesmo tipo de retorno que o atributo foi definico
    // nunca: tem parâmetro de entrada
    public String getNome() {
        return nome;
    }

    // Método set é responsável por alterar o valor do atributo
    // sempre: tem parâmetro de entrada igual ao tipo do tributo 
    // nunca: tem valor de retorno(sempre void)
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
