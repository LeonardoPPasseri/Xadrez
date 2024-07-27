package Sistema_Xadrez.TabuleiroGame;

public class Peças {
    protected Posição posição;
    private Tabuleiro tabuleiro;

    public Peças(){}
    public Peças(Tabuleiro tabuleiro){
        this.tabuleiro = tabuleiro;
        posição = null;
    }

    protected Tabuleiro getTabuleiro() {
        return tabuleiro;
    }
}
