package Sistema_Xadrez.TabuleiroGame;

public class Peça {
    protected Posição posição;
    private Tabuleiro tabuleiro;

    public Peça(){}
    public Peça(Tabuleiro tabuleiro){
        this.tabuleiro = tabuleiro;
        posição = null;
    }

    protected Tabuleiro getTabuleiro() {
        return tabuleiro;
    }
}
