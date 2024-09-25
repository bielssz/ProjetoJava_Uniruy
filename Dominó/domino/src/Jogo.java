import java.util.ArrayList;
import java.util.Collections;

public class Jogo {
    private ArrayList<Peca> pecas;
    private ArrayList<Jogador> jogadores;
    private Tabuleiro tabuleiro;

    public Jogo() {
        this.pecas = criarTodasPecas();
        this.jogadores = new ArrayList<>();
        this.tabuleiro = new Tabuleiro();
    }

    public void adicionarJogador(Jogador jogador) {
        jogadores.add(jogador);
    }

    // Método que cria todas as peças de dominó
    private ArrayList<Peca> criarTodasPecas() {
        ArrayList<Peca> pecas = new ArrayList<>();
        for (int i = 0; i <= 6; i++) {
            for (int j = i; j <= 6; j++) {
                pecas.add(new Peca(i, j));
            }
        }
        return pecas;
    }

    // Método para embaralhar e distribuir as peças
    public void distribuirPecas() {
        Collections.shuffle(pecas);
        int numJogadores = jogadores.size();
        for (int i = 0; i < pecas.size(); i++) {
            jogadores.get(i % numJogadores).adicionarPeca(pecas.get(i));
        }
    }

    public void iniciar() {
        // Aqui você pode implementar a lógica para começar o jogo
        System.out.println("Iniciando o jogo...");
        distribuirPecas();

        for (Jogador jogador : jogadores) {
            jogador.mostrarPecas();
        }
    }
}
