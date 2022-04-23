package Model;
import Controller.ControlPedido;

public class Pedido {
    private Produto produto;
    private Atendente atendente;
    private Cliente cliente;
    private double valorTotal;

    public Pedido() {
    }

    public Pedido(Produto produto, Atendente atendente, Cliente cliente, double valorTotal) {
        this.produto = produto;
        this.atendente = atendente;
        this.cliente = cliente;
        this.valorTotal = valorTotal;
    }

    public void cancelarPedido(){

    }

    public void cancelarProduto(){

    }

    public void gerarRelatorio(){

    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Atendente getAtendente() {
        return atendente;
    }

    public void setAtendente(Atendente atendente) {
        this.atendente = atendente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
