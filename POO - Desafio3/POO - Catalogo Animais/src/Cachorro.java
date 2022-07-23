import java.util.Scanner;

public class Cachorro extends Mamífero implements AnimalDomestico {
    protected String raçaCao;
    protected String tamanhoCao;

    public Cachorro(String nome, String raçaCao, String tamanhoCao) {
        super(nome);
        this.raçaCao = raçaCao;
        this.tamanhoCao = tamanhoCao;
    }


    public void idadeAnimal(){
        try{
            int idadedocao = 0;
            Scanner prompt = new Scanner(System.in);
            System.out.println("Digite a idade do Cachorro entre 0 e 20 anos:");
            idadedocao = prompt.nextInt();
            if(idadedocao < 0 || idadedocao > 20){
                throw new MinhaExcecao1();
            }
            else{
                System.out.println("A idade do Cachorro e de:"+idadedocao);
            }
        }catch (MinhaExcecao1 e){
            System.out.println(e);
            e.printStackTrace();
        }
    }
    @Override
    public void brincar() {
        System.out.println("Cachorro brinca muuuuito");
    }

    @Override
    public void darBanho() {
        System.out.println("Gato toma banho");
    }

    @Override
    public void levarPasseio() {
        System.out.println("Cachorro vai pra passear");
    }

    @Override
    public void alimentar() {
        System.out.println("Cachorro é alimentado");
    }

    @Override
    public void levarVeterinario() {
        System.out.println("Cachorro é levado para o veterinário");
    }

    @Override
    public void chamarVeterinario() {
        System.out.println("Liga para o veterinario");
    }

    @Override
    public void tomarvacinas() {
        System.out.println("Cachorro Toma vacina");
    }

    @Override
    public void Amamentar() {
        System.out.println("Cachorro amamenta");
    }

    @Override
    public void placenta() {
        System.out.println("Cachorro tem placenta");
    }

    public String getRaçaCao() {
        return raçaCao;
    }

    public void setRaçaCao(String raçaCao) {
        this.raçaCao = raçaCao;
    }

    public String getTamanhoCao() {
        return tamanhoCao;
    }

    public void setTamanhoCao(String tamanhoCao) {
        this.tamanhoCao = tamanhoCao;
    }

    public void Peso() {
        float massacachorro;
        Scanner prompt = new Scanner(System.in);
        System.out.println("Digite a massa do cachorro:");
        massacachorro = prompt.nextFloat();
        float gravidade = (float) 9.81;
        float pesoCachorro = (float) (massacachorro*gravidade);
        System.out.println("O peso do Cachorro e: "+pesoCachorro+" quilos.");
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "raçaCao='" + raçaCao + '\'' +
                ", tamanhoCao='" + tamanhoCao + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
