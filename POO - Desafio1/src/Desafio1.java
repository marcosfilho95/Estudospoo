import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        float ComprimentoPonte;
        Scanner prompt = new Scanner(System.in);
        System.out.println("Digite o comprimento da ponte entre 2 a 4 quilometros:");
        ComprimentoPonte = prompt.nextFloat();
        if(ComprimentoPonte < 2 || ComprimentoPonte > 4 ){
            System.out.println("Comprimento da ponte invalido.");
        }
        else{
            float AlturaHaste = ComprimentoPonte/20;
            float CaboSustent = AlturaHaste*5*1000;
            System.out.println("A quantidade de metros em cabo de aço para construir a ponte" +
                    " é: "+CaboSustent+" metros.");
        }
    }
    }
