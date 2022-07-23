public class Cozinha {

    int qtdcozinheiros;
    int qtdfogoes;
    int qtdpratos;

    public Cozinha(int qtdcozinheiros, int qtdfogoes, int qtdpratos) {
        this.qtdcozinheiros = qtdcozinheiros;
        this.qtdfogoes = qtdfogoes;
        this.qtdpratos = qtdpratos;
    }

    public void temCheff(){
        System.out.println("A cozinha possui Cheff");
    }

    public void naotemCheff(){
        System.out.println("A cozinha nao possui Cheff");
    }

    @Override
    public String toString() {
        return "Cozinha{" +
                "qtdcozinheiros=" + qtdcozinheiros +
                ", qtdfogoes=" + qtdfogoes +
                ", qtdpratos=" + qtdpratos +
                '}';
    }
}
