package Model;

public class FormaPagamento {

    private int numParcelas;
    private String tipo;

    public FormaPagamento(int numParcelas, String tipo) {
        this.numParcelas = numParcelas;
        this.tipo = tipo;
    }

    public FormaPagamento() {
    }

    public int getNumParcelas() {
        return numParcelas;
    }

    public void setNumParcelas(int numParcelas) {
        this.numParcelas = numParcelas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
