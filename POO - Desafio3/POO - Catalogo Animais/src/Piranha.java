public class Piranha extends Peixe implements AnimalSelvagem {

    public void tipoPeixe(){
        System.out.println("Piranha e um peixe carnivoro");
    }

    @Override
    public void caçar() {
        System.out.println("Piranha caça");
    }

    @Override
    public void reproduzir() {
        System.out.println("Piranha se reproduz");
    }

    @Override
    public void sobreviver() {
        System.out.println("Piranha sobrevive por si so");
    }

    @Override
    public String toString() {
        return "Piranha{" +
                "nome='" + nome + '\'' +
                ", raçapeixe='" + raçapeixe + '\'' +
                '}';
    }
}


