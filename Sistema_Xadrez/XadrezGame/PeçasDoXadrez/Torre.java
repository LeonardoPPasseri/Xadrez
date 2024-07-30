package Sistema_Xadrez.XadrezGame.PeçasDoXadrez;

import Sistema_Xadrez.TabuleiroGame.Tabuleiro;
import Sistema_Xadrez.XadrezGame.Cor;
import Sistema_Xadrez.XadrezGame.PeçaDeXadrez;

public class Torre extends PeçaDeXadrez{
    
    public Torre(Tabuleiro tabuleiro, Cor cor){
        super(tabuleiro,cor);
    }
    @Override
    public String toString(){
        return "T";
    }
}
