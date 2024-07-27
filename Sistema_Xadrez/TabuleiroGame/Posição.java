package Sistema_Xadrez.TabuleiroGame;

public class Posição {
    private int linha;
    private int coluna;

    public Posição(){
    }
    public Posição(int linha,int coluna){
        this.coluna = coluna;
        this.linha = linha;
    }
    @Override
    public String toString(){
        return linha + ", " + coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }public int getColuna() {
        return coluna;
    }public void setLinha(int linha) {
        this.linha = linha;
    }public int getLinha() {
        return linha;
    }
}
