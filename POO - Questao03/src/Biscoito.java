public class Biscoito extends Produto {
    int componentesCancerigenos;

    public Biscoito (){

    }

    public int getComponentesCancerigenos() {
        return componentesCancerigenos;
    }

    public void setComponentesCancerigenos(int componentesCancerigenos) {
        this.componentesCancerigenos = componentesCancerigenos;
    }

    @Override
    public String toString() {
        return "Biscoito{" +
                "componentesCancerigenos=" + componentesCancerigenos +
                ", nome='" + nome + '\'' +
                ", preço=" + preço +
                '}';
    }
}
