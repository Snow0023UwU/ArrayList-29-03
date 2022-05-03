import java.util.ArrayList;

public class Clube {
    //atributos
    private String nome;
    private ArrayList<Jogador> jogadores;

    //construtor
    public Clube(String nome) {
        this.nome = nome;
    }

    //getters and setters
    public ArrayList<Jogador> getJogadores() {
        return jogadores;
    }
    public void setJogadores(ArrayList<Jogador> jogadores) {
        this.jogadores = jogadores;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
