import java.util.Scanner;

public  class Calopsita extends Aves implements AnimalDomestico{

    public Calopsita(String nome, String raçaAve) {
        super(nome, raçaAve);
    }

    public void TamanhoBico(){
        try{
            int tamanhodobico = 0;
            Scanner prompt = new Scanner(System.in);
            System.out.println("Digite o tamanho do bico da Calopsita, lembrando que '1' e pequeno; '2' e medio e '3' e grande:");
            tamanhodobico = prompt.nextInt();
            if(tamanhodobico < 1 || tamanhodobico > 3){
                throw new MinhaExcecao2();
            }
            else{
                System.out.println("O tamanho do bico da Calopsita e :"+tamanhodobico);
            }
        }catch (MinhaExcecao2 e){
            System.out.println(e);
            e.printStackTrace();
        }
    }

    public void Falar(){
        System.out.println("Calopsita nao fala");
    }

    @Override
    public void brincar() {
        System.out.println("Calopsita brinca");
    }

    @Override
    public void darBanho() {
        System.out.println("Calopsita nao toma banho");
    }

    @Override
    public void levarPasseio() {
        System.out.println("Calopsita nao vai passear");
    }

    @Override
    public void alimentar() {
        System.out.println("Calopsita é alimentado");
    }

    @Override
    public void levarVeterinario() {
        System.out.println("Calopsita é levado para o veterinário");
    }

    @Override
    public void chamarVeterinario() {
        System.out.println("Liga para o veterinario");
    }

    @Override
    public void tomarvacinas() {
        System.out.println("Calopsita nao vacina");
    }

    @Override
    public void Voar() {
        System.out.println("Calopsita não voa porque suas asas são aparadas.");
    }

    @Override
    public void Penas() {
        System.out.println("Calopsita tem penas");
    }

    @Override
    public String toString() {
        return "Calopsita{" +
                "nome='" + nome + '\'' +
                ", raçaAve='" + raçaAve + '\'' +
                '}';
    }
}
