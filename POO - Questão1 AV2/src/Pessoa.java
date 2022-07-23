public class Pessoa {
    String nome;
    String endereço;
    String telefone;

    public Pessoa() {

    }

    public Pessoa(String nome, String endereço) {
        this.nome = nome;
        this.endereço = endereço;
    }

    public Pessoa(String nome, String endereço, String telefone) {
        this.nome = nome;
        this.endereço = endereço;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", endereço='" + endereço + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
