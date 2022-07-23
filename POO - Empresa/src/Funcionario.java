import java.util.Scanner;

public class Funcionario extends Cargo{
    int codigoCargo;
    String sexo;
    int qnthoraTrab;

    public Funcionario(int codigoCargo, String sexo, int qnthoraTrab) {
        super();
        this.codigoCargo = codigoCargo;
        this.sexo = sexo;
        this.qnthoraTrab = qnthoraTrab;
    }

    public void salarioFinal(){
        int prompt = new Scanner(System.in);
        System.out.println("Digite o valor da hora trabalhada:");
        float Salario = valorhoraTrab*qnthoraTrab
        if (sexo == "M"){
            Salario = Salario;
            System.out.println("Salario no final do dia do homem: "+Salario);
        }
        else if (sexo == "F"){
            Salario = (Salario+((Salario*20)/100));
            System.out.println("Salario no final do dia da mulher: "+Salario);
        }
    }

    public int getCodigoCargo() {
        return codigoCargo;
    }

    public void setCodigoCargo(int codigoCargo) {
        this.codigoCargo = codigoCargo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getQnthoraTrab() {
        return qnthoraTrab;
    }

    public void setQnthoraTrab(int qnthoraTrab) {
        this.qnthoraTrab = qnthoraTrab;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "codigoCargo=" + codigoCargo +
                ", sexo='" + sexo + '\'' +
                ", qnthoraTrab=" + qnthoraTrab +
                ", valorhoraTrab=" + valorhoraTrab +
                '}';
    }
}

