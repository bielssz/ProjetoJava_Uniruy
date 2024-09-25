import java.util.ArrayList;

public class Tabuleiro {
    private ArrayList<Peca> pecasJogadas;

    public Tabuleiro() {
        this.pecasJogadas = new ArrayList<>();
    }

    public void adicionarPeca(Peca peca) {
        pecasJogadas.add(peca);
    }

    public Peca getUltimaPeca() {
        return pecasJogadas.isEmpty() ? null : pecasJogadas.get(pecasJogadas.size() - 1);
    }

    public void mostrarTabuleiro() {
        System.out.println("Tabuleiro: " + pecasJogadas);
    }
}
