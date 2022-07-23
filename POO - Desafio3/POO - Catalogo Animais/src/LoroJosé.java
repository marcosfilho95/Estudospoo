import java.util.Scanner;

public class LoroJosé extends Aves implements AnimalDomestico{


    public LoroJosé(String nome, String raçaAve) {
        super(nome, raçaAve);
    }

    public void alaide (){
        int valorbico;
        if (valorbico = char) {

        }
    }
    public void TamanhoBico(){
        try{
            int tamanhodobico = 0;
            Scanner prompt = new Scanner(System.in);
            System.out.println("Digite o tamanho do bico do Loro Jose, lembrando que '1' e pequeno; '2' e medio e '3' e grande:");
            tamanhodobico = prompt.nextInt();
            if(tamanhodobico < 1 || tamanhodobico > 3){
                throw new MinhaExcecao2();
            }
            else{
                System.out.println("O tamanho do bico do Loro Jose e :"+tamanhodobico);
            }
        }catch (MinhaExcecao2 e){
            System.out.println(e);
            e.printStackTrace();
        }
    }
    public void Falar() {
        int cantarolar = 0;
        Scanner prompt = new Scanner(System.in);
        System.out.println("Digite 1 para o loro falar ou digite outra numero para ele nao falar");
        cantarolar = prompt.nextInt();

        if(cantarolar == 1){
            System.out.println("Loro Jose fala bastantee!");
        }
        else{
            System.out.println("Loro Jose fica caladinho");
        }
    }
    @Override
    public void brincar() {
        System.out.println("Loro José brinca");
    }

    @Override
    public void darBanho() {
        System.out.println("Loro José nao toma banho");
    }

    @Override
    public void levarPasseio() {
        System.out.println("Loro José não passeia");
    }

    @Override
    public void alimentar() {
        System.out.println("Loro José se alimenta");
    }

    @Override
    public void levarVeterinario() {
        System.out.println("Leva o Loro José para o veterinário");
    }

    @Override
    public void chamarVeterinario() {
        System.out.println("Liga para o veterinário");
    }

    @Override
    public void tomarvacinas() {
        System.out.println("Loro josé nao toma vacina");
    }

    @Override
    public void Voar() {
        System.out.println("Loro José não voa porque suas asas são aparadas.");
    }

    @Override
    public void Penas() {
        System.out.println("Loro José tem penas");
    }

    @Override
    public String toString() {
        return "LoroJosé{" +
                "nome='" + nome + '\'' +
                ", raçaAve='" + raçaAve + '\'' +
                '}';
    }
}
