public abstract class Peixe {
    protected String nome;
    protected String raçapeixe;

    public void tipoPeixe(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaçapeixe() {
        return raçapeixe;
    }

    public void setRaçapeixe(String raçapeixe) {
        this.raçapeixe = raçapeixe;
    }

    @Override
    public String toString() {
        return "Peixe{" +
                "nome='" + nome + '\'' +
                ", raçapeixe='" + raçapeixe + '\'' +
                '}';
    }
}

