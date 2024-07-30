package Sistema_Xadrez.XadrezGame;

import Sistema_Xadrez.TabuleiroGame.Posição;
import Sistema_Xadrez.TabuleiroGame.Tabuleiro;
import Sistema_Xadrez.XadrezGame.PeçasDoXadrez.King;
import Sistema_Xadrez.XadrezGame.PeçasDoXadrez.Torre;

public class PartidaDeXadrez {
    private Tabuleiro tabuleiro;

    public PartidaDeXadrez(){
        tabuleiro = new Tabuleiro(8,8);
        iniciarXadrez();
    }
    
    public PeçaDeXadrez[][] getPeças(){
        PeçaDeXadrez[][] mat = new PeçaDeXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
        for(int i=0; i<tabuleiro.getLinhas();i++){
            for (int j = 0; j < tabuleiro.getColunas(); j++) {
                mat[i][j] = (PeçaDeXadrez)tabuleiro.peças(i,j);
            }
        }
        return mat; 
    }

    private void iniciarXadrez(){
        tabuleiro.lugarPeça(new Torre(tabuleiro, Cor.BRANCO),new Posição(0,0));
        tabuleiro.lugarPeça(new Torre(tabuleiro, Cor.BRANCO),new Posição(0,7));
        tabuleiro.lugarPeça(new King(tabuleiro, Cor.BRANCO), new Posição(0,4));
    }
}
