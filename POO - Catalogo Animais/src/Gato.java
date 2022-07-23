import java.util.Scanner;

public  class Gato extends Mamífero implements AnimalDomestico {
    protected String raçaGato;

    public Gato(String nome, String raçaGato) {
        super(nome);
        this.raçaGato = raçaGato;
    }

    @Override
    public void idadeAnimal() {
        try{
            int idadedogato = 0;
            Scanner prompt = new Scanner(System.in);
            System.out.println("Digite a idade do Gato entre 0 e 20 anos:");
            idadedogato = prompt.nextInt();
            if(idadedogato < 0 || idadedogato > 20){
                throw new MinhaExcecao1();
            }
            else{
                System.out.println("A idade do Gato e de:"+idadedogato);
            }
        }catch (MinhaExcecao1 e){
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @Override
    public void brincar() {
        System.out.println("Gato brinca");
    }

    @Override
    public void darBanho() {
        System.out.println("Gato toma banho");
    }

    @Override
    public void levarPasseio() {
        System.out.println("Gato vai pra passear");
    }

    @Override
    public void alimentar() {
        System.out.println("Gato é alimentado");
    }

    @Override
    public void levarVeterinario() {
        System.out.println("Gato é levado para o veterinário");
    }

    @Override
    public void chamarVeterinario() {
        System.out.println("Liga para o veterinario");
    }

    @Override
    public void tomarvacinas() {
        System.out.println("Toma vacina");
    }

    @Override
    public void Amamentar() {
        System.out.println("Gato amamenta");
    }

    @Override
    public void placenta() {
        System.out.println("Gato tem placenta");
    }

    public String getRaçaGato() {
        return raçaGato;
    }

    public void setRaçaGato(String raçaGato) {
        this.raçaGato = raçaGato;
    }

    @Override
    public String toString() {
        return "Gato{" + super.toString() +
                "raçaGato='" + raçaGato + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }

    @Override
    public void Peso() {
        float massagato;
        Scanner prompt = new Scanner(System.in);
        System.out.println("Digite a massa do gato:");
        massagato = prompt.nextFloat();
        float gravidade = (float) 9.81;
        float pesoGato = (float) (massagato*gravidade);
        System.out.println("O peso do gato e: "+pesoGato+" quilos.");

    }
}
