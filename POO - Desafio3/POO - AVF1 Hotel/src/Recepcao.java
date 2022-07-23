public class Recepcao {

     int qtdrecepcionista;
     double precestadia;
     int qtdseguranca;
     int qtdcadeirasrec;

    public Recepcao(int qtdrecepcionista, double precestadia, int qtdseguranca, int qtdcadeirasrec) {
        this.qtdrecepcionista = qtdrecepcionista;
        this.precestadia = precestadia;
        this.qtdseguranca = qtdseguranca;
        this.qtdcadeirasrec = qtdcadeirasrec;
    }

    public void pagou(){
        System.out.println("O cliente pagou a estadia.");
    }

    public void naoPagou(){
        System.out.println("O cliente nao pagou a estadia.");
    }
    @Override
    public String toString() {
        return "Recepcao{" +
                "qtdrecepcionista=" + qtdrecepcionista +
                ", custoestadia=" + precestadia +
                ", qtdseguranca=" + qtdseguranca +
                ", qtdcadeirasrec=" + qtdcadeirasrec +
                '}';
    }
}
