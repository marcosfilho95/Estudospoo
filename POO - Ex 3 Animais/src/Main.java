public class Main {



    public static void main(String[] args) {

        Peixe p1 = new Peixe();
        p1.nome = "Beulus";
        p1.peso = 5;
        p1.tipoHabitat = "Agua Doce";
        System.out.println(p1.toString());

        Cachorro c1 = new Cachorro();
        c1.nome = "Spyke";
        c1.peso = 12;
        c1.raça = "Border Collie";

        System.out.println(c1.toString());
    }
}
