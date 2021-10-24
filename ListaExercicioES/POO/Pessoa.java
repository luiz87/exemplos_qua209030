import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pessoa {
    private String nome;
    private LocalDate dtNascimento;
    private double altura;

    // get o retorno é sempre o tipo da variável
    // set a entre é sempre o tipo da variável
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(LocalDate dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int idade() {
        DateTimeFormatter formtDtYYYY = DateTimeFormatter.ofPattern("yyyy");
        LocalDate dtAtual = LocalDate.now();
        int anoNascimento = Integer.parseInt(dtNascimento.format(formtDtYYYY));
        int anoAtual = Integer.parseInt(dtAtual.format(formtDtYYYY));
        int idade = anoAtual - anoNascimento;

        DateTimeFormatter formtMMdd = DateTimeFormatter.ofPattern("MMdd");
        int mesDiaNascimento = Integer.parseInt(dtNascimento.format(formtMMdd));
        int mesDiaAtual = Integer.parseInt(dtAtual.format(formtMMdd));;
        
        if(mesDiaNascimento > mesDiaAtual){
            idade = idade - 1;
        }

        return idade;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatoBr = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Nome : " + nome + "\n"+
               "Data de Nascimento : " + formatoBr.format(dtNascimento) + "\n"+
               "Altura : "+ altura + "\n"+
               "Idade : "+ idade();
    }

}
