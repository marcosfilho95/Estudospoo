public class Quarto {
    int numQuart;
    String tipoQuarto;
    int qtdbanheirosquarto;

    public Quarto(int numQuart, String tipoQuarto, int qtdbanheirosquarto) {
        this.numQuart = numQuart;
        this.tipoQuarto = tipoQuarto;
        this.qtdbanheirosquarto = qtdbanheirosquarto;
    }

    public void temFrigobar(){
        System.out.println("O Quarto tem frigobar.");
    }

    public void naotemFrigobar(){
        System.out.println(("O quarto nao tem frigobar."));
    }

    @Override
    public String toString() {
        return "Quarto{" +
                "numQuart=" + numQuart +
                ", tipoQuarto='" + tipoQuarto + '\'' +
                ", qtdbanheirosquarto=" + qtdbanheirosquarto +
                '}';
    }
}
