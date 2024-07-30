package Sistema_Xadrez.TabuleiroGame;

public class Tabuleiro {
    private int linhas;
    private int colunas;
    private Peça[][] peças;

    public Tabuleiro(){
    }
    public Tabuleiro(int linhas,int colunas){
        if(linhas < 1 || colunas < 1){
            throw new ExceçãoTabuleiro("Erro na Criação do tabuleiro: O tabuleiro deve ter pelo menos 1 linha e 1 coluna");
        }
        this.colunas = colunas;
        this.linhas = linhas;
        peças = new Peça[linhas][colunas];
    }

    public Peça peças(int linha,int coluna){
        if(!existePosição(linha,coluna)){
            throw new ExceçãoTabuleiro("Posição inexistente no tabuleiro");
        }
        return peças[linha][coluna];
    }
    public Peça peças(Posição posição){
        if(!existePosição(posição)){
            throw new ExceçãoTabuleiro("Posição inexistente no tabuleiro");
        }
        return peças[posição.getLinha()][posição.getColuna()];
    }
    public void lugarPeça(Peça peça, Posição posição){
        if(temUmaPeça(posição)){
            throw new ExceçãoTabuleiro("Ja existe uma peça na posição (" + posição + ")");
        }
        peças[posição.getLinha()][posição.getColuna()] = peça;
        peça.posição = posição;
    }


    public boolean existePosição(int linha,int coluna){
        return linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas;
                
    }
    public boolean existePosição(Posição posição){
        return existePosição(posição.getLinha(),posição.getColuna());
    }
    public boolean temUmaPeça(Posição posição){
        if(!existePosição(posição)){
            throw new ExceçãoTabuleiro("Posição inexistente no tabuleiro");
        }
        return peças(posição) != null;
    }


   
    public int getColunas() {
        return colunas;
    }public int getLinhas() {
        return linhas;
    }
}
