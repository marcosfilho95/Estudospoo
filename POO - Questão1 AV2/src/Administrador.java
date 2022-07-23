public class Administrador extends Empregado {
    int ajudadeCustos;

    public Administrador(){

    }

    public void calcularSalario(){
        imposto = (salarioBase*10)/100;
        float salarioliquidoAdmin = (salarioBase - imposto) + ajudadeCustos;
        System.out.println("O salario de um Administrador com a ajuda de custos e de :"+salarioliquidoAdmin);
    }

    public int getAjudadeCustos() {
        return ajudadeCustos;
    }

    public void setAjudadeCustos(int ajudadeCustos) {
        this.ajudadeCustos = ajudadeCustos;
    }

    @Override
    public String toString() {
        return "Administrador{" +
                "ajudadeCustos=" + ajudadeCustos +
                ", codigoSetor=" + codigoSetor +
                ", salarioBase=" + salarioBase +
                ", imposto=" + imposto +
                ", nome='" + nome + '\'' +
                ", endereço='" + endereço + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
