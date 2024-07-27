package Sistema_Xadrez.XadrezGame;

import Sistema_Xadrez.TabuleiroGame.Peça;
import Sistema_Xadrez.TabuleiroGame.Tabuleiro;

public class PeçaDeXadrez extends Peça {
    private Cor cor;
    
    public PeçaDeXadrez(){
        super();
    }
    public PeçaDeXadrez(Tabuleiro tabuleiro,Cor cor){
        super(tabuleiro);
        this.cor = cor;
    }

    public Cor getCor() {
        return cor;
    }
}
