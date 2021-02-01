public class Item {
    private String nome;
    private int preco;
    private int qtd;
    private UnidadeVenda unidadeVenda;

    public Item() {
    }

    public Item(String nome, int preco, int qtd, UnidadeVenda unidadeVenda) {
        this.nome = nome;
        this.preco = preco;
        this.qtd = qtd;
        this.unidadeVenda = unidadeVenda;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public UnidadeVenda getUnidadeVenda() {
        return unidadeVenda;
    }

    public void setUnidadeVenda(UnidadeVenda unidadeVenda) {
        this.unidadeVenda = unidadeVenda;
    }

    @Override
    public String toString() {
        return "Item{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", qtd=" + qtd +
                ", unidadeVenda=" + unidadeVenda +
                '}';
    }

    public Integer calcularItem(){
        return preco * qtd;
    }
}
