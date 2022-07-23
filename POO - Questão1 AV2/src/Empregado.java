public class Empregado extends Pessoa{
    int codigoSetor;
    int salarioBase;
    float imposto;

    public Empregado(){

    }

    public void calcularSalario(){
        imposto = (salarioBase*10)/100;
        float salarioLiquido = salarioBase - imposto;
        System.out.println("O Salario ja descontado do imposto e: "+salarioLiquido);
    }

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public int getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(int salarioBase) {
        this.salarioBase = salarioBase;
    }

    public float getImposto() {
        return imposto;
    }

    public void setImposto(float imposto) {
        this.imposto = imposto;
    }

    @Override
    public String toString() {
        return "Empregado{" +
                "codigoSetor=" + codigoSetor +
                ", salarioBase=" + salarioBase +
                ", imposto=" + imposto +
                ", nome='" + nome + '\'' +
                ", endereço='" + endereço + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }

}
