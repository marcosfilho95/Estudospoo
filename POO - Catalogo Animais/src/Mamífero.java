import java.util.Scanner;

public abstract class Mamífero{
    protected String nome;

    public Mamífero(String nome) {
        this.nome = nome;
    }

    public abstract void Amamentar();

    public abstract void placenta();

    public abstract void idadeAnimal();

    public void Peso(int massa, float gravidade){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



    @Override
    public String toString() {
        return "Mamífero{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public abstract void Peso();
}
