public class Produto { // Classe
    public String nome;
    public double preco; // Atributos
    public int quantidade;

    public void addProduto(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removeProduto(int quantidade) {
        this.quantidade -= quantidade;
    }

    public double valorTotalEstoque() {
        return preco * quantidade;
    }

    public String toString() {
        return "nome do produto: " + nome +
                " \n preço do produto: R$" + preco +
                String.format("%2f", preco)
                + " \n Quantidade: " + quantidade
                + "\n unidade.s "
                + "\n Total em estoque R$"
                + String.format("%2f", valorTotalEstoque());
    }

}
