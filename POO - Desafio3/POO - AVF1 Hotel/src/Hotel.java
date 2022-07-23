public class Hotel {

    public static void main(String[] args) {

        Recepcao recepcao = new Recepcao(int qtdrecepcionista, double estadia, int qtdseguranca, int qtdcadeirasrec);
        System.out.println(recepcao);

        Banheiro banheiro = new Banheiro(int qtdbanheirosrec, int qtdbanheirosquart, String tipbanhei, int qtdbanheirochuv);
        System.out.println(banheiro);

        Quarto quarto = new Quarto(int numQuart, String tipoQuarto, int qtdbanheirosquarto);
        System.out.println(quarto);

        Cozinha cozinha = new Cozinha(int qtdcozinheiros, int qtdfogoes, int qtdpratos);
        System.out.println(cozinha);

        Refeitorio refeitorio = new Refeitorio(int qtdgarçons, int qtdmesas, int qtdrefeicoes, String tiporefeicao);
        System.out.println(refeitorio);
    }
}
