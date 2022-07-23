import java.util.Scanner;

public class Conversor {

    public Conversor() {
    }

    public static void Binario() {
        String binario = "";
        Scanner prompt = new Scanner(System.in);
        int numero;
        System.out.println("Digite um numero Decimal Positivo: ");
        numero = prompt.nextInt();
        while (numero!=0) {
            if (numero % 2 == 0) {
                binario = "0" + binario;
            } else {
                binario = "1" + binario;
            }
            numero = numero / 2;

        }
        System.out.println("O numero em binario e: " + binario);
    }

    @Override
    public String toString() {
        return "Conversor{}";
    }
}
