package Model;
import Controller.ControlCliente;

public class Cliente extends Pessoa{

    private String telefone;
    private  String endereco;
    private String senha;

    public Cliente(String nome, String telefone, String endereco, String senha) {
        super(nome);
        this.telefone = telefone;
        this.endereco = endereco;
        this.senha = senha;
    }

    public Cliente(String nome) {
        super(nome);
    }

    public Cliente() {
    }

    public String gerarSenha(){
        return "";
    }

}


