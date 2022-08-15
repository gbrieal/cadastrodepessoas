package listapessoas;

import java.util.Comparator;

public class ListaAlfabetica implements Comparator<Pessoa> {

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        // TODO Auto-generated method stub
        return p1.getNome().compareTo(p2.getNome());
    }

}
