public class Produto {
    private final String nome;
    private final int preco;
    private final int quantidade;

    public Produto(String nome, int preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public int getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    int quantInEstoque() {
        return getPreco() * getQuantidade();
    }

    void exibirInfo() {
        System.out.println("Nome: " + getNome() + "\nPreço: " + getPreco() + "\nQuantidade: " + getQuantidade() + "\nValor total em estoque: " + quantInEstoque());
    }

    public static void main(String[] args) {
        Produto p1 = new Produto("Coca-cola", 10, 5);
        p1.exibirInfo();
    }
}
