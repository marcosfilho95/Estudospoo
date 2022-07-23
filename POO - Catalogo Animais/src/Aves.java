public abstract class Aves {
    protected String nome;
    protected String raçaAve;

    public Aves(String nome, String raçaAve) {
        this.nome = nome;
        this.raçaAve = raçaAve;
    }

    public abstract void TamanhoBico();
    public abstract void Falar();

    public abstract void Voar();

    public abstract void Penas();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaçaAve() {
        return raçaAve;
    }

    public void setRaçaAve(String raçaAve) {
        this.raçaAve = raçaAve;
    }

}
