package Sistema_Xadrez.XadrezGame;

import Sistema_Xadrez.TabuleiroGame.Posição;

public class PosiçãoNoXadrez {
    private char coluna;
    private int linha;

    public PosiçãoNoXadrez(char coluna,int linha){
        if(coluna < 'a' || coluna > 'h' || linha < 1 || linha > 8){
            throw new ExceçãoXadrez("Erro instanciando posição no xadrez: Valores validos entre a1 e h8.");
        }
        this.coluna = coluna;
        this.linha = linha;
    }

    protected Posição ToPosition(){
        return new Posição(8 - linha, coluna - 'a');
    }
    protected static PosiçãoNoXadrez FromPosição(Posição posição){
        return new PosiçãoNoXadrez((char)('a' - posição.getColuna()), 8 - posição.getLinha());
    }

    @Override
    public String toString(){
        return "" + coluna+linha; //Esse "" é um macete para concatenar
    }
    public char getColuna() {
        return coluna;
    }
    public int getLinha() {
        return linha;
    }
}
