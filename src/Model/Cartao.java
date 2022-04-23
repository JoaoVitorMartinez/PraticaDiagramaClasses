package Model;

public class Cartao {
    private String bandeira;
    private String numCartao;

    public Cartao(String bandeira, String numCartao) {
        this.bandeira = bandeira;
        this.numCartao = numCartao;
    }

    public Cartao() {
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public String getNumCartao() {
        return numCartao;
    }

    public void setNumCartao(String numCartao) {
        this.numCartao = numCartao;
    }
}
