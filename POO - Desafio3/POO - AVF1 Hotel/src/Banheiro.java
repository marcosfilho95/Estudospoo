public class Banheiro {
    int qtdbanheirosrec;
    int qtdbanheirosquart;
    int qtdbanheirochuv;
    String tipobanheiro;

    public Banheiro(int qtdbanheirosrec, int qtdbanheirosquart, String tipbanhei, int qtdbanheirochuv) {
        this.qtdbanheirosrec = qtdbanheirosrec;
        this.qtdbanheirosquart = qtdbanheirosquart;
        this.tipobanheiro = tipobanheiro;
        this.qtdbanheirochuv = qtdbanheirochuv;
    }

    public void temChuveiro(){
        System.out.println("O banheiro tem chuveiro");
    }

    public void naotemChuveiro(){
        System.out.println("O banheiro nao tem chuveiro");
    }

    @Override
    public String toString() {
        return "Banheiro{" +
                "qtdbanheirosrec=" + qtdbanheirosrec +
                ", qtdbanheirosquart=" + qtdbanheirosquart +
                ", qtdbanheirochuv=" + qtdbanheirochuv +
                ", tipobanheiro='" + tipobanheiro + '\'' +
                '}';
    }

}
