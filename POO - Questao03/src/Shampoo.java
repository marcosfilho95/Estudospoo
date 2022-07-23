public class Shampoo extends Produto{

    int irritabilidadePele;

    public Shampoo (){

    }

    public int getIrritabilidadePele() {
        return irritabilidadePele;
    }

    public void setIrritabilidadePele(int irritabilidadePele) {
        this.irritabilidadePele = irritabilidadePele;
    }

    @Override
    public String toString() {
        return "Shampoo{" +
                "irritabilidadePele=" + irritabilidadePele +
                ", nome='" + nome + '\'' +
                ", preço=" + preço +
                '}';
    }
}
