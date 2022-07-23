import java.util.Scanner;

public class TestarExcecao {

    public void idadeAnimal(){
        try{
            int idadedoanimal = 0;
            Scanner prompt = new Scanner(System.in);
            System.out.println("Digite a idade do animal entre 0 e 20 anos:");
            idadedoanimal = prompt.nextInt();
            if(idadedoanimal < 0 || idadedoanimal > 20){
                throw new IdadeErradaExcecao();
        }
            else{
                System.out.println("A idade do animal e :"+idadedoanimal);
            }
    }catch (IdadeErradaExcecao e){
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
