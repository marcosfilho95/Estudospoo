import java.util.ArrayList;

public class Supermercado {

    public static void main(String[] args) {
        Shampoo[] s1 = new Shampoo[2];
        s1[0].nome = "Jhonson";
        s1[1].preço = 10;
        s1[2].irritabilidadePele = 30;
        Biscoito[] b1 = new Biscoito[2];
        b1[0].nome = "Trakinas";
        b1[1].preço = 2;
        b1[2].componentesCancerigenos = 1;
        Leite[] l1 = new Leite[2];
        l1[0].nome = "Piracanjuba";
        l1[1].preço = 5;
        l1[2].durabilidadeLeite = 60;
        System.out.println(s1);
        System.out.println(b1);
        System.out.println(l1);
    }
}
