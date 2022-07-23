import java.util.Scanner;

public class Amiguinhos {
    public static void main(String[] args) {
        int num1;
        int num2;
        int div1 = 0;
        int div2 = 0;
        Scanner prompt = new Scanner(System.in);
        System.out.println("Digite um numero qualquer: ");
        num1 = prompt.nextInt();
        System.out.println("Digite outro numero qualquer: ");
        num2 = prompt.nextInt();
        for (int i = 1; i <= num1 / 2; i++) {
            if (num1 % i == 0) {
                div1 = div1 + i;
            }
        }
        for (int j = 1; j <=num2/2; j++){
            if(num2 % j == 0){
                div2 = div2 + j;
            }
        }
        if (num1 == div2 && num2 == div1){
            System.out.println("Os numeros: "+num1+" e "+num2
            +" sao amigos.");
        }
        else{
            System.out.println("Os numeros: "+num1+" e "+num2
                    +" nao sao amigos.");
        }
    }
}

