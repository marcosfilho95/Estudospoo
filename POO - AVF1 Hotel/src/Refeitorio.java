public class Refeitorio {

    int qtdgarçons;
    int qtdmesas;
    int qtdrefeicoes;
    String tiporefeicao;

    public Refeitorio(int qtdgarçons, int qtdmesas, int qtdrefeicoes, String tiporefeicao) {
        this.qtdgarçons = qtdgarçons;
        this.qtdmesas = qtdmesas;
        this.qtdrefeicoes = qtdrefeicoes;
        this.tiporefeicao = tiporefeicao;
    }

    public void temcafeManha(){
        System.out.println("Da direito a cafe da manha");
    }

    public void naotemcafeManha(){
        System.out.println("Nao da direito a cafe da manha");
    }

    @Override
    public String toString() {
        return "Refeitorio{" +
                "qtdgarçons=" + qtdgarçons +
                ", qtdmesas=" + qtdmesas +
                ", qtdrefeicoes=" + qtdrefeicoes +
                ", tiporefeicao='" + tiporefeicao + '\'' +
                '}';
    }
}
