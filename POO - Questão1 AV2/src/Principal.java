public class Principal {

    public static void main(String[] args) {
        Fornecedor f1 = new Fornecedor();
        f1.nome = "Adalberto";
        f1.endereço = "Rua 4";
        f1.telefone = "99987-4535";
        f1.valorCredito = 5500;
        f1.valorDivida = 4000;
        System.out.println(f1);
        f1.obterSaldo(f1);

        Empregado e1 = new Empregado();
        e1.codigoSetor = 2;
        e1.salarioBase = 1500;
        e1.imposto = 10;
        System.out.println(e1);
        e1.calcularSalario();

        Administrador admin1 = new Administrador();
        admin1.salarioBase = 2000;
        admin1.ajudadeCustos = 1000;
        admin1.imposto = 10;
        System.out.println(admin1);
        admin1.calcularSalario();

    }
}
