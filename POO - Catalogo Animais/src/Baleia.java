import java.util.Scanner;

public class Baleia extends Mamífero implements AnimalSelvagem{
    protected String raçaBaleia;

    public Baleia(String nome, String raçaBaleia) {
        super(nome);
        this.raçaBaleia = raçaBaleia;
    }

    public void idadeAnimal(){
        try{
            int idadedabaleia = 0;
            Scanner prompt = new Scanner(System.in);
            System.out.println("Digite a idade da Baleia entre 0 e 100 anos:");
            idadedabaleia = prompt.nextInt();
            if(idadedabaleia < 0 || idadedabaleia > 100){
                throw new MinhaExcecao1();
            }
            else{
                System.out.println("A idade da Baleia e de:"+idadedabaleia);
            }
        }catch (MinhaExcecao1 e){
            System.out.println(e);
            e.printStackTrace();
        }
    }

    public  void Amamentar(){
        System.out.println("Baleia Amamenta");
    }

    public  void placenta(){
        System.out.println("Baleia tem placenta");
    }

    @Override
    public void Peso() {

    }

    public void caçar() {
        System.out.println("Baleia caça sua comida");
    }
    public void reproduzir() {
        System.out.println("Baleia se reproduz");
    }
    public void sobreviver() {
        System.out.println("Baleia precisa sobreviver a ameaças e predadores no seu habitat");
    }


}
