public class Leite extends Produto{

    int durabilidadeLeite;

    public Leite (){

    }

    public int getDurabilidadeLeite() {
        return durabilidadeLeite;
    }

    public void setDurabilidadeLeite(int durabilidadeLeite) {
        this.durabilidadeLeite = durabilidadeLeite;
    }

    @Override
    public String toString() {
        return "Leite{" +
                "durabilidadeLeite=" + durabilidadeLeite +
                ", nome='" + nome + '\'' +
                ", preço=" + preço +
                '}';
    }
}
