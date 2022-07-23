import java.util.ArrayList;

public class EstudoAnimais {
    public static void main(String[] args) throws Exception {

        Gato gato1 = new Gato("Pedrinho", "Persa");
        gato1.idadeAnimal();
        gato1.Peso();
        gato1.brincar();
        gato1.tomarvacinas();
        System.out.println(gato1);

        Cachorro cao1 = new Cachorro("Snow", "Westie", "Medio");
        cao1.idadeAnimal();
        cao1.Peso();
        cao1.alimentar();
        cao1.levarPasseio();
        cao1.brincar();
        System.out.println(cao1);

        Cachorro cao2 = new Cachorro("Bill", "Pastor Alemao", "Grande");
        System.out.println(cao2);


        Calopsita calo1[] =     new Calopsita[1];
        calo1[0] = new Calopsita("Zeca", "Cara Branca-Lutino");
        calo1[0].TamanhoBico();
        calo1[0].Voar();
        calo1[0].Penas();
        calo1[0].tomarvacinas();
        calo1[0].Falar();
        System.out.println(calo1[0].toString());

        LoroJosé loro1[] = new LoroJosé[1];
        loro1[0] = new LoroJosé("Ximbinha", "Papagaio");
        loro1[0].TamanhoBico();
        loro1[0].Falar();
        loro1[0].darBanho();
        loro1[0].Voar();
        System.out.println(loro1[0].toString());

        Piranha pir1 = new Piranha();
        pir1.nome = "Klebao";
        pir1.raçapeixe = "Piranha Vermelha";
        pir1.reproduzir();
        pir1.caçar();
        pir1.sobreviver();
        pir1.tipoPeixe();
        System.out.println(pir1);

        Baleia bale1 = new Baleia("Willye", "Azul");
        bale1.idadeAnimal();
        System.out.println(bale1);

        Canil canil1 = new Canil();
        canil1.adicionarCachorro(cao1);
        canil1.adicionarCachorro(cao2);
        System.out.println(canil1.informacaocao("Snow"));
        System.out.println(canil1.informacaocao("Bill"));

        CriadourodeAves aves1 = new CriadourodeAves();
        aves1.adicionarAves(calo1[0]);
        aves1.adicionarAves(loro1[0]);
        System.out.println(aves1.informacaoave("Zeca"));
        System.out.println(aves1.informacaoave("Ximbinha"));

    }
}

