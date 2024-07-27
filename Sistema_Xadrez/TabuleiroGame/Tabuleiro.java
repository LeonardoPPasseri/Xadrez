package Sistema_Xadrez.TabuleiroGame;

public class Tabuleiro {
    private int linhas;
    private int colunas;
    private Peça[][] peças;

    public Tabuleiro(){
    }
    public Tabuleiro(int linhas,int colunas){
        this.colunas = colunas;
        this.linhas = linhas;
        peças = new Peça[linhas][colunas];
    }

    public Peça peças(int linha,int coluna){
        return peças[linha][coluna];
    }
    public Peça peças(Posição posição){
        return peças[posição.getLinha()][posição.getColuna()];
    }

    public void setColunas(int colunas) {
        this.colunas = colunas;
    }public int getColunas() {
        return colunas;
    }public void setLinhas(int linhas) {
        this.linhas = linhas;
    }public int getLinhas() {
        return linhas;
    }
}
