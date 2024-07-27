package Sistema_Xadrez.TabuleiroGame;

public class Tabuleiro {
    private int linhas;
    private int colunas;
    private Peças[][] peças;

    public Tabuleiro(){
    }
    public Tabuleiro(int linhas,int colunas){
        this.colunas = colunas;
        this.linhas = linhas;
        peças = new Peças[linhas][colunas];
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
