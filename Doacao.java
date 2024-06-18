import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Doacao {
    private String tipo;
    private int quantidade;
    private Date data;

    // Construtor
    public Doacao(String tipo, int quantidade, Date data) {
        this.tipo = tipo;
        this.quantidade = quantidade;
        this.data = data;
    }

    // Getters e Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}

class GerenciadorDoacoes {
    private List<Doacao> listaDeDoacoes;

    // Construtor
    public GerenciadorDoacoes() {
        this.listaDeDoacoes = new ArrayList<>();
    }

    // Adicionar doação
    public void adicionarDoacao(Doacao doacao) {
        listaDeDoacoes.add(doacao);
    }

    // Calcular total de doações
    public int calcularTotal() {
        int total = 0;
        for (Doacao doacao : listaDeDoacoes) {
            total += doacao.getQuantidade();
        }
        return total;
    }
}

public class Main {
    public static void main(String[] args) {
        // Criando o gerenciador de doações
        GerenciadorDoacoes gerenciador = new GerenciadorDoacoes();

        // Adicionando doações
        gerenciador.adicionarDoacao(new Doacao("Alimentos", 10, new Date()));
        gerenciador.adicionarDoacao(new Doacao("Roupas", 5, new Date()));

        // Calculando e imprimindo o total de doações
        System.out.println("Total de doações: " + gerenciador.calcularTotal());
    }
}
