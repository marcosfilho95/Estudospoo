import java.text.DecimalFormat;
import java.util.Scanner;

public class Escada {
    public static void main(String[] args) {
        int AlturaPrego;
        int DistEscadaPared;
        DecimalFormat deci = new DecimalFormat("0");
        Scanner prompt = new Scanner(System.in);
        System.out.println("Digite a altura do prego (em cm): ");
        AlturaPrego = prompt.nextInt();
        System.out.println("Digite a distancia do pé escada até a parede (em cm): ");
        DistEscadaPared = prompt.nextInt();

        float TamanhoEscada = (float) Math.sqrt((AlturaPrego*AlturaPrego)+(DistEscadaPared*DistEscadaPared));
        float QtdDegraus = TamanhoEscada/30;
        System.out.println("A quantidade de degraus que a escada precisa para alcançar" +
                "o prego é: "+deci.format(QtdDegraus));
    }
}
