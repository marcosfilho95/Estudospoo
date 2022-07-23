public class Fornecedor extends Pessoa {

    int valorCredito;
    int valorDivida;

    public Fornecedor(){

    }

    public void obterSaldo(Fornecedor f1){
        int saldo = valorCredito - valorDivida;
        System.out.println("O saldo e de: "+saldo);
    }

    public int getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(int valorCredito) {
        this.valorCredito = valorCredito;
    }

    public int getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(int valorDivida) {
        this.valorDivida = valorDivida;
    }

    @Override
    public String toString() {
        return "Fornecedor{" +
                "valorDivida=" + valorDivida +
                ", nome='" + nome + '\'' +
                ", endereço='" + endereço + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
