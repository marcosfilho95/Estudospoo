import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.ArrayList;

public class Canil {
    protected ArrayList<Cachorro> listacaes = new ArrayList<Cachorro>();

    public void adicionarCachorro(Cachorro cao) {
        listacaes.add(cao);
    }

    public Cachorro getListacaes(String nome) {
        for (Cachorro cachorro : listacaes) {
            if (cachorro.getNome().equals(nome)) {
                return cachorro;
            }
        }
        return null;
    }

    public String informacaocao(String nome){
        return "Nome: " + getListacaes(nome).getNome()+"\nRaça: "+ getListacaes(nome).getRaçaCao() + "\nTamanho: "+getListacaes(nome).getTamanhoCao();
    }
}
