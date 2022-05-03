import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main (String []args){

        Clube flamengo = new Clube("Clube de Regatas do Flamengo");

        ArrayList<Jogador> listFla = new ArrayList<Jogador>();
        listFla.add(new Jogador("Gab"));
        listFla.add(new Jogador("Bruno Henrique"));
        listFla.add(new Jogador("Arrasca"));
        listFla.add(new Jogador("Ribeiro"));

        flamengo.setJogadores(listFla);



    }
}
