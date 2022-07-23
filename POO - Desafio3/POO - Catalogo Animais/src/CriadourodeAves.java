import java.util.ArrayList;

public class CriadourodeAves {

        protected ArrayList<Aves> listaaves = new ArrayList<Aves>();

        public void adicionarAves(Aves aves ) {
            listaaves.add(aves);
        }

        public Aves getListaaves(String nome) {
            for (Aves aves : listaaves) {
                if (aves.getNome().equals(nome)) {
                    return aves;
                }
            }
            return null;
        }

        public String informacaoave(String nome){
            return "Nome: " + getListaaves(nome).getNome()+"\nRaça: "+ getListaaves(nome).getRaçaAve();
        }
    }
