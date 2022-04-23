package Model;
import Controller.ControlProduto;

public class Produto {
    private String nome;
    private Double preco;
    private String marca;
    private int estoque;
    private int estoqueMinimo;

    public Produto() {
    }

    public Produto(String nome, Double preco, String marca, int estoque, int estoqueMinimo) {
        this.nome = nome;
        this.preco = preco;
        this.marca = marca;
        this.estoque = estoque;
        this.estoqueMinimo = estoqueMinimo;
    }

    public String checarEstoque(){
        return "";
    }

    public String pedidoReposicao(){
        return "";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public int getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public void setEstoqueMinimo(int estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
    }
}
